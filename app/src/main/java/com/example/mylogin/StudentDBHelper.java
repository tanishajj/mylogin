package com.example.mylogin;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class StudentDBHelper extends SQLiteOpenHelper {

    ContentValues values;
    SQLiteDatabase db;

    private static final int DATABASE_VERSION = 1;
    public static final String DB_NAME = "Student_Form.db";

    public StudentDBHelper(Context context) {
        super(context, DB_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Data.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Data.TABLE_NAME);
        onCreate(db);
    }
    public void insertData(String id) {
        db = this.getWritableDatabase();
        values.put(Data.COLUMN_ID, id);
        db.insert(Data.TABLE_NAME, null, values);
        db.close();
    }
    public void updateData(Data id) {
        db = this.getWritableDatabase();
        values.put(Data.COLUMN_ID, id.getId());
        db.update(Data.TABLE_NAME, values, Data.COLUMN_ID + " = ?", new String[]{String.valueOf(id.getId())});
    }
    public void deleteData(Data id) {
        db = this.getWritableDatabase();
        db.delete(Data.TABLE_NAME, Data.COLUMN_ID + " = ?",
                new String[]{String.valueOf(id.getId())});
        db.close();
    }
}
