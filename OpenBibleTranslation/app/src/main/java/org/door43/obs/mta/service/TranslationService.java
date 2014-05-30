package org.door43.obs.mta.service;

import static org.door43.obs.mta.db.ConstTranslations.*;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import org.door43.obs.mta.db.TranslationDBHelper;
import org.door43.obs.mta.model.IText;
import org.door43.obs.mta.model.ITranslation;
import org.door43.obs.mta.model.ITranslationNotes;
import org.door43.obs.mta.model.Translation;

/**
 * Default implementation of {@link ITranslationService}
 */
public class TranslationService implements ITranslationService {

	/* CONSTANTS */

    /* FIELDS */

    private Context context;

    private TranslationDBHelper helper;

    /* CONSTRUCTORS */

    public static TranslationService getInstance(Context context) {
        return new TranslationService(context);
    }

    private TranslationService(Context context) {
        this.context = context;
        helper = new TranslationDBHelper(context);
    }

    /* METHODS */

    @Override
    public ITranslation loadTranslation(String frameId, String langCode) {

        ITranslation translation = null;

        try {
            SQLiteDatabase db = helper.getWritableDatabase();

            final String where = A_FRAME + " = ? and " + A_LANG_CODE + " = ?";
            Cursor cur = db.query(TABLE_NAME, new String[]{"*"},
                    where,
                    new String[]{frameId, langCode}, null, null, null);


            if (cur.moveToFirst()) {
                translation = createTranslation(cur);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return translation;
    }

    @Override
    public boolean saveTranslation(ITranslation translation) {

        long result = -1;

        try {

            helper.checkBeforeSave(translation);

            SQLiteDatabase db = helper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(A_ID, translation.getId());
            helper.putDateValue(values, A_CREATED, translation.getCreated());
            helper.putDateValue(values, A_MODIFIED, translation.getModified());
            values.put(A_FRAME, translation.getFrameId());
            values.put(A_LANG_CODE, translation.getLangCode());
            values.put(A_TEXT, translation.getText());

            boolean exists = helper.doesExists(TABLE_NAME, A_ID, translation.getId());

            if (exists) {
                result = db.update(TABLE_NAME, values,
                        A_ID + " = ?", // query: where ID = ?id
                        new String[]{String.valueOf(translation.getId())}); // query parameter value
            } else {
                result = db.insert(TABLE_NAME, null, values);
            }

            if (result != -1) {
                ITranslation dbTranslation = loadTranslation(translation.getFrameId(), translation.getLangCode());
                copyTranslation(dbTranslation, translation); // so id and other potential values are updated
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result != -1;
    }

    @Override
    public IText loadOriginalText(String frameId, String langCode) {
        return null;
    }

    @Override
    public ITranslationNotes loadTranslationNotes(String frameId) {
        return null;
    }

    public void close() {
        if (helper != null) {
            helper.close();
        }
    }

    /* PRIVATE METHODS */

    /**
     * Creates {@link org.door43.obs.mta.model.ITranslation} object from passed DB cursor.
     * @param cur
     * @return
     */
    private ITranslation createTranslation(Cursor cur) {

        ITranslation trans = new Translation();

        trans.setId(cur.getLong(cur.getColumnIndex(A_ID)));
        trans.setCreated(helper.getDate(cur, A_CREATED));
        trans.setModified(helper.getDate(cur, A_MODIFIED));

        trans.setFrameId(cur.getString(cur.getColumnIndex(A_FRAME)));
        trans.setLangCode(cur.getString(cur.getColumnIndex(A_LANG_CODE)));
        trans.setText(cur.getString(cur.getColumnIndex(A_TEXT)));

        return trans;
    }

    /**
     * Copy values from-to passed {@linkplain org.door43.obs.mta.model.ITranslation} objects.
     * @param source
     * @param target
     */
    private void copyTranslation(ITranslation source, ITranslation target) {

        if (source == null || target == null) {
            return;
        }

        target.setId(source.getId());
        target.setCreated(source.getCreated());
        target.setModified(source.getModified());

        target.setFrameId(source.getFrameId());
        target.setLangCode(source.getLangCode());
        target.setText(source.getText());
    }

    /* GETTERS AND SETTERS */

    /* OBJECT METHODS */

}
