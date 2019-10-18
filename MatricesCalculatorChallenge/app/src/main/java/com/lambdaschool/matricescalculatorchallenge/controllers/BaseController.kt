package com.lambdaschool.matricescalculatorchallenge.controllers

import android.os.Bundle
import com.bluelinelabs.conductor.Controller

abstract class BaseController: Controller {
    protected constructor()

    protected constructor(args: Bundle): super(args)
}