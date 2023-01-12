package com.example.mycloset

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.mycloset.fragment.closet.AddClosetFragment
import com.example.mycloset.fragment.main.AllFragment
import kotlinx.android.synthetic.main.fragment_add_closet.*
import kotlinx.android.synthetic.main.fragment_all.*
import kotlinx.android.synthetic.main.fragment_bag.*
import kotlinx.android.synthetic.main.fragment_bottom.*
import kotlinx.android.synthetic.main.fragment_outer.*
import kotlinx.android.synthetic.main.fragment_shoes.*
import kotlinx.android.synthetic.main.fragment_stuff.*
import kotlinx.android.synthetic.main.fragment_top.*

@Suppress("deprecation")
class MainActivity : AppCompatActivity(), ActionBar.TabListener {

    lateinit var actionBar : ActionBar // actionbar 참조 변수

    lateinit var tabAll : ActionBar.Tab
    lateinit var tabTop : ActionBar.Tab
    lateinit var tabBottom : ActionBar.Tab
    lateinit var tabOuter : ActionBar.Tab
    lateinit var tabShoes : ActionBar.Tab
    lateinit var tabBag : ActionBar.Tab
    lateinit var tabStuff : ActionBar.Tab


    var myFrags = arrayOfNulls<Fragment>(7)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        var bar = this.supportActionBar // 상단에 표시할 액션바 준비
        // 탭 호스트와 같이 탭의 모양이 되도록 설정
        bar!!.navigationMode = ActionBar.NAVIGATION_MODE_TABS

        tabAll = bar.newTab() // 액션바에 탭 생성
        tabAll.text = "전체"
        tabAll.setTabListener(this) // 탭을 터치하면 작동하는 리스너 지정
        bar.addTab(tabAll) // 액션바에 탭 추가

        tabTop = bar.newTab()
        tabTop.text = "상의"
        tabTop.setTabListener(this)
        bar.addTab(tabTop)

        tabBottom = bar.newTab()
        tabBottom.text = "하의"
        tabBottom.setTabListener(this)
        bar.addTab(tabBottom)

        tabOuter = bar.newTab()
        tabOuter.text = "아우터"
        tabOuter.setTabListener(this)
        bar.addTab(tabOuter)

        tabShoes = bar.newTab()
        tabShoes.text = "신발"
        tabShoes.setTabListener(this)
        bar.addTab(tabShoes)

        tabBag = bar.newTab()
        tabBag.text = "가방"
        tabBag.setTabListener(this)
        bar.addTab(tabBag)

        tabStuff = bar.newTab()
        tabStuff.text = "잡화"
        tabStuff.setTabListener(this)
        bar.addTab(tabStuff)


    }

    override fun onTabSelected(tab: ActionBar.Tab?, ft: FragmentTransaction?) {

        var position :Int = tab!!.position

        when(position) {
            0 -> setContentView(R.layout.fragment_all)
            1 -> setContentView(R.layout.fragment_top)
            2 -> setContentView(R.layout.fragment_bottom)
            3 -> setContentView(R.layout.fragment_outer)
            4 -> setContentView(R.layout.fragment_shoes)
            5 -> setContentView(R.layout.fragment_bag)
            6 -> setContentView(R.layout.fragment_stuff)

        }
    }

    override fun onTabUnselected(tab: ActionBar.Tab?, ft: FragmentTransaction?) {
    }

    override fun onTabReselected(tab: ActionBar.Tab?, ft: FragmentTransaction?) {
    }

    fun changeFragment(index : Int) {
        when(index){
            1 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_add_closet,AddClosetFragment())
                    .commit()
            }
        }
    }

}