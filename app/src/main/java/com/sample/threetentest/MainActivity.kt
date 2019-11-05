package com.sample.threetentest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.threeten.bp.YearMonth
import org.threeten.bp.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textview)
        val format = DateTimeFormatter.ofPattern("MMMM yyyy")
        val text = YearMonth.of(2019, 11).format(format)
        textView.setText(text)
    }
}
