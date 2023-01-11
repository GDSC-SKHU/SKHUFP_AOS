package com.example.mycloset.fragment.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton

import androidx.fragment.app.Fragment
import com.example.mycloset.R
import com.example.mycloset.presentation.closet.AddClosetActivity
import kotlinx.android.synthetic.main.fragment_all.*
import kotlinx.android.synthetic.main.fragment_shoes.*

class AllFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_all,null)
        var addButton = view?.findViewById<AppCompatButton>(R.id.fragment_all_btn_add)

        addButton!!.setOnClickListener(object :View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(context, AddClosetActivity::class.java)
                startActivity(intent)
            }
        })

        /*fragment_all_btn_add.setOnClickListener {
            val intent = Intent(activity,AddClosetActivity::class.java)
            startActivity(intent)
            /*activity?.let {
                var intent = Intent(context,AddClosetActivity::class.java)
                startActivity(intent)
            }*/
            /*fun onClick (view: View) {
                val intent = Intent(getActivity(),AddClosetActivity::class.java)
                startActivity(intent)
            }*/
        }*/
        return view
    }

}