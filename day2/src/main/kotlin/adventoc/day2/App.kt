package adventoc.day2

import java.io.File

interface Password {
    fun isValid(): Boolean
}

fun main(args: Array<String>) {
    val star = if (args.isNotEmpty() && args[0] == "2") 2 else 1
    val file = File("src/main/resources/input.txt")
    println("star $star")
    file.readLines().map { line ->
        val inputs = line.split(" ")
        val occurences = inputs[0].split("-").map { it.toInt() }
        val letter = inputs[1].take(1).toCharArray()[0]
        if (star == 1) Star1Password(inputs[2], occurences[0], occurences[1], letter) else Star2Password(inputs[2], occurences[0], occurences[1], letter)
    }.sumBy { if (it.isValid()) 1 else 0 }.let { println(it) }
}