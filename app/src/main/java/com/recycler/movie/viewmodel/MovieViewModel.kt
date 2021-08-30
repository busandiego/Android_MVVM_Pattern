package com.recycler.movie.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.recycler.movie.model.MovieScript


private const val TAG = "MovieViewModel"

class MovieViewModel(application: Application): AndroidViewModel(application) {

    private val movieScriptList: MutableLiveData<List<MovieScript>> = MutableLiveData(listOf())

    fun bindMovieScriptListLive(): LiveData<List<MovieScript>> {
        return movieScriptList
    }


    fun getList() {
        Log.d(TAG, "getList: ")

        val datas = mutableListOf<MovieScript>()
        datas.apply {
            add(MovieScript(actor = "장동건", script = "니가가라 하와이"))
            add(MovieScript(actor = "원빈", script = "한발 남았다"))
            add(MovieScript(actor = "피터슨", script = "life is suffering"))
            add(MovieScript(actor = "장동건", script = "니가가라 하와이"))
            add(MovieScript(actor = "원빈", script = "한발 남았다"))
            add(MovieScript(actor = "피터슨", script = "life is suffering"))
            add(MovieScript(actor = "장동건", script = "니가가라 하와이"))
            add(MovieScript(actor = "원빈", script = "한발 남았다"))
            add(MovieScript(actor = "피터슨", script = "life is suffering"))
            add(MovieScript(actor = "장동건", script = "니가가라 하와이"))
            add(MovieScript(actor = "원빈", script = "한발 남았다"))
            add(MovieScript(actor = "피터슨", script = "life is suffering"))
            add(MovieScript(actor = "장동건", script = "니가가라 하와이"))
            add(MovieScript(actor = "원빈", script = "한발 남았다"))
            add(MovieScript(actor = "피터슨", script = "life is suffering"))
            add(MovieScript(actor = "장동건", script = "니가가라 하와이"))
            add(MovieScript(actor = "원빈", script = "한발 남았다"))
            add(MovieScript(actor = "피터슨", script = "life is suffering"))
            add(MovieScript(actor = "장동건", script = "니가가라 하와이"))
            add(MovieScript(actor = "원빈", script = "한발 남았다"))
            add(MovieScript(actor = "피터슨", script = "life is suffering"))

        }

    }
}


