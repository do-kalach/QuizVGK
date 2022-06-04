package com.agening.quizvgk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.agening.quizvgk.databinding.FragmentQuizQuestionsBinding

class QuizQuestions : Fragment() {

    private lateinit var binding: FragmentQuizQuestionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuizQuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }
}