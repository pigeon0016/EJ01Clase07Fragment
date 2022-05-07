package com.example.ej01clase07

import android.util.Log
import kotlin.random.Random
import kotlin.random.nextInt

class RandomNumber {
    val numeroRandom = Random(30)
    fun generarSecuencia(){
        var i=0
        while(i<5){
            try{
                Thread.sleep(1000)
                val mRandoNumber = numeroRandom.nextInt(100)
                Log.i("Numero Random", "Numero aleatorio: $mRandoNumber")
                i++
            }catch (e:Exception){
                Log.i("Numero Random", "Error")
            }
        }
    }


    /*fun valorRandom(valores:IntRange) : Int{
        var r = Random(5)
        var valorRandom = r.nextInt(valores.last - valores.first) + valores.first
        return valorRandom
    }*/

}