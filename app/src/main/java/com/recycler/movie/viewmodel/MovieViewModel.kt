package com.recycler.movie.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.recycler.movie.model.MovieDTO
import com.recycler.movie.model.MovieScript
import com.recycler.movie.retrofit.Retrofit2Helper
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


private const val TAG = "MovieViewModel"

class MovieViewModel(application: Application): AndroidViewModel(application) {

    private val movieScriptList: MutableLiveData<List<MovieScript>> = MutableLiveData(listOf())
    private val movieDTOListLive: MutableLiveData<List<MovieDTO>> = MutableLiveData(listOf())
    private val userDataLive: MutableLiveData<String> = MutableLiveData("")

    fun bindMovieDTOListLive(): LiveData<List<MovieDTO>> {
        return movieDTOListLive
    }

    fun bindUserDataLive(): LiveData<String> {
        return userDataLive
    }


    fun getList() {
        Log.d(TAG, "getList: ")
        Retrofit2Helper.movieService.requestMovieList()
            .enqueue(object : Callback<Map<String, Any>> {
                override fun onResponse(
                    call: Call<Map<String, Any>>,
                    response: Response<Map<String, Any>>
                ) {
                    if (response.isSuccessful) {
                        val tempMovieList = ( response.body()?.get("data") as Map<String, Any> )
                            .get("moviews") as List<Map<String, Any>>


                        movieDTOListLive.value = tempMovieList.map {movie: Map<String, Any> ->
                            MovieDTO(
                                id = (movie.get("id") as Double).toInt(),
                                title = (movie.get("title_long")) as String,
                                rating = (movie.get("ratting") as Double).toFloat(),
                                coverImage = movie.get("large_cover_image") as String
                            )

                        }
                    }
                    Log.d(TAG, "onResponse: movieDTOListLive >>> ${movieDTOListLive}")

                }

                override fun onFailure(call: Call<Map<String, Any>>, t: Throwable) {
                    Log.d(TAG, "onFailure: ")
                }
            })






/*
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
*/

    }
}


