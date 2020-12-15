package com.ulisesdiaz.buttonnavigationbar.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.ulisesdiaz.buttonnavigationbar.R


class ThirdFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_third, container, false)
        return vista
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val thirdFragment = view.findViewById<TextView>(R.id.txtThirdFragment)
        thirdFragment.setOnClickListener {
            Toast.makeText(context, "Tercer fragment", Toast.LENGTH_SHORT).show()
        }
    }
}