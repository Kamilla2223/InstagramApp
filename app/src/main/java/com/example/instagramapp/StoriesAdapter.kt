package com.example.instagramapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramapp.databinding.ItemStoriesBinding

class StoriesAdapter(private val context: Context?) : RecyclerView.Adapter<StoriesAdapter.StoryViewHolder>() {
    private val storiesList: List<String> =
        listOf("mary.m", "1123pow", "magomedova.f", "aabvf", "circle.root")
    private val assetsManager = context?.assets
    private val icons = assetsManager?.list("stories")
    private val iconsList : List<Int> = listOf(
        R.drawable.daniel_buhat_t__gsiywrlo_unsplash,
        R.drawable.gabriella_clare_marino_elvwctovl4u_unsplash,


    )

    inner class StoryViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = ItemStoriesBinding.bind(item)
        fun bind(position: Int) {
            binding.accName.text = storiesList[position]
            binding.avatar.
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        return StoryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_stories, parent, false)
        )
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = storiesList.size

}
