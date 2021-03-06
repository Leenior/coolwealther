package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	/**
	* Province表建表语句
	*/
	public static final String CREATE_PROVINCE = "create table Province (" +
			"id integer primary key autoincrement," +
			"name text," +
			"code text)";
	
	/**
	* City表建表语句
	*/
	public static final String CREATE_CITY = "create table City (" +
			"id integer primary key autoincrement, " +
			"name text," +
			"code text," +
			"province_id integer)";
	
	/**
	* County表建表语句
	*/
	public static final String CREATE_COUNTRY = "create table County (" +
			"id integer primary key autoincrement," +
			"name text," +
			"code text," +
			"city_id integer)";


	public CoolWeatherOpenHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE); // 创建Province表
		db.execSQL(CREATE_CITY); // 创建City表
		db.execSQL(CREATE_COUNTRY);// 创建County表
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}
	

}
