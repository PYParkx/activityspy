package edu.washington.pypark.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val tag: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(tag, "onCreate event fired")
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "onPause event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "onStop event fired")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(tag, "onRestart event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(tag, "We’re going down, Captain!")
    }
}
