package com.perusudroid.kotlinbasics.binding.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.perusudroid.kotlinbasics.R
import com.perusudroid.kotlinbasics.databinding.FragmentHomeBinding

/**
 * Created by Intel on 02-05-2018.
 */
class HomeFragment : Fragment() {

    var binding: FragmentHomeBinding? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding?.root

    }


}