package com.lambdaschool.matricescalculatorchallenge

import android.widget.EditText

fun EditText.getNumber(): Int{
    return text.toString().toInt()
}