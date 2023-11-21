package com.example.firstapp

class Bird(name: String, age: Int) : Animal(name, age), Flyable, Swimable {

    val maxDuration = 30
    val maxFlyDuration = 20
    val maxSwimDuration = 15

    override fun move(duration: Int): Boolean {
        return duration <= maxDuration


    }

    override fun fly(duration: Int): Boolean {
        return duration <= maxFlyDuration

    }

    override fun swim(duration: Int): Boolean {
        return duration <= maxSwimDuration
    }
}