import com.github.stefanbirkner.systemlambda.SystemLambda
import org.junit.Assert
import org.junit.Test

class myMainTest {
    @Test
    fun test() {
        val result = SystemLambda.tapSystemOut {
            main("Hello Mercury in a box")
        }.trim()

        val resultLines = result.split("\n")

        val expected = arrayOf(
            "***********",
            "* Hello   *",
            "* Mercury *",
            "* in      *",
            "* a       *",
            "* box     *",
            "***********"
        )

        Assert.assertEquals(expected.size, resultLines.size)

        for (i in expected.indices) {
            Assert.assertEquals(expected[i], resultLines[i].trim())
        }
    }
}