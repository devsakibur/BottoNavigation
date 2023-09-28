package com.knackpark.bottonavigationviewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.knackpark.bottonavigationviewpager.databinding.FragmentEBinding

class EFragment : Fragment() {
    private lateinit var binding : FragmentEBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEBinding.inflate(layoutInflater , container , false)

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            EFragment().apply {

            }
    }
}