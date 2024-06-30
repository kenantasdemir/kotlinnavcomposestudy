package com.kenant42.kotlinnavcomposestudy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kenant42.kotlinnavcomposestudy.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
private lateinit var tasarim:FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim =  FragmentThirdBinding.inflate(inflater, container, false)

        val user = User("Ahmet",0,1.70f,false)

        tasarim.buttonGoToFourth.setOnClickListener{
            val user = User("Ahmet",0,1.70f,false)
            val gecis = ThirdFragmentDirections.toFourthFragment(user)
            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim.root
    }

}