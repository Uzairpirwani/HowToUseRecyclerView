package com.example.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.MyView
import com.example.recyclerview.R
import kotlinx.android.synthetic.main.item_custom_row.view.*

class ItemAdapter(val context: Context, private val arrayList: ArrayList<MyView>):
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(myView: MyView) {
            itemView.textView_Name.text = myView.title
            itemView.image_view.setImageResource(myView.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_custom_row,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])
        holder.itemView.setOnClickListener {
            if (position == 0){
                Toast.makeText(context,"Position 1", Toast.LENGTH_SHORT).show()
        }
            if (position == 1){
                Toast.makeText(context,"Position 2", Toast.LENGTH_SHORT).show()
            }
            if (position == 2){
                Toast.makeText(context,"Position 3", Toast.LENGTH_SHORT).show()
            }
            if (position == 3){
                Toast.makeText(context,"Position 4", Toast.LENGTH_SHORT).show()
            }
            if (position == 4){
                Toast.makeText(context,"Position 5", Toast.LENGTH_SHORT).show()
            }
            if (position == 5){
                Toast.makeText(context,"Position 6", Toast.LENGTH_SHORT).show()
            }
            if (position == 6){
                Toast.makeText(context,"Position 7", Toast.LENGTH_SHORT).show()
            }
            if (position == 7){
                Toast.makeText(context,"Position 8", Toast.LENGTH_SHORT).show()
            }
            if (position == 8){
                Toast.makeText(context,"Position 9", Toast.LENGTH_SHORT).show()
            }
            if (position == 9){
                Toast.makeText(context,"Position 10", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(context, "Not found", Toast.LENGTH_SHORT).show()
            }
        }
    }



}