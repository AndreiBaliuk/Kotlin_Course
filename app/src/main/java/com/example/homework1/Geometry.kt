package com.example.homework1

 sealed class Geometry {
     class Square(): Geometry ()
     class Rectangle(): Geometry ()
     class Quadrangle(): Geometry ()
     class Circumference(): Geometry ()
    object None : Geometry()
}
fun Geometry.Square.toSquare1(): String{
    val square = " S = π(r * r)"
    return square
}

fun Geometry.Rectangle.toSquare2(): String{
    val square = "S = a * b"
    return square
}
fun Geometry.Quadrangle.toSquare3(): String{
    val square = "S = ab sin φ"

    return square
}
fun Geometry.Circumference.toSquare4(): String{
    val square = "S = π * r/2 * R/2"
    return square
}