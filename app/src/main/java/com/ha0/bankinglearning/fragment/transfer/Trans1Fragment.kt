package com.ha0.bankinglearning.fragment.transfer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.ha0.bankinglearning.R
import kotlinx.android.synthetic.main.fragment_trans1.*


class Trans1Fragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trans1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        btn_redtrans1.setOnClickListener {
            navController.navigate(R.id.action_trans1Fragment_to_transbankFragment)
        }



        btn_hometrans1.setOnClickListener {
            navController.navigate(R.id.action_trans1Fragment_to_transferFragment)
        }

        btn_backtrans1.setOnClickListener {
            navController.navigate(R.id.action_trans1Fragment_to_transferFragment)
        }

    }
}