package com.example.book

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ArticleAdapter(listArray : ArrayList<ListItem>, context : Context) :
    RecyclerView.Adapter<ArticleAdapter.ViewHolder>() {

    var listArrayR = listArray
    var contextR = context

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val tvTitle = view.findViewById<TextView>(R.id.title_tv)
        val tvContent = view.findViewById<TextView>(R.id.short_desc_tv)
        val img = view.findViewById<ImageView>(R.id.main_img)

        fun bind(listItem : ListItem, context: Context) {
            tvTitle.text = listItem.titleText
            tvContent.text = listItem.shortDescription
            img.setImageResource(listItem.ImageId)
            itemView.setOnClickListener() {
                Toast.makeText(context, "Article opening", Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(contextR)
        return ViewHolder(inflater.inflate(R.layout.item_layout_rc, parent, false))
    }

    override fun getItemCount(): Int {
        return listArrayR.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var listItem = listArrayR.get(position)
        holder.bind(listItem, contextR)
    }

    fun updateAdapter(listArray: List<ListItem>) {
        listArrayR.clear()
        listArrayR.addAll(listArray)
        notifyDataSetChanged()
    }

}