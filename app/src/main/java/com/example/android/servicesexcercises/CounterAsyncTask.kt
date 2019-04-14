package com.example.android.servicesexcercises

import android.os.AsyncTask
import android.util.Log

class CounterAsyncTask() {

    private val myTask = MyTask()

    fun runAsyncTask() {
        myTask.execute()
    }

    fun stopAsyncTask() {
        myTask.cancel(true)
    }

    private class MyTask : AsyncTask<Unit, Unit, Unit>() {

        override fun doInBackground(vararg params: Unit?) {
            Log.v("PRUEBA ASYNCTASK", "Running AsyncTask in thread: ${Thread.currentThread().name}")

            for(i in 1..100) {
                Log.v("PRUEBA ASYNCTASK", "Count: $i")
                Thread.sleep(2000)
            }
        }
    }

}