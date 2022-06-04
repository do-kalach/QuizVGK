package com.agening.quizvgk

import android.content.Intent
import android.os.Bundle
import android.provider.SyncStateContract
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.agening.quizvgk.databinding.FragmentWelcomeScreenBinding


class WelcomeScreen : Fragment() {

    private lateinit var binding: FragmentWelcomeScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentWelcomeScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.instaLink.movementMethod = LinkMovementMethod.getInstance()

        binding.btnStart.setOnClickListener {
            if (binding.etName.text.toString().isEmpty())
                Toast.makeText(requireContext(), "Пожалуйста введите свое имя", Toast.LENGTH_SHORT).show()
            else {

            }
        }
    }

}