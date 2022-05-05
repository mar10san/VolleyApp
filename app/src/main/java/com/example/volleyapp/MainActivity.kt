package com.example.volleyapp

import android.app.DownloadManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        val url = "https://developer.android.com/training/volley/simple?hl=es-419"

        val stringRequest = StringRequest(Request.Method.GET,url, Response.Listener { respuesta ->
            Log.d("petición","${respuesta.substring(0,500)}")
        },Response.ErrorListener {
            Log.e("petición","Hubo un error")
        })

        queue.add(stringRequest)
    }
}