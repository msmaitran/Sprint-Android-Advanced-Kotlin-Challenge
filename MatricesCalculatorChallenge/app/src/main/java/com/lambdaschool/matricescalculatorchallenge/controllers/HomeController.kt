package com.lambdaschool.matricescalculatorchallenge.controllers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lambdaschool.matricescalculatorchallenge.R

class HomeController: BaseController() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.home_controller_layout, container, false)
        return view
    }
}