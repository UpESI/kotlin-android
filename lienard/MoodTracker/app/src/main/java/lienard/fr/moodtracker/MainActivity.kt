package lienard.fr.moodtracker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeActivity(view: View) {
        val intention = Intent(this, EmotionActivity::class.java).apply {
            putExtra("emotion", view.tag.toString())
        }

        startActivity(intention)
    }
}
