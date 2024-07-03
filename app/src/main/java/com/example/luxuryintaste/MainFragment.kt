package com.example.luxuryintaste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.luxuryintaste.databinding.FragmentBuyLivesHintSectionBinding
import com.example.luxuryintaste.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var _binding : FragmentMainBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding  = FragmentMainBinding.inflate(inflater,container,false)
        binding.playTheGameNow.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_choice_sectionFragment)
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}