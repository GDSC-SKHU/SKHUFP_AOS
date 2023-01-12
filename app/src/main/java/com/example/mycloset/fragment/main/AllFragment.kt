package com.example.mycloset.fragment.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.mycloset.MainActivity
import com.example.mycloset.R
import com.example.mycloset.fragment.closet.AddClosetFragment
import kotlinx.android.synthetic.main.fragment_add_closet.*
import kotlinx.android.synthetic.main.fragment_all.*
import kotlinx.android.synthetic.main.fragment_shoes.*


class AllFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_all, container, false)
        /*val mActivity = activity as MainActivity

        val btn_change = rootView.findViewById<AppCompatButton>(R.id.fragment_all_btn_add);
        btn_change.setOnClickListener{
            mActivity.changeFragment(1)
        }
        return rootView*/
        fragment_all_btn_add.setOnClickListener {
            View.OnClickListener(){
                fun onClick(view: View){
                    var intent = Intent(getActivity(),AddClosetFragment::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                    startActivity(intent)
                }
            }
        }
        return rootView
    }
}