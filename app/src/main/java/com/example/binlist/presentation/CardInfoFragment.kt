package com.example.binlist.presentation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.binlist.R
import com.example.binlist.databinding.FragmentCardInfoBinding
import com.example.binlist.databinding.FragmentCardListBinding

class CardInfoFragment : Fragment() {

    companion object {
        fun newInstance() = CardInfoFragment()
    }

    private lateinit var viewModel: CardInfoViewModel
    private var _binding : FragmentCardInfoBinding?= null
    private val binding : FragmentCardInfoBinding
        get() = _binding ?: throw RuntimeException("FragmentCardInfoBinding == null")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCardInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[CardInfoViewModel::class.java]
    }

}