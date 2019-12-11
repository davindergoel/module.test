package com.demo.modulegradle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.demo.moduletest.TestManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("Result", TestManager.getInstance(this)?.subtract(112, 20).toString() + "::")
    }
}
