import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import org.junit.Assert
import org.junit.Test

internal class MainTest {
    @Test
    fun `can fit a box around a sentence`() {
        val result = tapSystemOut {
            main("Hello Mercury in a box")
        }.trim()

        val expected =
            """
***********
* Hello   *
* Mercury *
* in      *
* a       *
* box     *
***********
""".trimIndent()

        Assert.assertEquals(expected, result)
    }
}