package com.example.app1;

import java.util.ArrayList;

import com.example.app1.data.ContactsDatabase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Contacts extends Activity{
	
	private ListView list;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.contacts);
	    list=(ListView)findViewById(R.id.list);
	    ContactsDatabase helper=new ContactsDatabase(Contacts.this);   
	      
	    Intent intent = getIntent();
	    ArrayList<String> items=helper.GetNames();
	    ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);
	    list.setAdapter(adapter);
	    helper.close();
	}
}
