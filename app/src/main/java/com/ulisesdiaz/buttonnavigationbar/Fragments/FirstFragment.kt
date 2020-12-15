package com.ulisesdiaz.buttonnavigationbar.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.ulisesdiaz.buttonnavigationbar.R

class FirstFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val vista = inflater.inflate(R.layout.fragment_first, container, false)
        return vista
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstFragment = view.findViewById<TextView>(R.id.txtFristFragment)
        firstFragment.setOnClickListener {
            Toast.makeText(context, "Primer fragmento", Toast.LENGTH_SHORT).show()
        }

    }
}