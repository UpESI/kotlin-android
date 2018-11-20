package geekinc.fr.moodtracker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.BaseColumns
import android.widget.ListView
import geekinc.fr.moodtracker.extras.helper.MoodDatabaseHandler

class MoodHistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood_history)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onResume() {
        super.onResume()

        var moodDbHelper = MoodDatabaseHandler(this)
        var moodList = moodDbHelper.fetchMoods()
        if(moodList.size > 0) {
            val moodListView = findViewById<ListView>(R.id.mood_list_view)
            val moodAdapter = MoodHistoryAdapter(this, moodList)
            moodListView.adapter = moodAdapter
        }
    }
}
