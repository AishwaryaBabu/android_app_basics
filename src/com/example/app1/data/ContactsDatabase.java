package com.example.app1.data;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ContactsDatabase extends SQLiteOpenHelper {
	
	public ContactsDatabase(Context context) {
		super(context, "DemoDB", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		StringBuilder builder=new StringBuilder();
		
		builder.setLength(0);
		builder.append("CREATE VIRTUAL TABLE NAMES USING FTS3");
		builder.append("(");
		builder.append("name TEXT) ");		
		db.execSQL(builder.toString());
		builder=new StringBuilder();

		//dummy  data
		InsertData(db);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	
	 void InsertData(SQLiteDatabase db)
	 {
		 ContentValues cv=new ContentValues();
			 cv=new ContentValues();
				cv.put("name","John");
				db.insert("NAMES", "name", cv);
				cv.put("name","Jack");
				db.insert("NAMES", "name", cv);
				cv.put("name","Ann");
				db.insert("NAMES", "name", cv);
				cv.put("name","Adam");
				db.insert("NAMES", "name", cv);
				cv.put("name","Sarah");
				db.insert("NAMES", "name", cv);

	 } 
		public ArrayList<String> GetNames(){
			ArrayList<String> names=new ArrayList<String>();
			Cursor c=this.getReadableDatabase().rawQuery("select * FROM Names", null);
			while(c.moveToNext()){
				String name=c.getString(0);
				names.add(name);
			}
			c.close();
			return names;
		}

}
