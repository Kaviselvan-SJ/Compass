package com.kavi.compass


enum class Essential(val letter: String, val degree: Int) {
    NORTH("N", 0),
    EAST("E", 90),
    SOUTH("S", 180),
    WEST("W", 270),
    ;

    companion object {
        fun fromDegree(degree: Int): Essential {
            val divisor: Int = 360 / entries.size
            val sectorIndex = degree / divisor
            val angleRemainder = degree % divisor
            return if (angleRemainder <= divisor / 2) {
                entries[sectorIndex % entries.size]

            } else {
                entries[(sectorIndex + 1) % entries.size]
            }
        }
    }
}