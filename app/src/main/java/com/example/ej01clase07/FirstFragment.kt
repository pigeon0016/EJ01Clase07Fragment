package com.example.ej01clase07

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ej01clase07.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

   private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        binding.acasa1.setOnClickListener{
            navController.navigate(R.id.action_firstFragment_to_initialFragment)
        }
        binding.alultimo1.setOnClickListener{
            navController.navigate(R.id.action_firstFragment_to_lastFragment)
        }
    }
}