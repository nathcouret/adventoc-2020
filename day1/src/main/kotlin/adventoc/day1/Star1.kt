package adventoc.day1

import java.io.File

fun star1() {
    println("star 1")
    val file = File("src/main/resources/input.txt")
    file.readLines().map {
        it.toInt()
    }.sorted().let {
        it.forEachIndexed { index, i ->
            val right = it.drop(index + 1).toMutableList()
            for (j in right) {
                if (i + j == 2020) {
                    println("$i - $j")
                    println(i * j)
                    return@forEachIndexed
                }
            }
        }
    }
}