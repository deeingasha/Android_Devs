package com.example.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    fun division(){
        val numerator = 60
        var denominator = 4
        repeat(4){
            Log.d(TAG,"$denominator")
            Log.v(TAG, "${numerator/denominator}")
            denominator--
        }
    }
    fun logging() {
        Log.e(TAG, "ERROR: a serious error like an app crash")
        Log.w(TAG, "WARN: warns about the potential for serious errors")
        Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
        Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
        Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val helloTextView: TextView = findViewById(R.id.hello_world)
        setContentView(R.layout.activity_main)
        logging()
        division()
    }
}