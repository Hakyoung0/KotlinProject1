package com.example.ex1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.ex1.R

import kotlinx.android.synthetic.main.fragment_transfer.*


class TransferFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transfer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController= Navigation.findNavController(view)

        btn_redtrans.setOnClickListener{
            navController.navigate(R.id.action_transferFragment_to_trans1Fragment)
        }

        btn_backtrans.setOnClickListener{
            navController.navigate(R.id.action_transferFragment_to_mainFragment)
        }

        btn_hometrans.setOnClickListener{
            navController.navigate(R.id.action_transferFragment_to_mainFragment)
        }
    }


}