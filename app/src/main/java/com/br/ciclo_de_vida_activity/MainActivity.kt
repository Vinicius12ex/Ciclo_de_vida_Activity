package com.br.ciclo_de_vida_activity

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        Log.d("fiap", "Oncreate Method")
//        setContentView(R.layout.activity_main)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_tela_2.setOnClickListener {
            val intent = Intent(this, Tela2::class.java)
            val nome = editText2.text.toString()
            intent.putExtra("param",nome)
            startActivity(intent)
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            makeCall()
        }
    }

    private fun makeCall() {
        val uri = "tel:" + 5556
        val call = Intent(Intent.ACTION_CALL)
        call.data = Uri.parse(uri)
        startActivity(call)
    }

    override fun onStart() {
        Log.d("fiap", "Onstart Method")
        super.onStart()
    }

    override fun onResume() {
        Log.d("fiap","OnResume Method")
        super.onResume()
    }

    override fun onPause() {
        Log.d("fiap","OnPause Method")
        super.onPause()
    }

    override fun onStop() {
        Log.d("fiap","OnStop Method")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("fiap","OnDestroy Method")
        super.onDestroy()
    }
}
