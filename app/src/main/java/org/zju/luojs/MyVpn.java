package org.zju.luojs;

import com.android.server.vpn.R;
import com.android.server.vpn.VpnServiceBinder;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MyVpn extends Activity {
    /** Called when the activity is first created. */
    private static final String TAG = "MyVpn";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d(TAG, "onCreate: ");
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(MyVpn.this, VpnServiceBinder.class));
            }
        });


    }
}