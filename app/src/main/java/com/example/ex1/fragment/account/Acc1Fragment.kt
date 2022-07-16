package com.example.ex1.fragment.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.ex1.R
import kotlinx.android.synthetic.main.fragment_acc1.*

class Acc1Fragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_acc1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController= Navigation.findNavController(view)

        btn_redacc1.setOnClickListener{
            navController.navigate(R.id.action_acc1Fragment_to_accountFragment2)
        }

        btn_homeacc1.setOnClickListener{
            navController.navigate(R.id.action_acc1Fragment_to_accountFragment2)
        }

        btn_nextacc1.setOnClickListener{
            navController.navigate(R.id.action_acc1Fragment_to_accountFragment2)
        }
    }
}