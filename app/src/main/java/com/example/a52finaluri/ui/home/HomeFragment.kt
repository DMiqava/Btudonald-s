package com.example.a52finaluri.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a52finaluri.R
import com.example.a52finaluri.data.MenuData
import com.example.a52finaluri.databinding.FragmentHomeBinding
import com.example.a52finaluri.recycler.Recycler_Menu
import java.util.ArrayList

class HomeFragment : Fragment(R.layout.fragment_dashboard) {
    private lateinit var recyclerView : RecyclerView
    private lateinit var recyclerMenu: Recycler_Menu

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerViewMenu)
        recyclerMenu = Recycler_Menu(data())
        recyclerView.layoutManager = LinearLayoutManager(this@HomeFragment.requireContext())
        recyclerView.adapter = recyclerMenu



    }




    private fun data() : List<MenuData> {
        var drinkList = ArrayList<MenuData>()
        drinkList.add(
            MenuData(
                1,
                "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/assets/images/Caramel_Frappe_2col.jpg",
                "Iced Coffee",
                "5.00₾",
                "Order",


                )
        )
        drinkList.add(
            MenuData(
                2,
                "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-Coca-Cola-Classic-Small.jpg",
                "Coca-Cola®",
                "5.00₾",
                "Order",
            )
        )

        drinkList.add(
            MenuData(
                3,
                "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-Sprite-Small.jpg",
                "Sprite®",
                "5.00₾",
                "Order",
            )
        )

        drinkList.add(
            MenuData(
                4,
                "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-Dr-Pepper-Small.jpg",
                "Dr Pepper®",
                "5.50₾",
                "Order"
            )
        )

        drinkList.add(
            MenuData(
                5,
                "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-fanta-orange.jpg",
                "Fanta® Orange",
                "4.50₾",
                "Order",
            )
        )

        drinkList.add(
            MenuData(
                6,
                "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-Diet-Coke-Small.jpg",
                "Diet Coke®",
                "5.00₾",
                "Order",
            )
        )

        drinkList.add(
            MenuData(
                7,
                "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-hi-c-lavaburst.jpg",
                "Orange Lavaburst®",
                "6.00₾",
                "Order",
            )
        )

        drinkList.add(
            MenuData(
                8,
                "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-Iced-Tea-Large-drink.jpg",
                "Sweet Tea®",
                "3.70₾",
                "Order",
            )
        )


        drinkList.add(
            MenuData(
                9,
                "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-Dasani-Water.jpg",
                "DASANI® Water",
                "3.00₾",
                "Order",
            )
        )


        drinkList.add(
            MenuData(
                10,
                "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-Strawberry-Banana-Smoothie-Medium.jpg",
                "Strawberry&Banana Smoothie",
                "8.00₾",
                "Order",
            )
        )


        return drinkList
    }



}