package com.example.ej01clase07

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.example.ej01clase07.databinding.ActivityMainBinding
import com.example.ej01clase07.databinding.FragmentFirstBinding
import com.example.ej01clase07.databinding.FragmentInitialBinding
import com.example.ej01clase07.databinding.FragmentSecondBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
   // private lateinit var primerfragmento: FirstFragment
    //private lateinit var segundofragmento: SecondFragment
    //private lateinit var inicialfragmento: InitialFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // primerfragmento = FirstFragment()
        //segundofragmento = SecondFragment()




    }

   /* override fun onStart(){
        super.onStart()
        // supportFragmentManager.beginTransaction().add(R.id.clinitial)
        binding.btnprimero.setOnClickListener{
            /*val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(binding.clinitial.id, primerfragmento).commit()
            transaction.addToBackStack(null)
            */
            supportFragmentManager.beginTransaction().add(R.id.fragmentContainerView2,primerfragmento).commit()

        }

        binding.btnsegundo.setOnClickListener{
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(binding.clinitial.id, segundofragmento).commit()
            transaction.addToBackStack(null)
        }
    }*/
}