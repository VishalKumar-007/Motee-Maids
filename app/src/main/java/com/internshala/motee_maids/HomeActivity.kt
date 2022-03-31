package com.internshala.motee_maids

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.internshala.motee_maids.adapter.MyAdapter
import com.internshala.motee_maids.model.ModelClass

class HomeActivity : AppCompatActivity() {

    lateinit var imgHamburger: ImageView
    lateinit var imgFilter: ImageView

    // intializing all variaables
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter
    val itemList :ArrayList<ModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        imgHamburger = findViewById(R.id.imgHamburger)
        imgFilter = findViewById(R.id.imgFilter)
        recyclerView = findViewById(R.id.recyclerView)


        // added data in data model
        val data1 = ModelClass("hajsdajd", "45412", R.drawable.app_logo)
        val data2 = ModelClass("hajsdajd", "45412", R.drawable.app_logo)
        val data3 = ModelClass("hajsdajd", "45412", R.drawable.app_logo)
        val data4 = ModelClass("hajsdajd", "45412", R.drawable.app_logo)
        val data5 = ModelClass("hajsdajd", "45412", R.drawable.app_logo)
        val data6 = ModelClass("hajsdajd", "45412", R.drawable.app_logo)
        val data7 = ModelClass("hajsdajd", "45412", R.drawable.app_logo)
        val data8 = ModelClass("hajsdajd", "45412", R.drawable.app_logo)
        val data9 = ModelClass("hajsdajd", "45412", R.drawable.app_logo)
        val data10 = ModelClass("hajsdajd", "45412", R.drawable.app_logo)


        // add data in itemList
        itemList.add(data1)
        itemList.add(data2)
        itemList.add(data3)
        itemList.add(data4)
        itemList.add(data5)
        itemList.add(data6)
        itemList.add(data7)
        itemList.add(data8)
        itemList.add(data9)
        itemList.add(data10)




        // recycler view attach with adapter files
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        adapter = MyAdapter(this, itemList)
        recyclerView.adapter = adapter


        imgHamburger.setOnClickListener {
            Toast.makeText(this, "Clicked on Hamburger Icon", Toast.LENGTH_SHORT).show()
        }

        imgFilter.setOnClickListener {
            Toast.makeText(this, "Clicked on Filter Icon", Toast.LENGTH_SHORT).show()
        }
    }
}