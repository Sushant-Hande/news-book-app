package com.example.newsbookapp.dashboard.books

import com.example.newsbookapp.network.apihelper.BooksApiHelper
import javax.inject.Inject

/**
 * Created by shande on 12-05-2021
 */
class BooksRepository @Inject constructor(private val booksApiHelper: BooksApiHelper) {

    suspend fun getBooks() = booksApiHelper.getBooks()

}