package lib

fun part2(input: String): Int {
    var positionSecret = 0

    for (i in 0..input.length - 13){
        val chunk = input.slice(i..i+13).toSet()
        if (chunk.size == 14){
            positionSecret = 1 + (i+13)
            break
        }
    }

    return positionSecret
}