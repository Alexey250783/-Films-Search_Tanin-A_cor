package com.amsdevelops.filmssearch.view.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.amsdevelops.filmssearch.utils.AnimationHelper
import com.example.filmssearch.databinding.FragmentSelectionsBinding
import androidx.fragment.app.Fragment
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.amsdevelops.filmssearch.domain.Film
import com.amsdevelops.filmssearch.view.MainActivity
import com.amsdevelops.filmssearch.view.rv_adapters.FilmListRecyclerAdapter
import com.amsdevelops.filmssearch.viewmodel.HomeFragmentViewModel
import java.util.*


class SelectionsFragment : Fragment() {
    private lateinit var binding: FragmentSelectionsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        AnimationHelper.performFragmentCircularRevealAnimation(
            binding.selectionsFragmentRoot,
            requireActivity(),
            4
        )
    }
}