package io.dayatz.rimayahcalc.models

class Shaft(val originalLength: Float, val expectedLength: Float, val expectedWeight: Float) {
    fun calcWeight() : Float {
        return originalLength / expectedLength * this.expectedWeight
    }
}