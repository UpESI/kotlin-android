package geekinc.fr.moodtracker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView = findViewById<GridView>(R.id.gridView)
        gridView.adapter = MoodAdapter(this)
        gridView.onItemClickListener = AdapterView.OnItemClickListener {
            parent, v, position, id -> Toast.makeText(this, "$position", Toast.LENGTH_LONG).show()
        }
    }
}
