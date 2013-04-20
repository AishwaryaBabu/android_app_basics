package com.example.app1;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
//import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.PopupMenu;
//import android.widget.Toast;
//import android.widget.PopupMenu.OnMenuItemClickListener;

//public class ProfileActivity {
public class ProfileActivity extends Activity implements OnClickListener {

	private Button archiveButton;
//	private ImageView profilePic;

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);
		
		archiveButton = (Button) findViewById(R.id.archive_button);

//		profilePic = (ImageView) findViewById(R.id.profile_pic);
		
		archiveButton.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		Intent intent1= new Intent(this, ArchiveActivity.class);
		startActivity(intent1);
		// TODO Auto-generated method stub		
		
		
	}

}
