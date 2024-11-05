package org.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class UtilTest {

    @Test
    fun testPrintRangeNumbers() {
        // Redirect standard output to capture the printed values
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        val sep: String = "\n"
        Util.printRangeNumbers(startNum=1, endNum=5, sep=sep)

        // Restore the original standard output
        System.setOut(System.out)

        // Define the expected output
        val expectedOutput = "i = 1\ni = 2\ni = 3\ni = 4\ni = 5\n"

        // Assert that the captured output matches the expected output
        assertEquals(expectedOutput, outputStream.toString())
    }
}