package com.example.bankinglearning.fragment.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.bankinglearning.R
import com.example.bankinglearning.R.layout.fragment_menunav
import kotlinx.android.synthetic.main.fragment_menunav.*



class MenunavFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(fragment_menunav, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController= Navigation.findNavController(view)


        btn_home.setOnClickListener{
            navController.navigate(R.id.action_menunavFragment2_to_mainFragment)
        }

        btn_menunext.setOnClickListener{
            navController.navigate(R.id.action_menunavFragment2_to_menunav2Fragment)
        }
    }

}