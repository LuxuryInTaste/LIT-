package com.example.luxuryintaste.login_signup_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.luxuryintaste.R
import com.example.luxuryintaste.databinding.FragmentLoginPageBinding

class LoginPage : Fragment() {
    private var _binding: FragmentLoginPageBinding?=null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentLoginPageBinding.inflate(inflater,container,false)
        binding.btnLog.setOnClickListener {
            findNavController().navigate(R.id.action_loginPage_to_mainFragment)
        }
        binding.btnSignup.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }



}