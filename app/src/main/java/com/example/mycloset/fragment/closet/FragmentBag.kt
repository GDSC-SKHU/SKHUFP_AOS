package com.example.mycloset.fragment.closet

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mycloset.R

class FragmentBag :Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater?,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        return inflater?.inflate(R.layout.fragment_bag, container, false)
    }
}
//현재까지 필요없음