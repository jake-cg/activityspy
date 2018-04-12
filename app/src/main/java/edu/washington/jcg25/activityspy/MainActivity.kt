package edu.washington.jcg25.activityspy

import android.app.NotificationManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.support.v4.app.NotificationManagerCompat
import android.util.Log
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate Fired. Bundle: $savedInstanceState")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart Fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume Fired")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart Fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause Fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop Fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "We're going down Captain!")
    }

    companion object {

        private val TAG = "Main Activity"
    }
}
