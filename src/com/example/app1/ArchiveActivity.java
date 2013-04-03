package com.example.app1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class ArchiveActivity extends Activity implements OnClickListener {

	private ImageView supplierButton;
	private ImageView materialButton;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_archive_menu);
		
		supplierButton = (ImageView) findViewById(R.id.supplier_button);
		materialButton = (ImageView) findViewById(R.id.material_button);
		
		supplierButton.setOnClickListener(this);
		materialButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
