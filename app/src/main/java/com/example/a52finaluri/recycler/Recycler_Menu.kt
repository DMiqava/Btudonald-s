package com.example.a52finaluri.recycler
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a52finaluri.R
import com.example.a52finaluri.data.MenuData
import com.example.a52finaluri.order_activity
import com.google.android.material.internal.ContextUtils.getActivity


class Recycler_Menu(private val list: List<MenuData>) : RecyclerView.Adapter<Recycler_Menu.PersonViewHolder>() {

    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photo : ImageView
        val name : TextView
        val sales : TextView
        val price : TextView

        init {
            photo = itemView.findViewById(R.id.burgerPhoto)
            name = itemView.findViewById(R.id.burgerName)
            sales = itemView.findViewById(R.id.burgerSale)
            price = itemView.findViewById(R.id.burgerPrice)

            sales.setOnClickListener{
                itemView.context.startActivity(Intent(itemView.context, order_activity::class.java))

            }

        }

        fun data(menuData: MenuData) {
            Glide.with(itemView.context).load(menuData.photo).into(photo)
            name.text = menuData.names
            sales.text= menuData.sales
            price.text= menuData.price

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_menu, parent, false)
        return PersonViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val country = list[position]
        holder.data(country)

    }

    override fun getItemCount() = list.size
}