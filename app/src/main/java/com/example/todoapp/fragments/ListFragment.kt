package com.example.todoapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import com.example.todoapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

    private val navController = findNavController()
    private lateinit var view: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_list, container, false)
        setFloatingClickListener()
        setListLayoutClickListener()
        return view
    }

    private fun findFloatingButton() = view.findViewById<FloatingActionButton>(R.id.floatingActionButton)
    private fun findListLayout() = view.findViewById<ConstraintLayout>(R.id.listLayout)
    private fun setFloatingClickListener(){
        findFloatingButton().setOnClickListener {
            navController.navigate(R.id.action_listFragment_to_addFragment)
        }
    }
    private fun setListLayoutClickListener(){
        findListLayout().setOnClickListener {
            navController.navigate(R.id.action_listFragment_to_updateFragment)
        }
    }

}