package com.example.android.servicesexcercises

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.os.IInterface
import android.os.Parcel
import android.util.Log
import android.widget.Toast
import java.io.FileDescriptor
import java.util.*

class CounterService : Service() {

    override fun onBind(intent: Intent): IBinder {
        throw UnsupportedOperationException("Not yet implemented")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.v("PRUEBA SERVICE", "Normal Service Stopped")
        stopSelf()
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        for(i in 1..10) {
            Log.v("PRUEBA SERVICE", "$i: " +
                    "current thread: ${Thread.currentThread().name}")
        }

        stopSelf()
        return super.onStartCommand(intent, flags, startId)
    }
}
