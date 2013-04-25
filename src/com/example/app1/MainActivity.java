package com.example.app1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private Button loginButton;
	private EditText usernameText;
	private EditText passwordText;
 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		loginButton = (Button) findViewById(R.id.login_button);
		usernameText = (EditText) findViewById(R.id.username);
		passwordText = (EditText) findViewById(R.id.password);
		
		loginButton.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.equals(loginButton))
		{
			if((usernameText.getText().toString().equals("user")&&
					passwordText.getText().toString().equals("pass")))
			{
				Toast.makeText(this, R.string.login_successful,Toast.LENGTH_SHORT).show();
				Intent intent1= new Intent(this, MenuActivity.class);
				//Intent intent1 = new Intent("com.example.app1.MENU");
				startActivity(intent1);
			}
			else
			{
				Toast.makeText(this, R.string.login_error, Toast.LENGTH_SHORT).show();	
			}
		}
		
	}

}
//Another way to define On click
//loginButton.setOnClickListener(new View.OnClickListener(){
//public void onClick(View v){}
//}
//);

//Thread
//Thread timer = new Thread(){
// public void Run(){
//	try{
//		sleep(5000);
//		}
//catch(InterruptedException e){
// e.PrintStackTrace();
//		}
//finally{
//		Intent intent1 = new Intent("com.example.app1.nameofJavaclass");
//		startActivity(intent1);
//		}
//	}
//		
//};
//timer.start();