package com.example.timeticker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MyClockView.DownCountTimerListener {
    Button mBtn;
    private MyClockView myClockView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clock_view_activity);
        mBtn = (Button) findViewById(R.id.button1);
        mBtn.setOnClickListener(this);
        myClockView = (MyClockView) findViewById(R.id.clockView);
        myClockView.setDownCountTimerListener(this);
     //   Log.e("硬件加速----",myClockView.isHardwareAccelerated()+"");
         myClockView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                myClockView.setDownCountTime(1000L * 60L + 1000L * 12L);
                myClockView.startDownCountTimer();

                break;

            default:
                break;
        }
    }

    @Override
    public void stopDownCountTimer() {
        Toast.makeText(this,"结束了",Toast.LENGTH_SHORT).show();
    }
}
