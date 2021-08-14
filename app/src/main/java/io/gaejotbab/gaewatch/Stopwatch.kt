package io.gaejotbab.gaewatch

class Stopwatch {
    private var accumulatedTimePeriod: Long = 0

    private var baseTime: Long? = null

    val elapsedTimeMillis: Long?
        get() = if (baseTime != null) {
            accumulatedTimePeriod + (System.currentTimeMillis() - baseTime!!)
        } else {
            null
        }

    fun reset() {
        accumulatedTimePeriod = 0
        baseTime = null
    }

    fun start() {
        if (baseTime != null) {
            throw IllegalStateException("Already started")
        }

        baseTime = System.currentTimeMillis()
    }

    fun stop() {
        if (baseTime == null) {
            throw IllegalStateException("Not started but tried to stop")
        }

        accumulatedTimePeriod += System.currentTimeMillis() - baseTime!!
        baseTime = null
    }
}
