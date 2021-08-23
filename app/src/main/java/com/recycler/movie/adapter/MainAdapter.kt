package com.recycler.movie.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.recycler.movie.R
import com.recycler.movie.model.MovieScript


class MainAdapter(private val context: Context):
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    var datas = mutableListOf<MovieScript>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view =
            LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false)

        return ViewHolder(view = view)
    }


    override fun getItemCount(): Int {
            return datas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(datas[position])
    }



    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        private val actorView: TextView = itemView.findViewById(R.id.rv_item_first)
        private val scriptView: TextView = itemView.findViewById(R.id.rv_item_second)

        fun bind(item: MovieScript){
            actorView.text = item.actor
            scriptView.text = item.script

        }


    }

}