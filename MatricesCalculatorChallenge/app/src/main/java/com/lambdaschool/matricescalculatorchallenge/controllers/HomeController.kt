package com.lambdaschool.matricescalculatorchallenge.controllers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.bluelinelabs.conductor.ControllerChangeHandler
import com.bluelinelabs.conductor.ControllerChangeType
import com.lambdaschool.matricescalculatorchallenge.Matrix
import com.lambdaschool.matricescalculatorchallenge.R

class HomeController: BaseController() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.home_controller_layout, container, false)
        return view
    }

    override fun onChangeEnded(
        changeHandler: ControllerChangeHandler,
        changeType: ControllerChangeType
    ) {
        super.onChangeEnded(changeHandler, changeType)

        // Top Matrix
        val etTopFirst = view?.findViewById<EditText>(R.id.et_top_first)
        val etTopSecond = view?.findViewById<EditText>(R.id.et_top_second)
        val etTopThird = view?.findViewById<EditText>(R.id.et_top_third)
        val etTopFourth = view?.findViewById<EditText>(R.id.et_top_fourth)

        // Bottom Matrix
        val etBottomFirst = view?.findViewById<EditText>(R.id.et_bottom_first)
        val etBottomSecond = view?.findViewById<EditText>(R.id.et_bottom_second)
        val etBottomThird = view?.findViewById<EditText>(R.id.et_bottom_third)
        val etBottomFourth = view?.findViewById<EditText>(R.id.et_bottom_fourth)

        // Store matrixes in a 2-dimentional array
        val matrixTop = Matrix(Array(2) {Array(2) {0} })
        val matrixBottom = Matrix(Array(2) {Array(2) {0} })

        val button = view?.findViewById<Button>(R.id.btn_multiply)
        button?.setOnClickListener {
            val numberTopFirst = etTopFirst?.text.toString()
            val numberTopSecond = etTopSecond?.text.toString()
            val numberTopThird = etTopThird?.text.toString()
            val numberTopFourth = etTopFourth?.text.toString()
            val numberBottomFirst = etBottomFirst?.text.toString()
            val numberBottomSecond = etBottomSecond?.text.toString()
            val numberBo
        }
    }
}