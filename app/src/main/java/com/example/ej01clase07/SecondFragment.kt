package com.example.ej01clase07

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ej01clase07.databinding.FragmentLastBinding
import com.example.ej01clase07.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        binding.aliniciodos.setOnClickListener{
            navController.navigate(R.id.action_secondFragment_to_initialFragment)
        }

    }
}