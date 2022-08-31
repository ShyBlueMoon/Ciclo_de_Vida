package com.example.ciclodevida

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "$ACTIVITY onCreate")

        configurarListeners()
    }

    private fun configurarListeners() {
        configurarListenerBtnNovaTela()

    }

    private fun configurarListenerBtnNovaTela() {
        val button = findViewById<Button>(R.id.botaoMainAcao)
        button.setOnClickListener {
            val intent = Intent(this, ResultadoActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "Main Activity::onResume")

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "$ACTIVITY onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "$ACTIVITY onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "$ACTIVITY onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "$ACTIVITY onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "$ACTIVITY onDestroy")
    }

    companion object {
        private const val TAG = "IGTILog"
        private const val ACTIVITY = "Main Activity::"
    }

}