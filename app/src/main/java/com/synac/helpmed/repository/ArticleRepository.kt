package com.synac.helpmed.repository

import android.content.Context
import com.synac.helpmed.jsonParse.ArticleParsing
import com.synac.helpmed.mapper.toUiModel
import com.synac.helpmed.uiDataClasses.ArticleUiDataClass
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class ArticleRepository @Inject constructor(@param:ApplicationContext private val context: Context) {
    suspend fun getArticleData(): List<ArticleUiDataClass> {
        return ArticleParsing.loadArticleJsonFromRaw(
            context
        ).map { it.toUiModel() }
    }
}