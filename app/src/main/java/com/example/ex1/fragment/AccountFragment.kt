package com.example.ex1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.ex1.R
import kotlinx.android.synthetic.main.fragment_account.*
import kotlinx.android.synthetic.main.fragment_make.*
import kotlinx.android.synthetic.main.fragment_make.btn_back
import kotlinx.android.synthetic.main.fragment_transfer.*

class AccountFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController= Navigation.findNavController(view)

        btn_red4.setOnClickListener{
            navController.navigate(R.id.action_accountFragment2_to_acc1Fragment)
        }

        btn_home4.setOnClickListener{
            navController.navigate(R.id.action_accountFragment2_to_mainFragment)
        }

        btn_back4.setOnClickListener{
            navController.navigate(R.id.action_accountFragment2_to_mainFragment)
        }
    }

}