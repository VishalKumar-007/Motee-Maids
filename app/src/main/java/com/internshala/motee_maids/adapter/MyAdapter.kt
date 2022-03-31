package com.internshala.motee_maids.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.internshala.motee_maids.R
import com.internshala.motee_maids.model.ModelClass


class MyAdapter(val context:Context, val itemList : ArrayList<ModelClass>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(view : View):RecyclerView.ViewHolder(view) {

        val itemTitle = view.findViewById<TextView>(R.id.itemTitle)
        val itemPrice = view.findViewById<TextView>(R.id.itemPrice)
        val itemImage = view.findViewById<ImageView>(R.id.itemImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_cardview, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        val userData = itemList[position]
        holder.itemTitle.text = userData.title
        holder.itemPrice.text = userData.price
        holder.itemImage.setImageResource(userData.image)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}