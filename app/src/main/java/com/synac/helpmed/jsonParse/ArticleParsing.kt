package com.synac.helpmed.jsonParse

import android.content.Context
import com.synac.helpmed.R
import kotlinx.coroutines.Dispatchers
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.synac.helpmed.data.ArticleDataClass
import kotlinx.coroutines.withContext

object ArticleParsing {

    suspend fun loadArticleJsonFromRaw(context: Context): List<ArticleDataClass> =
        withContext(Dispatchers.IO) {

            val inputStream = context.resources.openRawResource(R.raw.article)

            val reader = inputStream.bufferedReader().use { it.readText() }

            val listType = object : TypeToken<List<ArticleDataClass>>() {}.type

            Gson().fromJson(reader, listType)
        }
}