package com.ha0.bankinglearning.fragment.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.ha0.bankinglearning.R
import kotlinx.android.synthetic.main.fragment_log1.*


class Log1Fragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_log1, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        val arg = requireArguments()
        val id = arg.getString("id")
        val password = arg.getString("password")

        btn_home.setOnClickListener {
            navController.navigate(R.id.action_log1Fragment2_to_mainFragment)
        }

        btn_nextlog.setOnClickListener {
            navController.navigate(R.id.action_log1Fragment2_to_log2Fragment)
        }

    }
}