package com.kenant42.kotlinnavcomposestudy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.kenant42.kotlinnavcomposestudy.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim = FragmentSecondBinding.inflate(inflater, container, false)
        val bundle:SecondFragmentArgs by navArgs()

        val ad = bundle.name
        val yas = bundle.age
        val boy = bundle.height
        val evliMi = bundle.isMarried

        tasarim.adTextView.text = ad
        tasarim.yasTextView.text = yas.toString()
        tasarim.heightTextView.text = boy.toString()
        tasarim.evliMiTextView.text = evliMi.toString()


        tasarim.buttonGoToThird.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toThirdFragment)
        }
        return tasarim.root
    }


}