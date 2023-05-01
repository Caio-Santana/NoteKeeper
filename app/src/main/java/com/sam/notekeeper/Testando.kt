package com.sam.notekeeper

class Person {
    var weightLbs: Double = 0.0
    var weightKilos: Double
        get() = weightLbs / 2.2
        set(value) {
            weightLbs = value * 2.2
        }
}

//fun main() {
//    val person = Person()
//
//    person.weightLbs = 44.0
//
//    person.weightKilos = 20.0
//    println(person.weightKilos)
//    println(person.weightLbs)
//}