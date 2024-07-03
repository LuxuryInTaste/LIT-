package com.example.luxuryintaste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.luxuryintaste.databinding.FragmentMainBinding
import com.example.luxuryintaste.databinding.FragmentSelectSectionAccessoriesBinding

class Select_Section_AccessoriesFragment : Fragment() {
    private var _binding : FragmentSelectSectionAccessoriesBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding  = FragmentSelectSectionAccessoriesBinding.inflate(inflater,container,false)
        binding.shoesIcon.setOnClickListener {
            findNavController().navigate(R.id.action_select_Section_AccessoriesFragment_to_buy_lives_hint_sectionFragment)
        }
        binding.clothingIcon.setOnClickListener {
            findNavController().navigate(R.id.action_select_Section_AccessoriesFragment_to_buy_lives_hint_sectionFragment)
        }
        binding.bagsIcon.setOnClickListener {
            findNavController().navigate(R.id.action_select_Section_AccessoriesFragment_to_buy_lives_hint_sectionFragment)
        }
        binding.AccessoriesIcon.setOnClickListener {
            findNavController().navigate(R.id.action_select_Section_AccessoriesFragment_to_buy_lives_hint_sectionFragment)
        }
        binding.HomeIcon.setOnClickListener {
            findNavController().popBackStack(R.id.mainFragment,false)
        }
        return binding.root    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}