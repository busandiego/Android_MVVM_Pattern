package com.recycler.movie.view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.recycler.movie.R
import com.recycler.movie.adapter.MainAdapter
import com.recycler.movie.model.MovieScript
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mainAdapter: MainAdapter
    val datas = mutableListOf<MovieScript>()

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainAdapter = MainAdapter(this)
        rv_main.adapter = mainAdapter


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
            add(MovieScript(actor = "피터슨", script = "life is suffering"))
            add(MovieScript(actor = "피터슨", script = "life is suffering"))
            add(MovieScript(actor = "피터슨", script = "life is suffering"))

        }

        mainAdapter.datas = datas
        mainAdapter.notifyDataSetChanged()



    }
}