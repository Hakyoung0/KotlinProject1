package com.ha0.bankinglearning.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.ha0.bankinglearning.R
import kotlinx.android.synthetic.main.fragment_cer.*

class CerFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cer, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)


        btn_home.setOnClickListener {
            navController.navigate(R.id.action_cerFragment_to_mainFragment)
        }

        btn_back1.setOnClickListener {
            navController.navigate(R.id.action_cerFragment_to_mainFragment)
        }
        btn_red1.setOnClickListener {
            navController.navigate(R.id.action_cerFragment_to_cer1Fragment)
        }


    }

}