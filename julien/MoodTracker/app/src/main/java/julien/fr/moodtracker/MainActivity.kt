package julien.fr.moodtracker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun selectMood (view: View) {
        val intent: Intent = Intent(this, MoodActivity::class.java).apply {
            putExtra("selectedMood", view.tag.toString())
        }

        println(view.tag.toString())

        startActivity(intent)
    }
}
