package com.androiddevs.mvvmnewsapp.ui.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


@Entity(
    tableName = "articles"
)
data class Article(
    @PrimaryKey
    val url: String="",
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: Source?=null,
    val title: String?,
    val urlToImage: String?
): Serializable