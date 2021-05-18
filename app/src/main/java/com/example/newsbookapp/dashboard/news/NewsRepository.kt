package com.example.newsbookapp.dashboard.news

import com.example.newsbookapp.network.apihelper.ApiHelper
import javax.inject.Inject

/**
 * Created by shande on 11-05-2021
 */
class NewsRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getHeadlines() = apiHelper.getHeadlines()

}