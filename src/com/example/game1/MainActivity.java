package com.example.game1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	
	}
	public void easy(View view){
		Intent intent =new Intent(MainActivity.this , EasyActivity.class);
		startActivity(intent);
	}
	public void nomal(View v){
		Intent intent =new Intent(MainActivity.this , NomalActivity.class);
		startActivity(intent);
	}
	public void hard(View v){
		Intent intent =new Intent(MainActivity.this , HardActivity.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
