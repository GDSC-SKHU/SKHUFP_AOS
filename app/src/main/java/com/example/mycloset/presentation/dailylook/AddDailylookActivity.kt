package com.example.mycloset.presentation.dailylook

import android.app.TabActivity
import android.content.Intent

import android.os.Bundle
import com.example.mycloset.R

import com.example.mycloset.presentation.closet.AddClosetActivity
import kotlinx.android.synthetic.main.activity_main.*


@Suppress("deprecation")
class AddDailylookActivity : TabActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dailylook)

        var tabHost = this.tabHost

        var tabSpecAll =tabHost.newTabSpec("All").setIndicator("전체")
        tabSpecAll.setContent(R.id.tabAll)
        tabHost.addTab(tabSpecAll)

        var tabSpecOuter =tabHost.newTabSpec("Outer").setIndicator("아우터")
        tabSpecOuter.setContent(R.id.tabOuter)
        tabHost.addTab(tabSpecOuter)

        var tabSpecTop =tabHost.newTabSpec("Top").setIndicator("상의")
        tabSpecTop.setContent(R.id.tabTop)
        tabHost.addTab(tabSpecTop)

        var tabSpecBottom =tabHost.newTabSpec("Bottom").setIndicator("하의")
        tabSpecBottom.setContent(R.id.tabBottom)
        tabHost.addTab(tabSpecBottom)

        var tabSpecShoes =tabHost.newTabSpec("Shoes").setIndicator("신발")
        tabSpecShoes.setContent(R.id.tabShoes)
        tabHost.addTab(tabSpecShoes)

        var tabSpecBag =tabHost.newTabSpec("Bag").setIndicator("가방")
        tabSpecBag.setContent(R.id.tabBag)
        tabHost.addTab(tabSpecBag)

        var tabSpecStuff =tabHost.newTabSpec("Stuff").setIndicator("잡화")
        tabSpecStuff.setContent(R.id.tabStuff)
        tabHost.addTab(tabSpecStuff)


        tabHost.currentTab = 0

        // 탭 내 화면전환 버튼 클릭이벤트
        main_btn_all_add.setOnClickListener {
            intent = Intent(this,AddClosetActivity::class.java)
            startActivity(intent)
        }

        main_btn_outer_add.setOnClickListener {
            intent = Intent(this,AddClosetActivity::class.java)
            startActivity(intent)
        }
        main_btn_top_add.setOnClickListener {
            intent = Intent(this,AddClosetActivity::class.java)
            startActivity(intent)
        }
        main_btn_bottom_add.setOnClickListener {
            intent = Intent(this,AddClosetActivity::class.java)
            startActivity(intent)
        }

        main_btn_shoes_add.setOnClickListener {
            intent = Intent(this,AddClosetActivity::class.java)
            startActivity(intent)
        }

        main_btn_bag_add.setOnClickListener {
            intent = Intent(this,AddClosetActivity::class.java)
            startActivity(intent)
        }

        main_btn_stuff_add.setOnClickListener {
            intent = Intent(this,AddClosetActivity::class.java)
            startActivity(intent)
        }
    }
}