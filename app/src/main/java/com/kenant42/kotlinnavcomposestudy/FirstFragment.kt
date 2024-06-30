package com.kenant42.kotlinnavcomposestudy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kenant42.kotlinnavcomposestudy.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
private lateinit var tasarim:FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim = FragmentFirstBinding.inflate(inflater, container, false)
        tasarim.buttonGoToSecond.setOnClickListener {
            //Navigation.findNavController(it).navigate(R.id.toSecondFragment)
            val gecis = FirstFragmentDirections.toSecondFragment("Ahmet",24,1.70f,false)
            Navigation.findNavController(it).navigate(gecis)
        }
        return tasarim.root
    }

}