package mustach.com.test

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder

class BackgroundService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        super.onStartCommand(intent, flags, startId)

        val notificationManager = applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val notifiacationChannel = NotificationChannel("1","default", NotificationManager.IMPORTANCE_HIGH)
        notificationManager.createNotificationChannel(notifiacationChannel)

        val builder = Notification.Builder(this, "1")
        builder.setSmallIcon(R.drawable.ic_launcher_foreground)
        builder.setContentTitle("Title")
        builder.setStyle(Notification.BigTextStyle().bigText("Big Message"))
        val notification = builder.build()

        notificationManager.notify(1, notification)

        startForeground(1, notification)
        return START_STICKY
    }
}