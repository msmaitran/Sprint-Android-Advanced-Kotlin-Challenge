package com.lambdaschool.matricescalculatorchallenge.controllers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.ControllerChangeHandler
import com.bluelinelabs.conductor.ControllerChangeType
import com.lambdaschool.matricescalculatorchallenge.R

class SolutionsController: BaseController() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val viewSolution = inflater.inflate(R.layout.solution_controller_layout, container, false)
        return viewSolution
    }

    override fun onChangeStarted(
        changeHandler: ControllerChangeHandler,
        changeType: ControllerChangeType
    ) {
        super.onChangeStarted(changeHandler, changeType)
    }
}