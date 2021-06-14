package com.trinhpham.a7minuteworkouts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_detail.view.*

class DetailAdapter(val context: Context, var steps: ArrayList<String>) :
    RecyclerView.Adapter<DetailAdapter.myViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.item_detail, parent, false)
        return myViewHolder(view)
    }

    override fun getItemCount(): Int {
        return steps.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val step = steps[position]
        holder.setData(step, position)

        holder.itemView.alpha = 0.toFloat()
        holder.itemView.translationY = 200.toFloat()

        holder.itemView.animate().alpha(1.toFloat()).translationY(0.toFloat()).setDuration(800)
            .setStartDelay((position * 100).toLong()).start()
    }


    inner class myViewHolder(myView: View) : RecyclerView.ViewHolder(myView) {
        init {
        }

        fun setData(step: String?, position: Int) {
            itemView.ivItemTitle.text = "${position}. ${step}"
        }
    }
}