package com.example.root.mysqlitedemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by root on 2016/11/28.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "wirelessqa.db";

    public static final String DB_TABLE_NAME = "info";

    private static final int DB_VERSION=1;

    public DBHelper(Context context ) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS info" +
                "(_id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, age INTEGER, website STRING,weibo STRING)");

        Log.i(TAG, "create table");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        Log.i("WIRELESSQA", "update sqlite "+oldVersion+"---->"+newVersion);
    }
}
