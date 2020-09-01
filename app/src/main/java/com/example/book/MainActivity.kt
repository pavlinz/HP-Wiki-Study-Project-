package com.example.book

import android.app.Activity
import android.content.res.TypedArray
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.main_content.*

class MainActivity : Activity(), NavigationView.OnNavigationItemSelectedListener {

    var adapter : ArticleAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var articleList = ArrayList<ListItem>()
        articleList.add(ListItem(R.drawable.harrypotter, "Гарри Поттер",
            "Гарри Джеймс Поттер — главный герой Поттерианы, одноклассник и лучший " +
                    "друг Рона Уизли и Гермионы Грейнджер, член Золотого Трио."))
        articleList.add(ListItem(R.drawable.harrypotter, "Гарри Поттер",
            "Гарри Джеймс Поттер — главный герой Поттерианы, одноклассник и лучший " +
                    "друг Рона Уизли и Гермионы Грейнджер, член Золотого Трио."))
        articleList.add(ListItem(R.drawable.harrypotter, "Гарри Поттер",
            "Гарри Джеймс Поттер — главный герой Поттерианы, одноклассник и лучший " +
                    "друг Рона Уизли и Гермионы Грейнджер, член Золотого Трио."))

        rc_view.hasFixedSize()
        rc_view.layoutManager = LinearLayoutManager(this)
        adapter = ArticleAdapter(articleList, this)
        rc_view.adapter = adapter
    }


    override fun onNavigationItemSelected(item : MenuItem) : Boolean {

        when(item.itemId) {
            R.id.heroesItem -> Toast.makeText(this, "Heroes here", Toast.LENGTH_SHORT).show()
            R.id.creaturesItem -> Toast.makeText(this, "Creatures here", Toast.LENGTH_SHORT).show()
            R.id.organizationsItem -> Toast.makeText(this, "Organizations here", Toast.LENGTH_SHORT).show()
            R.id.eventsItem -> Toast.makeText(this, "Events here", Toast.LENGTH_SHORT).show()
        }

        return true
    }

    fun fillArrays(titleArray:Array<String>, descriptionsArray:Array<String>, ) : List<ListItem> {

    }

    fun getImageId(imageArrayId : Int) {
        var tArray:TypedArray = resources.obtainTypedArray(imageArrayId)
        val count = tArray.length()
    }

}