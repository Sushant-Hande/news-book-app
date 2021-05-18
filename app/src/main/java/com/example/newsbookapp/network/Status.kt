package com.example.newsbookapp.network

/**
 * Created by shande on 11-05-2021
 */
sealed class Status {
    object Success : Status()
    object Error : Status()
    object Loading : Status()
}