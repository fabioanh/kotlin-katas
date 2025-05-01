package org.example

fun bouncingBall(dropHeight: Double, bounceRatio: Double, windowHeight: Double): Int {
    if (dropHeight <= 0 || bounceRatio <= 0.0 || bounceRatio >= 1.0 || windowHeight >= dropHeight) return -1
    var count = -1
    var ballHeight = dropHeight
    while (ballHeight > windowHeight) {
        count += 2
        ballHeight *= bounceRatio
    }
    return count
}