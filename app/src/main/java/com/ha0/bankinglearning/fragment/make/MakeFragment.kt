package com.ha0.bankinglearning.fragment.make

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.ha0.bankinglearning.R
import kotlinx.android.synthetic.main.fragment_make.*


class MakeFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_make, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController= Navigation.findNavController(view)

        btn_redmake1.setOnClickListener{
            navController.navigate(R.id.action_makeFragment2_to_make1Fragment)
        }

        btn_homemake.setOnClickListener{
            navController.navigate(R.id.action_makeFragment2_to_mainFragment)
        }

        btn_backmake.setOnClickListener{
            navController.navigate(R.id.action_makeFragment2_to_mainFragment)
        }
    }

}