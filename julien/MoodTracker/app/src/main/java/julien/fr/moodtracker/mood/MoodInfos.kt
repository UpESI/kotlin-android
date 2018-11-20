package julien.fr.moodtracker.mood

class MoodInfos (private val position: Int = 0) {

    fun getMoodImage (): Int = moods[this.position]

    fun getMoodSize (): Int = moods.size

}