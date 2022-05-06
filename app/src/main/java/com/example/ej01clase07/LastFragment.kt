package com.example.ej01clase07

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ej01clase07.databinding.FragmentInitialBinding
import com.example.ej01clase07.databinding.FragmentLastBinding


class LastFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentLastBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLastBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        binding.alinicioultimo.setOnClickListener{
            navController.navigate(R.id.action_lastFragment_to_initialFragment)
        }

    }
}