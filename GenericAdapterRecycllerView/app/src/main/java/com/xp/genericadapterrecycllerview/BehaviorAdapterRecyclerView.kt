package com.xp.genericadapterrecycllerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.xp.genericadapterrecycllerview.views.viewholders.ViewHolderHelper

interface BehaviorAdapterRecyclerView<Data> {

    fun getViewHolder(parent: ViewGroup, viewType: Int) :RecyclerView.ViewHolder

    fun bindData(viewHolder: RecyclerView.ViewHolder, item: Data)

    fun bindClick(viewHolder: RecyclerView.ViewHolder, items: List<Data>)

    @ViewHolderHelper.Companion.TypeViewHolder
    fun getViewType(item: Data) : Int
}