//package com.example.secondappkotlin
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import androidx.recyclerview.widget.RecyclerView
//
//class Adapter (
//    private val context : Context,
//    private val img :  ArrayList<String>
//        ) : RecyclerView.Adapter<Adapter.ViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
//        val view = LayoutInflater.from(ViewGroup.con)
//            .inflate(R.layout.row_layout, viewGroup, false)
//        return ViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
//        TODO("Not yet implemented")
//    }
//
//    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
//    }
//
//    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//
//        var img: ImageView
//
//        init {
//            img =
//                view.findViewById<View>(R.id.iv) as ImageView
//        }
//
//    }
//}
