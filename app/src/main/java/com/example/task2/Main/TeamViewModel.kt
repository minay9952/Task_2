package com.example.task2.Main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.task2.Database.DatabaseManager
import com.example.task2.Resopsitory.TeamRepository
import kotlinx.coroutines.launch

class TeamViewModel(application: Application): AndroidViewModel(application){

    private val database = DatabaseManager.getDatabase(application)
    private val repo = TeamRepository(database)

    init{
        viewModelScope.launch{
            repo.getLeauges()
        }
    }
}