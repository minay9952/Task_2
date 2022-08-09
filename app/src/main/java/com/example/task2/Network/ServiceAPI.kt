package com.example.task2.Network

import com.example.task2.Constants
import com.example.task2.Model.Team
import retrofit2.http.GET

interface ServiceAPI{

    @GET("leagues")
    fun getTeam(): List<Team>

}