package com.lambdaschool.matricescalculatorchallenge

import java.io.Serializable

class Matrix (var matrix: Array<Array<Int>>): Serializable {

    fun multiply(m: Matrix): Matrix {
        val first = (matrix[0][0] * m.matrix[0][0]) + (matrix[0][1] * m.matrix[1][0])
        val second = (matrix[0][0] * m.matrix[0][1]) + (matrix[0][1] * m.matrix[1][1])
        val third = (matrix[1][0] * m.matrix[0][0]) + (matrix[1][1] * m.matrix[1][0])
        val fourth = (matrix[1][0] * m.matrix[0][1]) + (matrix[1][1] * m.matrix[1][1])

        val solutionMatrix = Matrix(Array(2) {Array(2) {0} })
        val solutionFirstColumn = intArrayOf(first, third)
        val solutionSecondColumn = intArrayOf(second, fourth)

        solutionMatrix.matrix[0][0] = first
        solutionMatrix.matrix[0][1] = second
        solutionMatrix.matrix[1][0] = third
        solutionMatrix.matrix[1][1] = fourth

        return solutionMatrix
    }
}