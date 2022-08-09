package com.example.task2.Network

import android.provider.SyncStateContract
import com.example.task2.Constants
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

object NetworkManager{
    private val retrofit = Retrofit
        .Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()

    val service = retrofit.create(ServiceAPI::class.java)
}