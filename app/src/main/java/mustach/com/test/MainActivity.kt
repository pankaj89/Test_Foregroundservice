package mustach.com.test

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service = Intent(this, BackgroundService::class.java)
//        ContextCompat.startForegroundService(this.applicationContext, service)
    }
}
