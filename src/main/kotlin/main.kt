import java.util.Comparator

fun main(args: String) {
    val words = args.split(" ")
    val longestWord = words.maxByOrNull { it.length }
    val length = longestWord?.length ?: 0
    val lineLenght = length + 4
    val stars = "*".repeat(lineLenght)

    println(stars)

    words.forEach  {
        println("* " + it + " ".repeat(length-it.length) + " *")
    }

    println(stars)
}