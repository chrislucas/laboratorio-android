package com.xp.genericadapterrecycllerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class GerericAdapterRecyclerView<T>
    (private val items: List<T>
    , private val behaviorAdapterRecyclerView: BehaviorAdapterRecyclerView<T>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val viewHolder = behaviorAdapterRecyclerView.getViewHolder(parent, viewType)
        behaviorAdapterRecyclerView.bindClick(viewHolder, items)
        return viewHolder
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        behaviorAdapterRecyclerView.bindData(holder, items[position])
    }

    override fun getItemViewType(position: Int): Int {
        return behaviorAdapterRecyclerView.getViewType(items[position])
    }
}