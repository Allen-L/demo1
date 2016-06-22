package cn.com.kakaxi.demo1;

/**
 * Created by kakaxi on 16/6/21.
 */

import  android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SlidingDrawer;
import android.widget.SlidingDrawer.OnDrawerOpenListener;

public class Location {
    private Context mContex;
    private Activity mActivity;
    private View mLocation;
    private Button mCount;
    private LinearLayout mNearBy;
    private ImageView mFlip;
    private ImageView mCheckIn;
    private OnDrawerOpenListener onListener;


    Handler handler = new Handler(){

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0:
                    break;
                case 1:
                    break;
                default:


            }


        }
    }

private  void setListener(){
    this.mFlip.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });

}













}

