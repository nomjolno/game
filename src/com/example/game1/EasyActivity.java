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
   
	  public String formatTime(long value){
	        String output = "00:00.0";
	        long milli = value;
	        long second = milli / 10;
	        long minutes = second / 60;
	        milli = milli % 10;
	        second = second % 60;
	        minutes = minutes % 60;
	        String milliD = String.valueOf(milli);
	        String secondsD = String.valueOf(second);
	        String minutesD = String.valueOf(minutes);
	        if(milli < 10) milliD = String.valueOf(milli);
	        if(second < 10) secondsD = "0" + second;
	        if(minutes < 10) minutesD = "0" + minutes;
	        output = minutesD + ":" + secondsD + "." + milliD;
	        return output;
	    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.easy, menu);
		return true;
	}

}
