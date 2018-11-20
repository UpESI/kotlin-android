package geekinc.fr.moodtracker

import android.content.ContentValues
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.GridView
import geekinc.fr.moodtracker.extras.ExtraActions
import geekinc.fr.moodtracker.extras.helper.MoodDatabaseHandler
import geekinc.fr.moodtracker.moods.MoodInformations

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        val gridView = findViewById<GridView>(R.id.gridView)
        gridView.adapter = MoodAdapter(this)
        gridView.onItemClickListener = AdapterView.OnItemClickListener {
            parent, view, position, id ->
            val moodInformations = MoodInformations()
            val name = moodInformations.moodName[position]
            val moodDB = MoodDatabaseHandler(this)
            val values = ContentValues()
            values.put("name", name)
            val addMoodDBResult = moodDB.addMood(values)
            if(addMoodDBResult) {
                val moodIntent = Intent(this, MoodActivity::class.java).apply {
                    putExtra(ExtraActions.EXTRA_INT.toString(), position)
                }
                startActivity(moodIntent)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mood_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when(item.itemId) {
        R.id.mood_menu_history -> {
            val moodHistoryIntent = Intent(this, MoodHistoryActivity::class.java)
            startActivity(moodHistoryIntent)
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
