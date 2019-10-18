package com.lambdaschool.matricescalculatorchallenge.controllers

import android.os.Bundle
import com.bluelinelabs.conductor.Controller
import com.lambdaschool.matricescalculatorchallenge.MainActivity

abstract class BaseController: Controller {
    protected constructor()

    protected constructor(args: Bundle): super(args){
        args.getStringArrayList(MainActivity.SOLUTION_KEY)
    }
}