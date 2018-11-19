package geekinc.fr.architecture

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PersonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)

        val firstName = intent.getStringExtra("firstnameuser")

        val textView = findViewById<TextView>(R.id.textView).apply {
            text = firstName
        }
    }
}
