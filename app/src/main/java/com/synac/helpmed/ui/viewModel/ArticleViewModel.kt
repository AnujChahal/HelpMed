package com.synac.helpmed.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.synac.helpmed.repository.ArticleRepository
import com.synac.helpmed.uiDataClasses.ArticleUiDataClass
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ArticleViewModel @Inject constructor(
    private val articleRepository: ArticleRepository
): ViewModel() {
    private val _articleList = MutableStateFlow<List<ArticleUiDataClass>> (emptyList())
    val articleList: StateFlow<List<ArticleUiDataClass>> = _articleList

    private val _selectedArticle = MutableStateFlow<ArticleUiDataClass?> (null)
    val selectedArticle: StateFlow<ArticleUiDataClass?> = _selectedArticle

    init {
        fetchArticleList()
    }

    fun fetchArticleList() {
        viewModelScope.launch {
            _articleList.value = articleRepository.getArticleData()
        }
    }

    fun selectedArticle(name: String) {
        _selectedArticle.value = _articleList.value.find { it.name == name }
    }
}