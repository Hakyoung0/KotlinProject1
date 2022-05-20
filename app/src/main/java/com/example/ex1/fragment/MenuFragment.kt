package com.example.ex1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.ex1.R
import com.example.ex1.R.layout.fragment_menu
import kotlinx.android.synthetic.main.fragment_menu.*
import kotlinx.android.synthetic.main.fragment_transfer.*
import kotlinx.android.synthetic.main.fragment_transfer.btn_back

class MenuFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController= Navigation.findNavController(view)

        btn_red6.setOnClickListener{
            navController.navigate(R.id.action_menuFragment2_to_menunavFragment2)
        }

        btn_home.setOnClickListener{
            navController.navigate(R.id.action_menuFragment2_to_mainFragment)
        }

        btn_back6.setOnClickListener{
            navController.navigate(R.id.action_menuFragment2_to_mainFragment)
        }
    }


}