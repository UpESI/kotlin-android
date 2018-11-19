package geekinc.fr.moodtracker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import geekinc.fr.moodtracker.extras.ExtraActions
import geekinc.fr.moodtracker.moods.moodThumbs

class MoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood)

        val moodIndex = intent.getIntExtra(ExtraActions.EXTRA_INT.toString(), 0)

        val moodImageView = findViewById<ImageView>(R.id.mood_image_view)
        moodImageView.setImageResource(moodThumbs[moodIndex])

    }
}
