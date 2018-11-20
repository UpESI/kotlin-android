package julien.fr.moodtracker

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import julien.fr.moodtracker.mood.MoodInfos

class MoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood)

        val moodImg = findViewById<ImageView>(R.id.mood_img)
        val rootView = moodImg.rootView

        val moodInfos = MoodInfos(intent.getIntExtra("selectedMood", 0))
        moodImg.setImageResource(moodInfos.getMoodImage())
    }
}
