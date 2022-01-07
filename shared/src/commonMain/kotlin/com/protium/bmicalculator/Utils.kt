package com.protium.bmicalculator

class Utils {

    fun calculateBMI(weight: Double, height: Double): String {
        val bmi: Double = (weight) / (height * height)
        val bmiResult: String = if (bmi < 15) {
            "Very severely underweight"
        } else if (bmi >= 15 && bmi < 16) {
            "Severely underweight"
        } else if (bmi >= 16 && bmi < 18.5) {
            "Underweight"
        } else if (bmi >= 18.5 && bmi < 25) {
            "Normal"
        } else if (bmi >= 25 && bmi < 30) {
            "Overweight"
        } else if (bmi >= 30 && bmi < 35) {
            "Obese Class 1 - Moderately Obese"
        } else if (bmi >= 35 && bmi < 40) {
            "Obese Class 2 - Severely Obese"
        } else {
            "Obese Class 3 - Very Severely Obese"
        }
        return "$bmiResult \n $bmi"
    }

}