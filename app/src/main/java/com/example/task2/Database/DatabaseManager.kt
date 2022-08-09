package com.example.task2.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [DatabaseEntity::class], version = 1, exportSchema = false)
abstract class DatabaseManager: RoomDatabase() {
    abstract val databaseDAO: DatabaseDAO

    companion object{
        private var database: DatabaseManager? = null

        fun getDatabase(context: Context): DatabaseManager{
            synchronized(this){
                var instance = database
                if(instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        DatabaseManager::class.java,
                        "TeamDatabase")
                        .fallbackToDestructiveMigration()
                        .build()
                    database = instance
                }
                return instance
            }
        }
    }
}

