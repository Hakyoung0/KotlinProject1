package com.example.ex1.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.ex1.R
import kotlinx.android.synthetic.main.fragment_main.*



class MainFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController= Navigation.findNavController(view)

        btn_certification.setOnClickListener{
            navController.navigate(R.id.action_mainFragment_to_cerFragment)
        }

        btn_login.setOnClickListener{
            navController.navigate(R.id.action_mainFragment_to_loginFragment)
        }

        btn_make.setOnClickListener{
            navController.navigate(R.id.action_mainFragment_to_makeFragment2)
        }

        btn_account.setOnClickListener{
            navController.navigate(R.id.action_mainFragment_to_accountFragment2)
        }

        btn_transfer.setOnClickListener{
            navController.navigate(R.id.action_mainFragment_to_transferFragment)
        }

        btn_menu.setOnClickListener{
            navController.navigate(R.id.action_mainFragment_to_menuFragment2)
        }
        btn_url.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.shinhaninvest.com/siw/customer-center/protection/customer_education_senior/contents.do"))
            startActivity(intent)
        }

    }

}