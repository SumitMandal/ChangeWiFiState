package com.example.developertwo.changewifistate;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void turnOnOffWiFi(Context context, boolean isTurnToOn){
        WifiManager wifiManager = (WifiManager)context.getSystemService(Context.WIFI_SERVICE);
        wifiManager.setWifiEnabled(isTurnToOn);
    }

    public void wifiOn(View view) {
        Toast.makeText(MainActivity.this, "Turning on WiFi", Toast.LENGTH_SHORT).show();
        turnOnOffWiFi(getApplicationContext(), true);
    }

    public void wifiOff(View view) {
        Toast.makeText(MainActivity.this, "Turning off WiFi", Toast.LENGTH_SHORT).show();
        turnOnOffWiFi(getApplicationContext(),false);
    }

}
