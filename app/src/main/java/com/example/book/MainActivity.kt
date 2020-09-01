package com.example.book

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.main_content.*

class MainActivity : Activity() {


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

        rc_view.adapter = ArticleAdapter(articleList, this)
    }
}