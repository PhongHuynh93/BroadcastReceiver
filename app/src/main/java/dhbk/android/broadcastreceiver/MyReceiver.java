package dhbk.android.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by huynhducthanhphong on 4/15/16.
 * Nhận Intent
 */
public class MyReceiver extends BroadcastReceiver{
    private static final String TAG = MyReceiver.class.getName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive: Intent detected");
    }
}
