package com.example.recyclerview

import android.graphics.ColorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapter.ItemAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<MyView>()
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))
        arrayList.add(MyView(R.drawable.ic_launcher_background,"Dummy text hello"))

        val itemAdapter = ItemAdapter(this,arrayList)

        Recycler_view.layoutManager  = GridLayoutManager(this,2)
        Recycler_view.adapter = itemAdapter

    }
}