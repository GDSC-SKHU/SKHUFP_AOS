package com.example.mycloset

import android.app.Notification.Action
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.FragmentTransaction

@Suppress("deprecation")
class MainActivity : AppCompatActivity(), ActionBar.TabListener {

    lateinit var tabAll : ActionBar.Tab
    lateinit var tabTop : ActionBar.Tab
    lateinit var tabBottom : ActionBar.Tab
    lateinit var tabOuter : ActionBar.Tab
    lateinit var tabShoes : ActionBar.Tab
    lateinit var tabBag : ActionBar.Tab
    lateinit var tabStuff : ActionBar.Tab

    var myFrags = arrayOfNulls<MyTabFragment>(7)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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

        //setContentView(R.layout.activity_main)
    }

    override fun onTabSelected(tab: ActionBar.Tab?, ft: FragmentTransaction?) {
        var myTabFrag : MyTabFragment? = null

        if(myFrags[tab!!.position]==null){
            myTabFrag = MyTabFragment()
            val data = Bundle()
            data.putString("tabName",tab.text.toString())
            myTabFrag.arguments = data
            myFrags[tab.position] = myTabFrag
        } else {
            myTabFrag = myFrags[tab.position]
        }
        ft!!.replace(android.R.id.content,myTabFrag!!)
    }

    override fun onTabUnselected(tab: ActionBar.Tab?, ft: FragmentTransaction?) {
    }

    override fun onTabReselected(tab: ActionBar.Tab?, ft: FragmentTransaction?) {
    }
}