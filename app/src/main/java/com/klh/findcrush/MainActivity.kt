package com.klh.findcrush

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.klh.findcrush.Adapter.PostAdapter
import com.klh.findcrush.model.Post
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        newFeed()
    }

    fun newFeed() {
        var newFeedRecyclerView: RecyclerView = findViewById(R.id.recycler_view)

        var postList = ArrayList<Post>()
        postList.add(Post("Amanda",R.drawable.amanda, R.drawable.amandapost))
        postList.add(Post("Scarlet",R.drawable.scarlet,R.drawable.scarletpost))

        val postAdapter = PostAdapter(postList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = postAdapter
    }
}
