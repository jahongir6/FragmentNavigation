package com.example.fragmentnavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentnavigation.R
import com.example.fragmentnavigation.databinding.FragmentSecondBinding
import com.example.fragmentnavigation.models.User


class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        val user = arguments?.getSerializable("keyUser") as User
        binding.tvName.text = user.name
        binding.tvAge.text = user.age.toInt().toString()
        return binding.root
    }
}