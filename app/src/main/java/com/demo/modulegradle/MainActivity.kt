package com.demo.modulegradle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.demo.moduletest.TestManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("add Result", TestManager.getInstance(this)?.add(11, 20).toString() + "::")
        Log.e("subtract Result", TestManager.getInstance(this)?.subtract(112, 20).toString() + "::")
        Log.e("multiple Result", TestManager.getInstance(this)?.multiple(12, 20).toString() + "::")
    }
}
