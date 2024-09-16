package com.lambdaschool.matricescalculatorchallenge.controllers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bluelinelabs.conductor.Controller
import com.lambdaschool.matricescalculatorchallenge.MainActivity
import com.lambdaschool.matricescalculatorchallenge.R

class SolutionsController: Controller {

    constructor() : super()
    constructor(args: Bundle?) : super(args){
        args?.getStringArrayList(MainActivity.SOLUTION_KEY)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.solution_controller_layout, container, false)
        val solution = args.getStringArrayList(MainActivity.SOLUTION_KEY)

        val tvFirst = view.findViewById<TextView>(R.id.tv_answer_one)
        val tvSecond = view.findViewById<TextView>(R.id.tv_answer_two)
        val tvThird = view.findViewById<TextView>(R.id.tv_answer_three)
        val tvFourth = view.findViewById<TextView>(R.id.tv_answer_four)

        tvFirst.setText(solution?.get(0))
        tvSecond.setText(solution?.get(1))
        tvThird.setText(solution?.get(2))
        tvFourth.setText(solution?.get(3))

        return view
    }
}