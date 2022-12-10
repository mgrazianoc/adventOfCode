package lib

fun parseItem(item: Char): Int = when {
    item.isUpperCase() -> {
        item.code - 38
    }
    item.isLowerCase() -> {
        item.code - 96
    }
    else -> {
        0
    }
}
