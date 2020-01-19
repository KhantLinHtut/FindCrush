package com.klh.findcrush.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.klh.findcrush.R
import com.klh.findcrush.model.Post
import kotlinx.android.synthetic.main.newfeed.view.*

class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var name = itemView.findViewById<TextView>(R.id.txt_name)
    var profilePic = itemView.findViewById<ImageView>(R.id.img_profile_pic)
    var postPic = itemView.findViewById<ImageView>(R.id.img_post)
}

class PostAdapter (var postList: ArrayList<Post>): RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.newfeed,parent,false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.name.text = postList[position].name
        holder.postPic.setImageResource(postList[position].postPic)
        holder.profilePic.setImageResource(postList[position].profilePic)
    }

}