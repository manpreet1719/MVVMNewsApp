package com.androiddevs.mvvmnewsapp.ui.repository

import com.androiddevs.mvvmnewsapp.ui.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.ui.db.ArticleDataBase
import com.androiddevs.mvvmnewsapp.ui.models.Article

class NewsRespository(
    val db : ArticleDataBase
){

    suspend fun getBreakingNews(countryCode : String,pageNumber : Int) =
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)

    suspend fun getsearchNews(searchQuery:String,pageNumber: Int) =
        RetrofitInstance.api.SearchForNews(searchQuery,pageNumber)

    suspend fun upsert(article : Article){
        db.getArticleDao().upsert(article)
    }

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)


}