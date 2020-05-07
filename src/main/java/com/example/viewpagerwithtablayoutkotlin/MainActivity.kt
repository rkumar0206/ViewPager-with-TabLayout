package com.example.viewpagerwithtablayoutkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.adapter = ViewPagerAdapter(this)

        TabLayoutMediator(tab_layout, viewPager) { tab, position ->

            when (position) {

                0 -> {
                    tab.text = "Android"
                    tab.setIcon(R.drawable.ic_android_black_24dp)
                }
                1 -> {
                    tab.text = "Assistant"
                    tab.setIcon(R.drawable.ic_assistant_black_24dp)
                }
                2 -> {
                    tab.text = "Archive"
                    tab.setIcon(R.drawable.ic_archive_black_24dp)
                }
                3 -> {
                    tab.text = "Announcement"
                    tab.setIcon(R.drawable.ic_announcement_black_24dp)
                    /*val badgeDrawable= tab.orCreateBadge
                    badgeDrawable.backgroundColor=ContextCompat.getColor(applicationContext,R.color.colorAccent)
                    badgeDrawable.isVisible = true
                    badgeDrawable.number=100*/
                }

            }

        }.attach()


    }

}
