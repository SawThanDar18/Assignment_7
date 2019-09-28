package com.example.assignment_7.delegates

import com.example.assignment_7.fragments.NowShowingFragment

interface FragmentDelegate {
    fun onCreateFragment(nowShowingFragment: NowShowingFragment)
}