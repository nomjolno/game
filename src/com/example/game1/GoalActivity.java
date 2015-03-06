package com.example.game1;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class GoalActivity extends Activity {
	private TextView timer;
	int time;
	int time2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_goal);
		timer=(TextView)findViewById(R.id.textView3);
		//タッチ回数の情報を受け取る
				Intent intent = getIntent();
				time = intent.getIntExtra("TouchCount", 0);
				time2 = intent.getIntExtra("mTouchCount", 0);
				 Log.d("TouchCount", "" + time);
				timer.setText( time2 + ":"+ time );
				 Log.d("setText", "OK");
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
