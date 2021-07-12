package com.mopanc.imcapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w( "lifecycle", "CREATE - estou criando a tela")
    }

    override fun onStart() {
        super.onStart()
        Log.w( "lifecycle", "START - deixei a tela visivel para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w( "lifecycle", "START - Agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w( "lifecycle", "Pause - A tela perdeu o foco você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w( "lifecycle", "Stop - A tela não está mais visivel mas ainda existe")
    }
    override fun onRestart() {
        super.onRestart()
        Log.w( "lifecycle", "RESTART - Tela está retomando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w( "lifecycle", "DESTROY - Ho não!!! a tela foi destruida")
    }


}