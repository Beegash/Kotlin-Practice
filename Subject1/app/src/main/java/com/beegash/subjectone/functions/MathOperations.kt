package com.beegash.subjectone.functions

class MathOperations {

    fun sumOfInteriorAngles(sideCount: Int): Int {
        return (sideCount - 2) * 180
    }

    fun calculateSalary(dayCount: Int): Int {
        val totalHours = dayCount * 8
        val overtimeHours = if (totalHours > 160) totalHours - 160 else 0
        val regularHours = totalHours - overtimeHours
        return (regularHours * 10) + (overtimeHours * 20)
    }

    fun calculateFee(quota: Int): Int {
        return if (quota <= 50) 100 else 100 + (quota - 50) * 4
    }

    fun rectanglePerimeter(shortSide: Int, longSide: Int): Int {
        return 2 * (shortSide + longSide)
    }

    fun factorial(number: Int): Int {
        var result = 1
        for (i in 1..number) {
            result *= i
        }
        return result
    }

    fun countA(word: String): Int {
        return word.count { it == 'a' || it == 'A' }
    }
}
