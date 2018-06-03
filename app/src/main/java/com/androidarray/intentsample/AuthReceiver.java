package com.androidarray.intentsample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AuthReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        boolean success = intent.getBooleanExtra("SUCCESS", false);

        Intent activityIntent = new Intent(context, ResultActivity.class);
        activityIntent.putExtra("SUCCESS", success);

        context.startActivity(activityIntent);
    }
}
