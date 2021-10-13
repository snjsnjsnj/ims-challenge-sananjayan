import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import org.junit.Assert
import org.junit.Test

internal class MainTest {
    @Test
    fun `can translate a simple key`() {
        val output = tapSystemOut {
            main(arrayOf("Hello World!"))
        }.trim()

        Assert.assertEquals("Hello World!", output)
    }
}