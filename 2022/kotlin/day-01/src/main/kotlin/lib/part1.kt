package lib

fun part1(input: String): Int {
    return input.split("\n\n").map { elven ->
        // ex: it = "1\n2\n3"

        elven.split("\n").map { calorie ->
            // ex: it = listOf("1", "2", "3")

            runCatching {
                calorie.toInt()
            }.getOrDefault(0)
        }

    }.maxOfOrNull {
        // ex: it = listOf(1, 2, 3)
        it.sum()
    } ?: 0
}