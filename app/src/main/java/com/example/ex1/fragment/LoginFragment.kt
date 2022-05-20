package com.example.ex1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.ex1.R
import kotlinx.android.synthetic.main.fragment_log1.*
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_trans1.*

class LoginFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        btn_login2.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToLog1Fragment2(id = "id", password = "password")
            findNavController().navigate(action)
        }


        btn_home2.setOnClickListener {
            navController.navigate(R.id.action_loginFragment_to_mainFragment)
        }

        btn_back.setOnClickListener {
            navController.navigate(R.id.action_loginFragment_to_mainFragment)
        }

    }
}