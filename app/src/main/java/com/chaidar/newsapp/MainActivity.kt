package com.chaidar.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private var mSectionPagerAdapter : SectionPagerAdapter? = null
    private lateinit var vpnews : ViewPager2
    private lateinit var tabs : TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.tool_bar))

        vpnews  = findViewById(R.id.vp_news)
        tabs = findViewById(R.id.tabs)

        mSectionPagerAdapter = SectionPagerAdapter(this)
        vpnews.adapter = mSectionPagerAdapter

        val tabList = arrayOf("All News", "Top", "Popular")
        TabLayoutMediator(tabs, vpnews){tab, position ->
            tab.text = tabList[position]
        }.attach()
    }
}