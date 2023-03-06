package com.example.homework6_4

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    val count = 3

    override fun getItemCount(): Int = count

    override fun createFragment(position: Int): Fragment {
        return  when(position){
            0->{
                ButtonsFragment()
            }
            1->{
                CounterFragment()
            }
            2->{
                OperationsFragment()
            }
            else -> ButtonsFragment()
        }
    }

}