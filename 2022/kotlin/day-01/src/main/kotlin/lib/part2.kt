package lib

fun part2(input: String): Int {
    return input.split("\n\n").map { elven ->
        // ex: it = "1\n2\n3"

        elven.split("\n").map { calorie ->
            // ex: it = listOf("1", "2", "3")

            runCatching {
                calorie.toInt()
            }.getOrDefault(0)
        }

    }.map {
        it.sum()
    }.sorted().takeLast(3).sum()
}