package com.knackpark.bottonavigationviewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.knackpark.bottonavigationviewpager.databinding.ActivityMainBinding
import com.knackpark.bottonavigationviewpager.databinding.FragmentABinding
import kotlinx.coroutines.NonDisposableHandle.parent

class AFragment : Fragment() {
    private lateinit var binding : FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentABinding.inflate(layoutInflater , container , false)

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AFragment().apply {

                }
            }
    }
