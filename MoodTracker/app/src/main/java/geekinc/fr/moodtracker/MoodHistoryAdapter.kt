package geekinc.fr.moodtracker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import java.util.*

class MoodHistoryAdapter(private val context: Context,
                         private val moodList: ArrayList<String>)
    : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getItem(position: Int): Any? = null

    override fun getItemId(position: Int): Long = 0L

    override fun getCount(): Int {
        return 6
    }

    override fun getView(position: Int,
                         convertView: View?,
                         parent: ViewGroup?): View {
        val view : View

        if(convertView == null) {
            view = inflater.inflate(R.layout.mood_list_item, parent, false)

            view.findViewById<TextView>(R.id.mood_text_view).apply {
                text = "Test mood"
            }
            view.findViewById<TextView>(R.id.date_text_view).apply {
                text = Date().toString()
            }
        } else {
            view = convertView
        }

        return view
    }

}