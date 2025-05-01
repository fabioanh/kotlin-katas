package org.example

import kotlin.test.Test
import kotlin.test.assertEquals

class BouncingBallTest {

    @Test
    fun bouncingBall_basicValues_goodExperiment() {
        // given
        val initialHeight = 3.0
        val windowHeight = 1.5
        val bounceRatio = 0.66
        // when
        val result = bouncingBall(initialHeight, bounceRatio, windowHeight)
        // then
        assertEquals(3, result)
    }
}