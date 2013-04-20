package com.example.app1;

import java.util.ArrayList;

import com.example.app1.data.ContactsDatabase;

import android.app.Activity;
//import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
//import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.Toast;


public class Contacts extends Activity implements OnClickListener{

	private ListView list;
	private Button optionsButton;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.contacts);
		list=(ListView)findViewById(R.id.list);
		ContactsDatabase helper=new ContactsDatabase(Contacts.this);   

		//	    Intent intent = getIntent();
		ArrayList<String> items=helper.GetNames();
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);
		list.setAdapter(adapter);
		helper.close();
		
		optionsButton = (Button) findViewById(R.id.button1);

		
		optionsButton.setOnClickListener(this);	

	}

	public void onClick(View v) {
	/** Instantiating PopupMenu class */
	PopupMenu popup = new PopupMenu(getBaseContext(), v);

	/** Adding menu items to the popupmenu */
	popup.getMenuInflater().inflate(R.menu.contact_popup, popup.getMenu());

	/** Defining menu item click listener for the popup menu */
	popup.setOnMenuItemClickListener(new OnMenuItemClickListener() {

		@Override
		public boolean onMenuItemClick(MenuItem item) {
			Toast.makeText(getBaseContext(), "You selected the action : " + item.getTitle(), Toast.LENGTH_SHORT).show();
			return true;
		}
	});

	/** Showing the popup menu */
	popup.show();
	}


}
