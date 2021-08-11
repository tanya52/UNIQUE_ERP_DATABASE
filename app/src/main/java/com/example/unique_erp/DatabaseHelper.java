package com.example.unique_erp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "UniqueDataRegistration";
    public static final String CONTACTS_TABLE_NAME = "RegistrationDetails";
    public DatabaseHelper(Context context) {
        super(context,DATABASE_NAME,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table "+ CONTACTS_TABLE_NAME +"(id integer primary key, name text,email text, course text, mobile text)"
        );
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+CONTACTS_TABLE_NAME);
        onCreate(db);
    }
    public boolean insert(String name, String email, String course, String mobile) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("email", email);
        contentValues.put("course", course);
        contentValues.put("mobile", mobile);
        db.insert(CONTACTS_TABLE_NAME, null, contentValues);
        return true;
    }
}