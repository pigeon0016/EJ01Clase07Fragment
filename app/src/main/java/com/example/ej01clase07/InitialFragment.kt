package com.example.ej01clase07

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ej01clase07.databinding.FragmentFirstBinding
import com.example.ej01clase07.databinding.FragmentInitialBinding

class InitialFragment : Fragment() {
    private lateinit var binding: FragmentInitialBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInitialBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        binding.btnprimero.setOnClickListener{
            navController.navigate(R.id.action_initialFragment_to_firstFragment)
        }
        binding.btnsegundo.setOnClickListener{
            navController.navigate(R.id.action_initialFragment_to_secondFragment)
        }
    }
}