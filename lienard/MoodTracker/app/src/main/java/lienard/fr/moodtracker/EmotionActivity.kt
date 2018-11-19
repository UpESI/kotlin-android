package lienard.fr.moodtracker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.widget.TextView

class EmotionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emotion)

        val emotion = intent.getStringExtra("emotion")

        findViewById<TextView>(R.id.icon).text = emotion

        val rootView = findViewById<TextView>(R.id.txtEmotion).rootView

        when(emotion) {
            getString(R.string.emotion_sad) -> {
                findViewById<TextView>(R.id.txtEmotion).apply {
                    text = getString(R.string.emotion_sad_text)
                }
                rootView.setBackgroundColor(getColor(R.color.colorLightGrey))
            }
            getString(R.string.emotion_neutral) -> {
                findViewById<TextView>(R.id.txtEmotion).apply {
                    text = getString(R.string.emotion_neutral_text)
                }
                rootView.setBackgroundColor(getColor(R.color.colorSalmon))
            }
            getString(R.string.emotion_happy) -> {
                findViewById<TextView>(R.id.txtEmotion).apply {
                    text = getString(R.string.emotion_happy_text)
                }
                rootView.setBackgroundColor(getColor(R.color.colorYellow))
            }
        }
    }
}
