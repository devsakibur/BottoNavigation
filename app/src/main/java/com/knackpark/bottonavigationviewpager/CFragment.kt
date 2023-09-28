package com.knackpark.bottonavigationviewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.knackpark.bottonavigationviewpager.databinding.FragmentCBinding

class CFragment : Fragment() {
    private lateinit var binding : FragmentCBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCBinding.inflate(layoutInflater , container , false)

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CFragment().apply {

            }
    }
}