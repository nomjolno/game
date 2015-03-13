package com.example.game1;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class EasyActivity extends Activity {
	private TextView dispCnt;
	private int number;
	int time = 0;
	int i = 0;
	Timer mTimer = null;
	Handler mHandler = new Handler();
	private Timer timer;
	private ImageView b1, b2, b3, b4, b5, b6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_easy);
		dispCnt = (TextView) findViewById(R.id.timer);
		b1 = (ImageButton) findViewById(R.id.button1);
		b2 = (ImageButton) findViewById(R.id.button2);
		b3 = (ImageButton) findViewById(R.id.button3);
		b4 = (ImageButton) findViewById(R.id.button4);
		b5 = (ImageButton) findViewById(R.id.button5);
		b6 = (ImageButton) findViewById(R.id.button6);
		b6.setVisibility(View.INVISIBLE);
	}
	public void timestart(){
		if (timer == null) {
			timer = new Timer(true);
		}
		final Handler handler = new Handler();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				handler.post(new Runnable() {
					public void run() {
						time++;
						// 10ミリでカウントし100になったら1秒
						if (time == 100) {
							i++;
							time = 0;
						}
						String disp_count = String.format("%1$02d", time);
						String disp_i = String.format("%1$02d", i);
						dispCnt.setText(disp_i + ":" + disp_count);
					}
				});
			}
		}, 10, 10);
	}

	public void starthold(View view) {
		timestart();
	}
		

	public void click2(View v) {
		Log.d("click2", "OK");
		b6.setVisibility(View.VISIBLE);
		Log.d("click2", "OKV");
		b6.setImageResource(R.drawable.hold);
		Log.d("click2", "OKL");
		b1.setVisibility(View.INVISIBLE);
		Log.d("click2", "OK2");
	}

	public void onClick(View v) {
		b6.setVisibility(View.VISIBLE);
	}

	public void goal(View v) {
		if (timer != null) {
			timer.cancel();
		}
		Intent intent = new Intent(EasyActivity.this, GoalActivity.class);
		intent.putExtra("TouchCount", time);
		intent.putExtra("mTouchCount", i);
		Log.d("TouchCount", "" + i + ":" + time);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.easy, menu);
		return true;
	}

}
