package com.example.luxuryintaste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.luxuryintaste.databinding.FragmentChoiceSectionBinding


class Choice_sectionFragment : Fragment() {
    private var _binding : FragmentChoiceSectionBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentChoiceSectionBinding.inflate(inflater,container,false)
        binding.genderMen.setOnClickListener {
            findNavController().navigate(R.id.action_choice_sectionFragment_to_select_Section_AccessoriesFragment)
        }
        binding.genderWomen.setOnClickListener {
            findNavController().navigate(R.id.action_choice_sectionFragment_to_select_Section_AccessoriesFragment)
        }
        binding.genderAll.setOnClickListener {
            findNavController().navigate(R.id.action_choice_sectionFragment_to_select_Section_AccessoriesFragment)
        }
        binding.genderToHome.setOnClickListener {
            findNavController().popBackStack(R.id.mainFragment,false)
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}