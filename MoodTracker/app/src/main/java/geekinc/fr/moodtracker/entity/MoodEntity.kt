package geekinc.fr.moodtracker.entity

import java.util.*

class MoodEntity {

    var moodId: Int? = null
    var name: String? = null

    constructor(id: Int, name: String) {
        this.moodId = id
        this.name = name
    }
}