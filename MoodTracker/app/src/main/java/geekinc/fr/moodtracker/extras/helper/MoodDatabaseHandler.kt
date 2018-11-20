package geekinc.fr.moodtracker.extras.helper

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.database.sqlite.SQLiteQueryBuilder
import geekinc.fr.moodtracker.entity.MoodEntity

class MoodDatabaseHandler : SQLiteOpenHelper {

    companion object {
        val dbName = "MoodDB"
        val dbVersion = 1
        val tableName = "mood"
        val moodId = "id"
        val moodName = "name"
    }

    var context: Context? = null
    var sqlObject: SQLiteDatabase

    constructor(context: Context) : super(context, dbName, null, dbVersion) {
        this.context = context
        sqlObject = this.writableDatabase
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val sqlStatement = "CREATE TABLE IF NOT EXISTS " + tableName + " " +
                "(" + moodId + " INTEGER PRIMARY KEY, " +
                moodName + " TEXT);"
        db!!.execSQL(sqlStatement)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS " + tableName)
        onCreate(db)
    }

    fun addMood(values: ContentValues) : Boolean {
        val moodId = sqlObject.insert(tableName, "", values)
        if(moodId > 0)
            return true
        return false
    }

    fun fetchMoods() : ArrayList<MoodEntity> {
        var moodList = ArrayList<MoodEntity>()
        val sqlQueryBuilder = SQLiteQueryBuilder()

        sqlQueryBuilder.tables = tableName

        val columns = arrayOf("id", "name")

        val cursor = sqlQueryBuilder.query(sqlObject, columns, "name like ?", arrayOf("%"), null, null, "id")
        if(cursor.moveToFirst()) {
            do {
                val id = cursor.getInt(cursor.getColumnIndex("id"))
                val name = cursor.getString(cursor.getColumnIndex("name"))
                moodList.add(MoodEntity(id, name))
            } while(cursor.moveToNext())
        }
        return moodList
    }

    fun removeMood(id: Int) : Boolean {
        var selectionId = arrayOf(id.toString())
        val moodId = sqlObject.delete(tableName, "id=?", selectionId)
        if(moodId > 0) {
            return true
        }
        return false
    }
}