package adventoc.day1

import java.io.File

fun star2() {
    println("star 2")
    val file = File("src/main/resources/input.txt")
    file.readLines().map {
        it.toInt()
    }.sorted().let {
        val middle = it.toMutableList()
        it.forEachIndexed { index, i ->
            middle.removeAt(index)
            middle.forEachIndexed { indexM, j ->
                val right = middle.drop(indexM).toMutableList()
                for(k in right) {
                    if(i + j+ k == 2020) {
                        println("$i - $j - $k")
                        println(i * j * k)
                        return@let
                    }
                }
            }
        }
    }
}