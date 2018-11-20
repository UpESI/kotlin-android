package geekinc.fr.moodtracker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MoodHistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood_history)

        val moodListView = findViewById<ListView>(R.id.mood_list_view)
        val moodAdapter = MoodHistoryAdapter(this, arrayListOf(""))
        moodListView.adapter = moodAdapter
    }
}
