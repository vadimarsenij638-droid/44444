package com.diana.assistant.ua

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var statusText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Знаходимо TextView з layout
        statusText = findViewById(R.id.statusText)
        statusText.text = "Діана запускається..."

        // Запускаємо Foreground Service
        val serviceIntent = Intent(this, VoiceForegroundService::class.java)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(serviceIntent)
        } else {
            startService(serviceIntent)
        }

        // Оновлюємо статус після запуску сервісу
        statusText.text = "Діана готова до роботи"
    }
}
