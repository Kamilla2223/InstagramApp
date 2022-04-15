package com.example.instagramapp

import android.os.Bundle
import android.view.*
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.instagramapp.databinding.FragmentAccountBinding

class AccountFragment: Fragment() {

    private lateinit var binding: FragmentAccountBinding
    private lateinit var storiesAdapter: StoriesAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.main_menu, menu)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        requireActivity().setActionBar(binding.toolbarMain as Toolbar)
        binding.rvStories.setHasFixedSize(true)
        storiesAdapter = StoriesAdapter(context)
        binding.rvStories.adapter = storiesAdapter
    }
}