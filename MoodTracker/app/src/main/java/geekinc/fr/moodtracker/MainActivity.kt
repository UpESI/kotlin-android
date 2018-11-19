package geekinc.fr.moodtracker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import geekinc.fr.moodtracker.extras.ExtraActions

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView = findViewById<GridView>(R.id.gridView)
        gridView.adapter = MoodAdapter(this)
        gridView.onItemClickListener = AdapterView.OnItemClickListener {
            parent, view, position, id ->
            val moodIntent = Intent(this, MoodActivity::class.java).apply {
                putExtra(ExtraActions.EXTRA_INT.toString(), position)
            }
            startActivity(moodIntent)
        }
    }
}
