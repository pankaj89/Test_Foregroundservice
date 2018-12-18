package mustach.com.test

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat
import android.util.Log

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, BackgroundService::class.java)
        if (context != null)
            ContextCompat.startForegroundService(context, service)

        Log.i("TEST", "Receiver fired")
    }
}