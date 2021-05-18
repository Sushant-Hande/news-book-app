package com.example.newsbookapp.network.apihelper

import com.example.newsbookapp.network.apiservice.BooksService
import javax.inject.Inject

/**
 * Created by shande on 12-05-2021
 */
class BooksApiHelper @Inject constructor(private val booksService: BooksService) {

    suspend fun getBooks() = booksService.getBooks("sport")

}