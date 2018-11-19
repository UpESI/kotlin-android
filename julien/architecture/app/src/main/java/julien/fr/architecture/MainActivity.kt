package julien.fr.architecture

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendName(view: View) {
        val nameText: EditText = findViewById<EditText>(R.id.editText)
        val firstName = nameText.text.toString()

        // PersonActivity::class recupère le nom de la class PersonActivity
        // .java indique que cette class, des une class écrite en java (interop).
        val intention = Intent(this, PersonActivity::class.java).apply {
            putExtra("firstname_user", firstName)
        }

        startActivity(intention)
    }
}
