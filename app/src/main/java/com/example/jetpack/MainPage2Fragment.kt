package com.example.jetpack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class MainPage2Fragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_page2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn2=view.findViewById<Button>(R.id.btn2)
//        btn2.setOnClickListener(View.OnClickListener {
//            Navigation.findNavController(view).navigate(R.id.action_page3)
//        })
//        btn2.setOnClickListener(View.OnClickListener {
//
//        })
        btn2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_page3)
        }
    }


}