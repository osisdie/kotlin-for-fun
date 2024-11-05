package org.example

/**
 * Utility class containing helper functions.
 */
class Util {

    // similar to static methods in Java
    companion object {
        /**
         * Prints numbers within the specified range, separated by the given separator.
         *
         * This function iterates over the range `startNum..endNum` and prints each number
         * in the format `i = <value>`. Each number is separated by the given separator.
         *
         * @param startNum The starting number of the range (default is 1).
         * @param endNum The ending number of the range (default is 5).
         * @param sep The separator to use between numbers (default is a newline `\n`).
         *
         * Example Output (with startNum=2, endNum=6, sep=", "):
         * ```
         * i = 2, i = 3, i = 4, i = 5, i = 6
         * ```
         */
        fun printRangeNumbers(startNum: Int = 1, endNum: Int = 5, sep: String = "\n") {
            val output = buildString {
                for (i in startNum..endNum) {
                    append("i = $i")
                    if (i < endNum) {
                        append(sep) // Use the specified separator
                    }
                }
            }
            println(output)
        }
    }
}