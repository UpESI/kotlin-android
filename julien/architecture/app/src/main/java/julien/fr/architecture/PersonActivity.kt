package julien.fr.architecture

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PersonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)

        val firstName = intent.getStringExtra("firstname_user")

        // apply permet d'appliquer des modification sur les props d'un objet.
        val nameTxt = findViewById<TextView>(R.id.nameTxt).apply {
            text = "Bonjour $firstName"
        }
    }
}
