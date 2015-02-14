package com.example.game1;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class EasyActivity extends Activity {
	private TextView dispCnt;
	private int number;
	int count = 0;
	int i = 0;
	Timer mTimer = null;
	Handler mHandler = new Handler();
	private Timer timer;
	private ImageView  b1,b2,b3,b4,b5,b6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_easy);	
		dispCnt =(TextView) findViewById(R.id.timer);	
		b1 = (ImageButton)findViewById(R.id.b1);
		b2 = (ImageButton)findViewById(R.id.b2);
		b3 = (ImageButton)findViewById(R.id.b3);
		b4 = (ImageButton)findViewById(R.id.b4);
		b5 = (ImageButton)findViewById(R.id.b5);
		b6 = (ImageButton)findViewById(R.id.b6);
		b6.setVisibility(View.INVISIBLE);
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
		     //10ミリでカウントし100になったら1秒
		     if(count == 100){
		    	 i ++;count = 0;
		     }
		     String disp_count = String.format("%1$02d", count);
		     String disp_i = String.format("%1$02d", i);
		     dispCnt.setText(disp_i+":"+disp_count);
		    }
		   });
		  }
		 }, 10, 10);
	} 
	public void onClick(View v){
		//特に指令なし
		//できればページがスライド？動くようにする
	}
	public void on2 (View v){
		b6.setVisibility(View.VISIBLE);
		  b6.setImageResource(R.drawable.hold);
		  b1.setVisibility(View.INVISIBLE);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.easy, menu);
		return true;
	}
	
}
		   
