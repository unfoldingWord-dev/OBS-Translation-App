package org.door43.obs.mta.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.door43.obs.mta.model.IPersistenceObject;

import java.util.Date;

public abstract class AbstractDBHelper extends SQLiteOpenHelper {

	/* CONSTANTS */

    /* FIELDS */

    /* CONSTRUCTORS */

    public AbstractDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public AbstractDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    /* METHODS */

    public void checkBeforeSave(IPersistenceObject object) {

        if (object == null) {
            return;
        }

        Date now = new Date();

        if (object.getCreated() == null) {
            object.setCreated(now);
        }

        object.setModified(now);

    }

    public void putDateValue(ContentValues contentValues, String paramName, Date date) {

        if (date == null) {
            contentValues.put(paramName, "null");
        } else {
            contentValues.put(paramName, date.getTime());
        }

    }

    public Date getDate(Cursor cur, String column) {

        if (cur == null || column == null) {
            return null;
        }

        int columnIndex = cur.getColumnIndex(column);

        if (columnIndex == -1) {
            return null;
        }

        return new Date(cur.getLong(columnIndex));
    }

    public boolean doesExists(String tableName, String column, Long id) {

        SQLiteDatabase db = getReadableDatabase();

        Cursor cur = db.query(tableName, new String[]{column},
                column + " = ?",
                new String[]{String.valueOf(id)},
                null, null, null);

        return (cur != null && cur.moveToFirst());

    }

    /* GETTERS AND SETTERS */

    /* OBJECT METHODS */

}
