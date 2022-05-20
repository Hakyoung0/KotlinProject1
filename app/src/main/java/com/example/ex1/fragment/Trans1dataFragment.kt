package com.example.ex1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.ex1.R
import com.example.ex1.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.fragment_trans1.*
import kotlinx.android.synthetic.main.fragment_trans1.btn_home51
import kotlinx.android.synthetic.main.fragment_trans1data.*


class Trans1dataFragment : Fragment() {



    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trans1data, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        btn_red511.setOnClickListener {
            navController.navigate(R.id.action_trans1dataFragment_to_trans1Fragment)
        }

    }
}
