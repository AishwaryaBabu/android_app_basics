package com.example.app1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuActivity extends ListActivity{

	String classes[] = {"ProfileActivity", "example1", "example2", "example3", "example4", "example5", "example6"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(MenuActivity.this, android.R.layout.simple_list_item_1, classes));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		
		super.onListItemClick(l, v, position, id);
		String cheese = classes[position];
		
		try{
		Class ourClass = Class.forName("com.example.app1."+ cheese);
		Intent ourIntent = new Intent(MenuActivity.this, ourClass);
		startActivity(ourIntent);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}


}