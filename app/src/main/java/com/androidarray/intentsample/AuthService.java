package com.androidarray.intentsample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AuthService extends Service {

    public AuthService() {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        String password = intent.getStringExtra("PASSWORD");
        boolean success = (password != null && password.equals("password"));

        Intent broadcastIntent = new Intent("com.androidarray.AUTHENTICATION");
        broadcastIntent.putExtra("SUCCESS", success);
        sendBroadcast(broadcastIntent);

        stopSelf();

        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
