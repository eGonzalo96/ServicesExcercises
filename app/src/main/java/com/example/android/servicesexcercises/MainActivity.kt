package com.example.android.servicesexcercises

import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var asyncTask = CounterAsyncTask()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }


    private fun setListeners() {

        //  Listeners to normal Services
        startService.setOnClickListener { v ->
            startService(
                Intent(baseContext, CounterService::class.java)
            )
            Log.v("PRUEBA SERVICE", "Normal Service Started")
        }

        stopService.setOnClickListener { v -> // This service is too fast to stop :(
            stopService(
                Intent(baseContext, CounterService::class.java)
            )
            Log.v("PRUEBA SERVICE", "Normal Services Stopped")
        }



        // Listeners to IntentServices
        startIntentService.setOnClickListener { v ->
            startService(
                Intent(baseContext, MyIntentService::class.java)
            )
            Log.v("PRUEBA INTENT_SERVICE", "IntentService Started")
        }

        stopIntentService.setOnClickListener { v ->
            stopService(
                Intent(baseContext, MyIntentService::class.java)
            )
            Log.v("PRUEBA INTENT_SERVICE", "IntentService Stopped")
        }



        //  Listeners to AsyncTask
        startAsynchronousTask.setOnClickListener { v ->
            Log.v("PRUEBA ASYNCTASK", "AsyncTask Started")
            asyncTask.runAsyncTask()
        }

        stopAsynchronousTask.setOnClickListener { v ->
            Log.v("PRUEBA ASYNCTASK", "AsyncTask Stopped")
            asyncTask.stopAsyncTask()
        }

    }
}
