package geekinc.fr.moodtracker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.Button
import android.widget.TextView

class MoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood)

        val moodString = intent.getStringExtra("mood")

        val button = findViewById<Button>(R.id.mood_button).apply {
            text = moodString
        }

        val rootView = button.rootView

        when {
            moodString == getString(R.string.mood_happy) -> {
                findViewById<TextView>(R.id.mood_text_view).apply {
                    text = getString(R.string.mood_happy_text)
                }
                rootView.setBackgroundColor(ContextCompat.getColor(this, R.color.mood_happy))
            }
            moodString == getString(R.string.mood_cry) -> {
                findViewById<TextView>(R.id.mood_text_view).apply {
                    text = getString(R.string.mood_cry_text)
                }
                rootView.setBackgroundColor(ContextCompat.getColor(this, R.color.mood_cry))
            }
            moodString == getString(R.string.mood_awesome) -> {
                findViewById<TextView>(R.id.mood_text_view).apply {
                    text = getString(R.string.mood_awesome_text)
                }
                rootView.setBackgroundColor(ContextCompat.getColor(this, R.color.mood_awesome))
            }
            moodString == getString(R.string.mood_hurt) -> {
                findViewById<TextView>(R.id.mood_text_view).apply {
                    text = getString(R.string.mood_hurt_text)
                }
                rootView.setBackgroundColor(ContextCompat.getColor(this, R.color.mood_hurt))
            }
        }
    }
}
