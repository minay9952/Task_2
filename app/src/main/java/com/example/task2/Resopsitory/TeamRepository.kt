package com.example.task2.Resopsitory

import com.example.task2.Database.DatabaseManager
import com.example.task2.Network.NetworkManager
import com.example.task2.Network.ServiceAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.coroutines.coroutineContext

class TeamRepository(private val database: DatabaseManager) {

    suspend fun getLeauges(){
        withContext(Dispatchers.IO){
            NetworkManager.service.getTeam()
        }
    }
}