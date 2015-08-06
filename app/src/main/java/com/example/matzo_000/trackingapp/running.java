package com.example.matzo_000.trackingapp;

/**
 * Created by matzo_000 on 31-Jul-15.
 */

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.widget.Toast;
import android.widget.TextView;
import java.util.List;
import android.os.Bundle;


public class running extends Activity {

            /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);

        this.setContentView(tv);



        ActivityManager actvityManager = (ActivityManager)

        this.getSystemService( ACTIVITY_SERVICE );

        List<RunningAppProcessInfo> procInfos = actvityManager.getRunningAppProcesses();

        for(int i = 0; i < procInfos.size(); i++)

        {

            tv.setText(tv.getText().toString()+procInfos.get(i).processName+

                    " " + String.valueOf(procInfos.get(i).processName.length())+"\n");

            if(procInfos.get(i).processName.equals("com.android.camera")) {

                Toast.makeText(getApplicationContext(), "Camera App is running", Toast.LENGTH_LONG).show();

            }

        }

    }

}

