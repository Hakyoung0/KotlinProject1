package com.example.ex1.fragment.transfer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.ex1.R
import kotlinx.android.synthetic.main.fragment_transnumber.*

class TransnumberFragment : Fragment() {
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transnumber, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)


        btn_nextnumber.setOnClickListener {
            navController.navigate(R.id.action_transnumberFragment_to_trans2Fragment)
        }


        btn_homenumber.setOnClickListener {
            navController.navigate(R.id.action_transnumberFragment_to_transferFragment)
        }

    }
}