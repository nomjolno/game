package com.example.game1;

import android.os.Handler;
import android.os.Message;

class LoopEngine extends Handler {
    private boolean isUpdate;
    public void start(){
            this.isUpdate = true;
            handleMessage(new Message());
    }
    public void stop(){
            this.isUpdate = false;
    }
    @Override
    public void handleMessage(Message msg) {
            this.removeMessages(0);//既存のメッセージは削除
            if(this.isUpdate){
               // MainActivity.this.update();//自信が発したメッセージを取得してupdateを実行
                sendMessageDelayed(obtainMessage(0), 100);//100ミリ秒後にメッセージを出力
            }
    } 
};
/*public class LoopEngine {
}*/