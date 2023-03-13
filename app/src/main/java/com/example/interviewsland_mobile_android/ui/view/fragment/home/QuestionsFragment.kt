package com.example.interviewsland_mobile_android.ui.view.fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.interviewsland_mobile_android.R
import com.example.interviewsland_mobile_android.databinding.FragmentQuestionsBinding


class QuestionsFragment : Fragment() {
    private lateinit var binding: FragmentQuestionsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}