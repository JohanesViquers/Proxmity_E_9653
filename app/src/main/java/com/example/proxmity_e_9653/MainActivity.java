package com.example.proxmity_e_9653;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SensorManager mSensorManager;
    private Sensor mSensor;
    TextView tvProx;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSensorManager = (SensorManager) getSystemService(SEARCH_SERVICE);
        mSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        tvProx = (TextView) findViewById(R.id.Proxx);

        protected void onResume() {
            super.onResume();
            mSensorManager.registerListener(this,mSensor,SensorManager.SENSOR_DELAY_NORMAL);

        }

        protected void onPause() {
            super.onPause();
            mSensorManager.unregisterListener(this);

        }
    }
    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Sensor mySensor = sensorEvent.sensor;

        if ((mySensor.getType()) == Sensor.TYPE_PROXIMITY){
            if (sensorEvent.values[0]==0)
                tvProx.setText("<<<<NEAR>>>>");
            else
                tvProx.setText("<<<<<FARRRR>>>>");
        }
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int i);{

    }








{


    }
}