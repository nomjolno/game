package com.example.game1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class GoalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_goal);
	}
	//プレイ選択画面へ遷移
	public void replay(View v){
		Intent intent =new Intent(GoalActivity.this , MainActivity.class);
		startActivity(intent);
	}
	//タイトル画面へ遷移
	public void title(View v){
		Intent intent =new Intent(GoalActivity.this , StartActivity.class);
		startActivity(intent);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.goal, menu);
		return true;
	}

}
