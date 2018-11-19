package geekinc.fr.architecture

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendName(view: View) {
        val nameText = findViewById<EditText>(R.id.editText)
        val firstName = editText.text.toString()
        val intention = Intent(this, PersonActivity::class.java).apply {
            putExtra("firstnameuser", firstName)
        }
        startActivity(intention)
    }
}
