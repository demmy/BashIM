package ua.dp.kulish.bashim.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * This file is part of BashIM project
 * Copyright (C) 2013
 *
 * @author Denis K
 * @version 0.1
 *          created      05.08.13
 */
public class DBConnector implements IDBHelper {

    private SQLiteDatabase mDatabase;

    public DBConnector(Context _context) {
        DbOpenHelper mOpenHelper = new DbOpenHelper(_context);
        mDatabase = mOpenHelper.getWritableDatabase();
    }

    private class DbOpenHelper extends SQLiteOpenHelper {

        private DbOpenHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String query = "CREATE TABLE " + QUOTES_TABLE_NAME + " (" +
                    COL_QUOTES_ID + " INTEGER PRIMARY KEY " +
                    COL_QUOTES_RATING + " INTEGER " +
                    COL_QUOTES_TEXT + " TEXT, " +
                    COL_QUOTES_FAV + " BOOLEAN); ";
            db.execSQL(query);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + QUOTES_TABLE_NAME);
            onCreate(db);
        }
    }
}
