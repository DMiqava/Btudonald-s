package com.example.a52finaluri.ui.dashboard

import android.os.Bundle
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a52finaluri.R
import com.example.a52finaluri.data.MenuData
import com.example.a52finaluri.databinding.FragmentDashboardBinding
import com.example.a52finaluri.recycler.Recycler_Menu
import java.util.ArrayList

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {
    private lateinit var recyclerView : RecyclerView
    private lateinit var recyclerMenu: Recycler_Menu
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerViewMenu)
        recyclerMenu = Recycler_Menu(data())
        recyclerView.layoutManager = LinearLayoutManager(this@DashboardFragment.requireContext())
        recyclerView.adapter = recyclerMenu
    }

    private fun data() : List<MenuData> {
        var burgerList = ArrayList<MenuData>()
        burgerList.add(
            MenuData(
                1,
                "https://media.marketrealist.com/brand-img/92rdvRXPV/0x0/uploads/2019/11/McDonalds-menu.jpg",
                "Economy",
                "8.00₾",
                "Order",


            )
        )
        burgerList.add(
            MenuData(
                2,
                "https://manofmany.com/wp-content/uploads/2020/04/1-How-to-make-chicken-mcnuggets-at-home.jpg",
                "Chicken McNuggets",
                "16.99₾",
                "Order",
            )
        )

        burgerList.add(
            MenuData(
                3,
                "https://www.eatthis.com/wp-content/uploads/sites/4/2017/12/mcdonalds-french-fries.jpg?fit=1024%2C749&ssl=1",
                "Fries",
                "12.00₾",
                "Order",
            )
        )

        burgerList.add(
            MenuData(
                4,
                "https://static.onecms.io/wp-content/uploads/sites/20/2020/02/mcdonalds-egg-mcmuffin.jpg",
                "Egg McMuffin",
                "6.99₾",
                "Order"
            )
        )

        burgerList.add(
            MenuData(
                5,
                "https://i.dailymail.co.uk/1s/2019/12/02/21/21728330-7748321-A_Deluxe_Crispy_Chicken_Sandwich_version_comes_topped_with_tomat-m-71_1575322968740.jpg",
                "Crispy Chicken Sandwich",
                "13.00₾",
                "Order",
            )
        )

        burgerList.add(
            MenuData(
                6,
                "https://i.insider.com/5f0ed3ac5af6cc2a8a286462?width=1136&format=jpeg",
                "Cheeseburger Combo",
                "20.00₾",
                "Order",
            )
        )

        burgerList.add(
            MenuData(
                7,
                "https://fastfoodnutrition.org/item-photos/full/793_s.jpg",
                "10 piece Chicken McNuggets",
                "12.00₾",
                "Order",
            )
        )

        burgerList.add(
            MenuData(
                8,
                "https://i1.wp.com/i.dailymail.co.uk/1s/2020/04/03/12/26767712-8184075-image-a-17_1585911803271.jpg?resize=634%2C442&ssl=1",
                "McMuffin with Egg Meal",
                "9.50₾",
                "Order",
            )
        )


        burgerList.add(
            MenuData(
                9,
                "https://www.savingyoudinero.com/wp-content/uploads/2013/05/McDonalds-Pancake-Recipe.jpeg",
                "Breakfast with Hotcakes",
                "16.00₾",
                "Order",
            )
        )


        burgerList.add(
            MenuData(
                10,
                "https://i.pinimg.com/originals/86/83/37/86833715beed4c5958061717ed58b95f.jpg",
                "(NEW)KFC Sushi",
                "13.00₾",
                "Order",
            )
        )


        return burgerList
    }



}