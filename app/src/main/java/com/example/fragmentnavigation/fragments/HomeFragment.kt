package com.example.fragmentnavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.fragmentnavigation.R
import com.example.fragmentnavigation.databinding.FragmentHomeBinding
import com.example.fragmentnavigation.models.User


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        binding.btnSave.setOnClickListener {
            val user = User(
                binding.edtName.text.toString(),
                binding.edtNumber.text.toString().toInt()
            )

            findNavController().navigate(R.id.secondFragment, bundleOf("keyUser" to user ))
        }
        return binding.root
    }
}