package julien.fr.moodtracker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView = findViewById<GridView>(R.id.gridView)
        gridView.adapter = MoodAdapter(this)

        gridView.onItemClickListener = AdapterView.OnItemClickListener {
            parent, view, position, id
                -> startActivity(Intent(this, MoodActivity::class.java).apply {
                    putExtra("selectedMood", position)
                })
        }
    }
}
