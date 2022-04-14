package com.androiddevs.mvvmnewsapp.ui.repository

import com.androiddevs.mvvmnewsapp.ui.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.ui.db.ArticleDataBase

class NewsRespository(
    val db : ArticleDataBase
){

    suspend fun getBreakingNews(countryCode : String,pageNumber : Int) =
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)


}