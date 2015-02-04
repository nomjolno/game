package com.example.game1;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class EasyActivity extends Activity {
	private TextView timer;
	private int number;
	int minute,second,m_second;
    private LoopEngine loopEngine = new LoopEngine();
    private long startDate;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_easy);	
		timer =(TextView) findViewById(R.id.timer);
	}
	public void starthold(View view){
		   startDate =System.currentTimeMillis();
           loopEngine.start();
       }
	 public void update(){
         minute =(int)((((System.currentTimeMillis()-startDate))/1000)/60);
         second =(int)((((System.currentTimeMillis()-startDate))/1000)%60);
         m_second =(int)(((System.currentTimeMillis()-startDate)/10)%10);
         timer.setText(String.format("%1$02d",minute));
         timer.setText(String.format("%1$02d",second));
         timer.setText(String.format("%1$01d",m_second));
  }
	//一定時間後にupdateを呼ぶためのオブジェクト
	    class LoopEngine extends Handler {
	        private boolean isUpdate;
	        public void start(){
	                this.isUpdate = true;
	                handleMessage(new Message());
	        }
	        public void stop(){
	                this.isUpdate = false;
	        }
	      //  @Override
	     /*   public void handleMessage(Message msg) {
	                this.removeMessages(0);//既存のメッセージは削除
	                if(this.isUpdate){
	                    MainActivity.this.update();//自信が発したメッセージを取得してupdateを実行
	                    sendMessageDelayed(obtainMessage(0), 100);//100ミリ秒後にメッセージを出力
	                }
	        } 
	    };*/
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
