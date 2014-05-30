package org.door43.obs.mta.db;

import static org.door43.obs.mta.db.ConstTranslations.*;
import static org.door43.obs.mta.db.ConstTranslations.A_CREATED;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TranslationDBHelper extends AbstractDBHelper {

	/* CONSTANTS */

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "mta";

    /* FIELDS */

    /* CONSTRUCTORS */


    public TranslationDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /* METHODS */

    @Override
    public void onCreate(SQLiteDatabase db) {

        // SQL statement to create translation table
        String CREATE_TRANSLATION_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " +
                A_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                A_CREATED + " TIMESTAMP, " +
                A_MODIFIED + " TIMESTAMP, " +
                A_FRAME + " TEXT, " +
                A_LANG_CODE + " TEXT, " +
                A_TEXT + " TEXT )";

        // create books table
        db.execSQL(CREATE_TRANSLATION_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {

    }

    /* GETTERS AND SETTERS */

    /* OBJECT METHODS */

}
