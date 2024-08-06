import org.example.contexts.CheckInteger
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CheckIntegerTest {
    val checkInteger = CheckInteger()

    @Test
    fun `validate should return true for single digit integer`() {
        assertTrue(checkInteger.validate("1"))
        checkInteger.reset()
    }

    @Test
    fun `validate should return true for valid integer`() {
        assertTrue(checkInteger.validate("123"))
        checkInteger.reset()
    }

    @Test
    fun `validate should return true for valid big integer`() {
        assertTrue(checkInteger.validate("3452342352434534524346"))
        checkInteger.reset()
    }

    @Test
    fun `validate should return false for empty string`() {
        assertFalse(checkInteger.validate(""))
        checkInteger.reset()
    }

    @Test
    fun `validate should return false for string starting with 0`() {
        assertFalse(checkInteger.validate("0123"))
        checkInteger.reset()
    }

    @Test
    fun `validate should return false for string with non-digit characters`() {
        assertFalse(checkInteger.validate("123a"))
        checkInteger.reset()
    }

    @Test
    fun `validate should return false for string with only 0`() {
        assertFalse(checkInteger.validate("0"))
        checkInteger.reset()
    }

    @Test
    fun `validate should return false for string starting with non-digit character`() {
        assertFalse(checkInteger.validate("a123"))
        checkInteger.reset()
    }

    @Test
    fun `validate should return false for string with spaces`() {
        assertFalse(checkInteger.validate("1 23"))
        checkInteger.reset()
    }
}