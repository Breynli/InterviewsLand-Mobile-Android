package com.example.interviewsland_mobile_android.ui.view.fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.interviewsland_mobile_android.R
import com.example.interviewsland_mobile_android.databinding.FragmentSavedQuestionsBinding


class SavedQuestionsFragment : Fragment() {
    private lateinit var binding: FragmentSavedQuestionsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSavedQuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}