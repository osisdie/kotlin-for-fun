package org.example

fun main() {
    val name = "Kotlin"
    println("Hello, $name!")

    // Print with the default separator (newline)
    println("Default separator (\\n):")
    Util.printRangeNumbers()

    // Print with a custom separator (comma and space)
    println("Custom separator (', '):")
    Util.printRangeNumbers(sep = ", ")
}