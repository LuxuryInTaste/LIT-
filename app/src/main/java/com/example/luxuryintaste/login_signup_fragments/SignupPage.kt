package com.example.luxuryintaste.login_signup_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.luxuryintaste.R
import com.example.luxuryintaste.databinding.FragmentSignupPageBinding

class SignupPage : Fragment() {

    private var _binding: FragmentSignupPageBinding?=null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentSignupPageBinding.inflate(inflater,container,false)
        binding.btnLogin.setOnClickListener {
            findNavController()
                .navigate(R.id.action_signupPage_to_loginPage)
        }
        binding.btnSignUp.setOnClickListener {
            findNavController()
                .navigate(R.id.action_signupPage_to_mainFragment)
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

 }