package com.example.task2.Database

import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.task2.Model.Team

interface DatabaseDAO {
    @Query("select * from DatabaseEntity")
    fun getAllTeam(): List<Team>

    @Insert(onConflict = REPLACE)
    fun insertAll(vararg teams: Team)

}