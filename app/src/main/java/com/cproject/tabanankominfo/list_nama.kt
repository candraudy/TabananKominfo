package com.cproject.tabanankominfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_nama.*

class list_nama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)

        val names = listOf<String>(

            "Ulun Danu Beratan",
            "Tanah Lot",
            "Alas Kedaton",
            "Garuda Wisnu Kencana",
            "Pura Uluwatu"
        )

        val tanggal = listOf<String>(

            "24 Nov 2021",
            "25 Nov 2021",
            "25 Nov 2021",
            "26 Nov 2021",
            "26 Nov 2021"

        )

        val img = intArrayOf(
            R.drawable.jatiluwih,
            R.drawable.jatiluwih,
            R.drawable.jatiluwih,
            R.drawable.jatiluwih,
            R.drawable.jatiluwih

        )

        val adapternama = AdapterNama(names,tanggal,img)
        rvnama.layoutManager = LinearLayoutManager(this)
        rvnama.adapter = adapternama
    }
}