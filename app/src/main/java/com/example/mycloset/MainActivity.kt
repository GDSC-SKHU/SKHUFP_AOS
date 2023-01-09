package com.example.mycloset

import android.app.Notification.Action
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.mycloset.fragment.closet.FragmentAll
import com.example.mycloset.fragment.closet.FragmentBag
import com.google.android.material.tabs.TabLayout.Tab

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

    /*lateinit var fragAll : Fragment
    lateinit var fragOuter : Fragment
    lateinit var fragmentTop: Fragment
    lateinit var fragmentBottom: Fragment
    lateinit var fragmentshoes: Fragment
    lateinit var fragmentBag:  Fragment
    lateinit var fragmentStuff: Fragment*/


    var myFrags = arrayOfNulls<Fragment>(7)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
        /*var myTabFrag : Fragment? = null

        if(myFrags[tab!!.position]==null){
            myTabFrag = MyTabFragment()
            val data = Bundle()
            data.putString("tabName",tab.text.toString())
            myTabFrag.arguments = data
            myFrags[tab.position] = myTabFrag
        } else {
            myTabFrag = myFrags[tab.position]
        }
        ft!!.replace(android.R.id.content,myTabFrag!!)*/
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
}