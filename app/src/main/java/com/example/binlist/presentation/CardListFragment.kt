package com.example.binlist.presentation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.binlist.R
import com.example.binlist.databinding.FragmentCardListBinding

class CardListFragment : Fragment() {

    companion object {
        fun newInstance() = CardListFragment()
    }

    private lateinit var viewModel: CardListViewModel
    private var _binding: FragmentCardListBinding? = null
    private val binding: FragmentCardListBinding
        get() = _binding ?: throw RuntimeException("FragmentCardListBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCardListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[CardListViewModel::class.java]
        binding.rvCardList
    }
}