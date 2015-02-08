package com.example.game1;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class EasyActivity extends Activity {
	private TextView dispCnt;
	private int number;
	int count = 0;
	int i = 0;
	//int m = 0;
	Timer mTimer = null;
	Handler mHandler = new Handler();
	private Timer timer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_easy);	
		dispCnt =(TextView) findViewById(R.id.timer);	
	}
	public void starthold(View view){
		//初めのホールドを触ってタイマースタート
		if(timer == null){
			  timer = new Timer(true);
			 }
		 final Handler handler = new Handler();
		 timer.schedule(new TimerTask() {
		  @Override
		  public void run() {
		   handler.post(new Runnable() {
		    public void run() {
		     count++;
		     //countは10ミリ秒ごとにカウントアップするので、100になったら1秒として計算していく
		     if(count == 100){
		      i ++;
		      count = 0;
		     }
		     //60秒になったら1分とする
		     /*if(i == 60){
		      m ++;
		      i = 0;
		     }*/
		     String disp_count = String.format("%1$02d", count);
		    // String disp_m = String.format("%1$02d", m);
		     String disp_i = String.format("%1$02d", i);
		     dispCnt.setText(/*disp_m+":"+*/disp_i+":"+disp_count);
		    }
		   });
		  }
		 }, 10, 10);
	} 
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.easy, menu);
		return true;
	}
	
}
		   
		  


