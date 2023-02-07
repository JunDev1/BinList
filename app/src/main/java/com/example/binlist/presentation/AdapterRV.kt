package com.example.binlist.presentation

import android.content.Context
import android.graphics.Movie
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.binlist.R
import com.example.binlist.common.Common
import com.example.binlist.data.CardModel

class AdapterRV(
    private val context: Context, private val movieList: MutableList<CardModel>
) : RecyclerView.Adapter<AdapterRV.ViewHolder>() {

    val cardModel = listOf<CardModel>()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.bank_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_card_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = cardModel.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cardModelItem = cardModel[position]
        holder.textView.text = cardModelItem.bin.toString()
    }
}