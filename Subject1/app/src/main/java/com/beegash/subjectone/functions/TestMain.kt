package com.beegash.subjectone.functions

fun main() {
    val math = MathOperations()
    val temp = TempOperations()

    println("Sum of interior angles of a polygon with 5 sides: ${math.sumOfInteriorAngles(5)}")
    println("Salary for 22 working days: ${math.calculateSalary(22)}")
    println("Quota fee for 60 GB: ${math.calculateFee(60)}")
    println("Perimeter of rectangle (3, 7): ${math.rectanglePerimeter(3, 7)}")
    println("11! = ${math.factorial(11)}")
    println("How many a's in 'Android Bootcamp': ${math.countA("Adroid Bootcamp")}")
    println("25 Celsius in Fahrenheit: ${temp.celsiusToFahrenheit(25.0)}")
}

