package com.androiddevs.mvvmnewsapp.ui.ui.fragments

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.androiddevs.mvvmnewsapp.ui.repository.NewsRespository

class NewsViewModelProviderFactory(
    val newsRespository: NewsRespository
) :  ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRespository) as T
    }
}