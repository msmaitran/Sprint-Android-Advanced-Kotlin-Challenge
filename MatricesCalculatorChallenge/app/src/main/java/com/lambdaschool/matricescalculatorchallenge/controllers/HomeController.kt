package com.lambdaschool.matricescalculatorchallenge.controllers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.bluelinelabs.conductor.RouterTransaction
import com.bluelinelabs.conductor.changehandler.HorizontalChangeHandler
import com.lambdaschool.matricescalculatorchallenge.*

class HomeController: BaseController() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.home_controller_layout, container, false)

        val button = view?.findViewById<Button>(R.id.btn_multiply)
        button?.setOnClickListener {

            // Top Matrix
            val etTopFirst = view.findViewById<EditText>(R.id.et_top_first)
            val etTopSecond = view.findViewById<EditText>(R.id.et_top_second)
            val etTopThird = view.findViewById<EditText>(R.id.et_top_third)
            val etTopFourth = view.findViewById<EditText>(R.id.et_top_fourth)

            // Bottom Matrix
            val etBottomFirst = view.findViewById<EditText>(R.id.et_bottom_first)
            val etBottomSecond = view.findViewById<EditText>(R.id.et_bottom_second)
            val etBottomThird = view.findViewById<EditText>(R.id.et_bottom_third)
            val etBottomFourth = view.findViewById<EditText>(R.id.et_bottom_fourth)

            Matrix.height = 2
            Matrix.width = 2

            val matrixTop = matrix(Matrix.height, Matrix.width)
            val matrixBottom = matrix(Matrix.height, Matrix.width)

            matrixTop[0][0] = etTopFirst.getNumber()
            matrixTop[0][1] = etTopSecond.getNumber()
            matrixTop[1][0] = etTopThird.getNumber()
            matrixTop[1][1] = etTopFourth.getNumber()
            matrixBottom[0][0] = etBottomFirst.getNumber()
            matrixBottom[0][1] = etBottomSecond.getNumber()
            matrixBottom[1][0] = etBottomThird.getNumber()
            matrixBottom[1][1] = etBottomFourth.getNumber()
            
            if (Matrix.width == Matrix.height) {
                val solution = matrixTop.times(matrixBottom)
                args.putStringArrayList(MainActivity.SOLUTION_KEY, solution)
                router.pushController(
                    RouterTransaction.with(SolutionsController(args))
                        .pushChangeHandler(HorizontalChangeHandler())
                        .popChangeHandler(HorizontalChangeHandler())
                )
            }
        }
        return view
    }
}