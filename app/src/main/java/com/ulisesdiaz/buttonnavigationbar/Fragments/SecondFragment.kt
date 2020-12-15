package com.ulisesdiaz.buttonnavigationbar.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.ulisesdiaz.buttonnavigationbar.R


class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val vista = inflater.inflate(R.layout.fragment_second, container, false)
        return  vista
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val secondFragment = view.findViewById<TextView>(R.id.txtSecondFragment)
        secondFragment.setOnClickListener {
            Toast.makeText(context, "Segundo Fragmento", Toast.LENGTH_SHORT).show()
        }
    }

}