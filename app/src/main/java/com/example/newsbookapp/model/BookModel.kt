package com.example.newsbookapp.model

/**
 * Created by shande on 12-05-2021
 */
data class BookModel(val id: String, val volumeInfo: VolumeInfo)

data class VolumeInfo(val title: String, val publisher: String, val publishedDate: String, val pageCount: Int, val imageLinks: ImageLinks)

data class ImageLinks(val thumbnail: String)
