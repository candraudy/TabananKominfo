package com.cproject.tabanankominfo

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_nama.view.*

// memanggil recycleview di list nama.xml
// adapter nama solve dengan implement
//view holder crate class

class AdapterNama (private val listName :List<String>, private val tgl :List<String>, private val img :IntArray)
    :RecyclerView.Adapter<AdapterNama.ViewHolder> () {
    class ViewHolder (view: View):RecyclerView.ViewHolder(view) {
        val nama = view.itemnama_tempat
        val tanggal = view.tgl
        val image = view.imag
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterNama.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_nama,parent,false)
        )
    }

    override fun onBindViewHolder(holder: AdapterNama.ViewHolder, position: Int) {
        // val data = listName.get(position)
        holder.nama.text = listName[position]
        holder.tanggal.text = tgl[position]
        holder.image.setImageResource(img[position])
    }

    override fun getItemCount(): Int {
        return listName.size
    }
}