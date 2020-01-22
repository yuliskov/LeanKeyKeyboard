package com.liskovsoft.leankeyboard.other;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.liskovsoft.leankeyboard.keyboard.leanback.ime.LeanbackImeService;

public class RestartServiceReceiver extends BroadcastReceiver {
    private static final String TAG = RestartServiceReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        sendMessageToService(context);
    }

    private void sendMessageToService(Context context) {
        Log.d(TAG, "Sending restart message to the service");
        Intent intent = new Intent(context, LeanbackImeService.class);
        intent.putExtra(LeanbackImeService.COMMAND_RESTART, true);
        context.startService(intent);
    }
}