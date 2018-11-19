package julien.fr.moodtracker

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_mood.view.*

class MoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood)

        val txtMoodReaction = findViewById<TextView>(R.id.txtMoodReaction)
        val rootView = txtMoodReaction.rootView

        when (intent.getStringExtra("selectedMood")) {
            getString(R.string.emoji_joy) -> {
                txtMoodReaction.text = getString(R.string.emoji_joy)
                findViewById<TextView>(R.id.txtMoodText).apply {
                    text = getString(R.string.joy_txt)
                }
                rootView.setBackgroundColor(getColor(R.color.colorJoy))
            }
            getString(R.string.emoji_cry) -> {
                txtMoodReaction.text = getString(R.string.emoji_cry)
                findViewById<TextView>(R.id.txtMoodText).apply {
                    text = getString(R.string.cry_txt)
                }
                rootView.setBackgroundColor(getColor(R.color.colorCry))
            }
            getString(R.string.emoji_wow) -> {
                txtMoodReaction.text = getString(R.string.emoji_joy)
                findViewById<TextView>(R.id.txtMoodText).apply {
                    text = getString(R.string.wow_txt)
                }
                rootView.setBackgroundColor(getColor(R.color.colorWow))
            }
        }
    }
}
