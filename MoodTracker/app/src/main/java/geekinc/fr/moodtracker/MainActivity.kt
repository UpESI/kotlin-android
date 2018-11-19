package geekinc.fr.moodtracker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun selectMood(view: View) {
        when (view.id) {
            R.id.awesome_button -> {
                val moodString = getString(R.string.mood_awesome)
                val intent = Intent(this, MoodActivity::class.java).apply {
                    putExtra("mood", moodString)
                }
                startActivity(intent)
            }
            R.id.cry_button -> {

                    val moodString = getString(R.string.mood_cry)
                    val intent = Intent(this, MoodActivity::class.java).apply {
                        putExtra("mood", moodString)
                    }
                    startActivity(intent)

            }
            R.id.hurt_button -> {

                    val moodString = getString(R.string.mood_hurt)
                    val intent = Intent(this, MoodActivity::class.java).apply {
                        putExtra("mood", moodString)
                    }
                    startActivity(intent)

            }
            R.id.happy_button -> {

                    val moodString = getString(R.string.mood_happy)
                    val intent = Intent(this, MoodActivity::class.java).apply {
                        putExtra("mood", moodString)
                    }
                    startActivity(intent)

            }
        }
    }
}
