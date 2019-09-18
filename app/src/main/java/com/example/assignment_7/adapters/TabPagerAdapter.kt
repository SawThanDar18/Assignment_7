package com.example.assignment_7.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.assignment_7.fragments.CinemaFragment
import com.example.assignment_7.fragments.ComingSoonFragment
import com.example.assignment_7.fragments.NowShowingFragment

class TabPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> NowShowingFragment()
            1 -> CinemaFragment()
            else -> ComingSoonFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> "Now Showing"
            1 -> "Cinema"
            else -> "Coming Soon"
        }
    }
}