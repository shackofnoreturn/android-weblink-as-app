package com.shackofnoreturn.dashboard

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // The URL to open
        val url = "http://jump.shackofnoreturn.com"

        // Create an Intent to open the URL
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

        // Start the activity
        startActivity(browserIntent)

        // Close the activity so the app doesn't stay open
        finish()
    }
}
