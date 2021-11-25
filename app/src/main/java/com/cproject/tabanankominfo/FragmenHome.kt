package com.cproject.tabanankominfo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_nama.*
import kotlinx.android.synthetic.main.fragment_fragmen_home.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmenHome.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmenHome : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nama.text = param1

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
        rvhome.layoutManager = LinearLayoutManager(context)
        rvhome.adapter = adapternama
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmen_home, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmenHome.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String) =
            FragmenHome().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }
}