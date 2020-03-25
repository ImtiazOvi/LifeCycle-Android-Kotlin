package com.imtiaz.lifecycle_android_kotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    /** ================================== Note ================================== */

    /** Life cycle components are :
     * 1. OnCreate
     * 2. OnStart
     * 3. OnResume
     * 4. OnPause
     * 5. OnRestart
     * 6. OnStop
     * 7. OnDestroy
     * */

    // First time app on : OnCreate called - OnStart called - OnResume called
    // Minimize app : OnPause called - OnStop called
    // After minimize then open app : OnRestart called - OnStart called - OnResume called
    // Close app : OnPause called - OnStop called - OnDestroy called


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_txtView.setText("OnCreate")
        Log.d("tag", "OnCreate Called");

    }


    override fun onStart() {
        super.onStart()
        txt_txtView.setText("onStart")
        Log.d("tag", "onStart Called");
    }

    override fun onRestart() {
        super.onRestart()
        txt_txtView.setText("OnRestart")
        Log.d("tag", "OnRestart Called");
    }

    override fun onResume() {
        super.onResume()
        txt_txtView.setText("OnResume")
        Log.d("tag", "OnResume Called");
    }


    override fun onStop() {
        super.onStop()
        txt_txtView.setText("OnStop")
        Log.d("tag", "OnStop Called");
    }

    override fun onPause() {
        super.onPause()
        txt_txtView.setText("OnPause")
        Log.d("tag", "OnPause Called");
    }

    override fun onDestroy() {
        super.onDestroy()
        txt_txtView.setText("OnDestroy")
        Log.d("tag", "OnDestroy Called");
    }

}
