package com.example.luxuryintaste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.luxuryintaste.databinding.FragmentBuyLivesHintSectionBinding

class Buy_lives_hint_sectionFragment : Fragment() {
    private var _binding:FragmentBuyLivesHintSectionBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding  = FragmentBuyLivesHintSectionBinding.inflate(inflater,container,false)
        binding.HomeIcon.setOnClickListener {
            findNavController().popBackStack(R.id.mainFragment,false)
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}