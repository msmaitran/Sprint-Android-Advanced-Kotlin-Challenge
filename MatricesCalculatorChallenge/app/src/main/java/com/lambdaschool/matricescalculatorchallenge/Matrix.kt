package com.lambdaschool.matricescalculatorchallenge


object Matrix {

    var height: Int = 2

    var width: Int = 2

    val matrixTop = Array(height) { Array(width) { 0 } }
    val matrixBottom = Array(height) { Array(width) { 0 } }

}

fun matrix(height: Int, width: Int): Array<Array<Int>> {
    return Array(height) {Array(width) {0} }
}

operator fun Array<Array<Int>>.get(x: Int, y: Int): Int{
    return this [x][y]
}

operator fun Array<Array<Int>>.set(x: Int, y: Int): Int{
    return this [x][y]
}

operator fun Array<Array<Int>>.times(matrix: Array<Array<Int>>): ArrayList<String> {
    val row1 = matrix.size
    val column1 = matrix.size
    val row2 = matrix.size
    val column2 = matrix.size

    // Multiplying Two matrices
    val product = Array(row1) {IntArray(column2)}
    for (i in 0 until row1) {
            for (j in 0 until column2) {
                for (k in 0 until column1) {
                    product[i][j] += this[i][k] * matrix[k][j]
            }
        }
    }

    val solution = ArrayList<String>()

    product.forEach {
        it.forEach {
            if (it != 0){
                solution.add("$it")
            }
        }
    }
    return solution
}