package com.example.game1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class EasyActivity extends Activity {
	private TextView timer;
	private int number;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_easy);	
		timer =(TextView) findViewById(R.id.timer);
	}
	public void starthold(View view){
		 
       }
  
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.easy, menu);
		return true;
	}

}
