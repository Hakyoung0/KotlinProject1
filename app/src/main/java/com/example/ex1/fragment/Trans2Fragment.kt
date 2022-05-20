package com.example.ex1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.ex1.R
import kotlinx.android.synthetic.main.fragment_trans1.*
import kotlinx.android.synthetic.main.fragment_trans2.*

class Trans2Fragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trans2, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        btn_next2.setOnClickListener {
            navController.navigate(R.id.action_trans2Fragment_to_transfinishFragment)
        }

        btn_home52.setOnClickListener {
            navController.navigate(R.id.action_trans2Fragment_to_transferFragment)
        }

    }

}