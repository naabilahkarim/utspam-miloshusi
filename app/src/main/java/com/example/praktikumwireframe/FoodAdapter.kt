package com.example.praktikumwireframe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val foodList: List<FoodItem>) :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgFood: ImageView = itemView.findViewById(R.id.imgFood)
        val tvFoodName: TextView = itemView.findViewById(R.id.tvFoodName)
        val tvFoodDesc: TextView = itemView.findViewById(R.id.tvFoodDesc)
        val tvFoodPrice: TextView = itemView.findViewById(R.id.tvFoodPrice)
        val colorIndicator: View = itemView.findViewById(R.id.colorIndicator)
        val rbFood: RadioButton = itemView.findViewById(R.id.rbFood)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]

        holder.tvFoodName.text = food.name
        holder.tvFoodDesc.text = food.description
        holder.tvFoodPrice.text = food.price

        // DEBUG
        holder.tvFoodName.append(" (${food.imageRes})")

        holder.imgFood.setImageResource(food.imageRes)
    }

    override fun getItemCount() = foodList.size
}
