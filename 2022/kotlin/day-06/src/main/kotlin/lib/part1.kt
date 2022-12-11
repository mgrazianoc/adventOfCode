package lib

fun part1(input: String): Int {

    var positionSecret = 0

    for (i in 0..input.length - 3){
        val chunk = input.slice(i..i+3).toSet()
        if (chunk.size == 4){
            positionSecret = 1 + (i+3)
            break
        }
    }

    return positionSecret
}