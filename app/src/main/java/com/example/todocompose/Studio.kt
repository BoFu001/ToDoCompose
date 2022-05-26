package com.example.todocompose

interface Aaa {
    fun test1()
    fun test2()
}


class Child {
    fun aaa(): Aaa {
        return object : Aaa {
            override fun test1() {
                println("aaaa test1")
            }

            override fun test2() {
                println("aaaa test2")
            }

        }
    }
}


fun main () {

    val child = Child()
    val a = child.aaa()
    a.test1()


    val weaponSkill = GunSkill() //BowSkill
    val shooter = NewShooter(weaponSkill)
    shooter.attack()

}

interface WeaponSkill{
    fun attack()
}

class BowSkill: WeaponSkill{
    override fun attack() {
        println("Bow attck")
    }
}

class GunSkill: WeaponSkill{
    override fun attack() {
        println(" Gunattck")
    }
}

class NewShooter(private val weaponSkill: WeaponSkill){

    fun attack() {
        weaponSkill.attack()
    }
}

