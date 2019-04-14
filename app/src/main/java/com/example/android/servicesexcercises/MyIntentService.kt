package com.example.android.servicesexcercises

import android.app.IntentService
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyIntentService : IntentService("MyIntentService") {

    //  Doing background stuff :v
    override fun onHandleIntent(intent: Intent?) {
        for(i in 1..10) {
            Log.v("PRUEBA INTENT_SERVICE", "Count in IntentService: $i, thread: ${Thread.currentThread().name}")
            Thread.sleep(1000)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("PRUEBA INTENT_SERVICE", "Service DESTROYED")
        stopSelf()
    }
}
