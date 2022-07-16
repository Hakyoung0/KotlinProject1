package com.example.ex1.fragment.transfer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.ex1.R
import kotlinx.android.synthetic.main.fragment_transbank.*

class TransbankFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transbank, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        btn_redtransbank.setOnClickListener {
            navController.navigate(R.id.action_transbankFragment_to_transnumberFragment)
        }

        btn_homebank.setOnClickListener {
            navController.navigate(R.id.action_transbankFragment_to_transferFragment)
        }
    }
}
