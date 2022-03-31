package com.internshala.motee_maids

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.internshala.motee_maids.adapter.MyAdapter
import com.internshala.motee_maids.model.ModelClass

class HomeActivity : AppCompatActivity() {

    lateinit var imgHamburger: ImageView
    lateinit var imgFilter: ImageView

    // Intializing all variables
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter
    val itemList :ArrayList<ModelClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        imgHamburger = findViewById(R.id.imgHamburger)
        imgFilter = findViewById(R.id.imgFilter)
        recyclerView = findViewById(R.id.recyclerView)


        // Adding data in data model
        val data1 = ModelClass("Culotte dress", "Price - \$ 100", R.drawable.recycler_img_1)
        val data2 = ModelClass("Babydoll dress", "Price - \$ 150", R.drawable.recycler_img_2)
        val data3 = ModelClass("Wrap around dress", "Price - \$ 200", R.drawable.recycler_img_3)
        val data4 = ModelClass("Kimono dress", "Price - \$ 250", R.drawable.recycler_img_1)
        val data5 = ModelClass("Bubble dress", "Price - \$ 300", R.drawable.recycler_img_2)
        val data6 = ModelClass("Culotte dress", "Price - \$ 350", R.drawable.recycler_img_3)
        val data7 = ModelClass("Babydoll dress", "Price - \$ 400", R.drawable.recycler_img_1)
        val data8 = ModelClass("Wrap around dress", "Price - \$ 450", R.drawable.recycler_img_2)
        val data9 = ModelClass("Kimono dress", "Price - \$ 500", R.drawable.recycler_img_3)

        // Adding data in itemList
        itemList.add(data1)
        itemList.add(data2)
        itemList.add(data3)
        itemList.add(data4)
        itemList.add(data5)
        itemList.add(data6)
        itemList.add(data7)
        itemList.add(data8)
        itemList.add(data9)




        // Attaching recyclerView with adapter files
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