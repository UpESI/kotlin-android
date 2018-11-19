package geekinc.fr.moodtracker

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import geekinc.fr.moodtracker.moods.moodThumbs


class MoodAdapter(private val context: Context) : BaseAdapter() {

    override fun getCount(): Int = moodThumbs.size

    override fun getItem(position: Int): Any? = null

    override fun getItemId(position: Int): Long = 0L

    override fun getView(position: Int,
                         convertView: View?,
                         parent: ViewGroup?): View {
        val image: ImageView
        if(convertView == null) {
            image = ImageView(context)
            image.layoutParams = ViewGroup.LayoutParams(100, 100)
            image.scaleType = ImageView.ScaleType.FIT_CENTER
            image.setPadding(10,10,10,10)
        } else {
            image = convertView as ImageView
        }

        image.setImageResource(moodThumbs[position])
        return image

    }
}