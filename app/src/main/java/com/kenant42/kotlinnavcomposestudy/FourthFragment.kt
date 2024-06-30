package com.kenant42.kotlinnavcomposestudy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.kenant42.kotlinnavcomposestudy.databinding.FragmentFourthBinding


class FourthFragment : Fragment() {
private lateinit var tasarim:FragmentFourthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val bundle:FourthFragmentArgs by navArgs()

        val ad = bundle.nesne.name
        val yas = bundle.nesne.age
        val boy = bundle.nesne.height
        val evliMi = bundle.nesne.isMarried

        tasarim.adTextViewF.text = ad
        tasarim.yasTextViewF.text = yas.toString()
        tasarim.boyTextViewF.text = boy.toString()
        tasarim.evliMiTextViewF.text = evliMi.toString()

       val tasarim = FragmentFourthBinding.inflate(inflater, container, false)
        return tasarim.root



    }

}