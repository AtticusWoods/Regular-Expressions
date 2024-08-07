import org.example.contexts.CheckFloat
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.test.Test

class CheckFloatTest {

    val checkFloat = CheckFloat()

    @Test
    fun `validate should return true for valid float`() {
        assertTrue(checkFloat.validate("1.0"))
        assertTrue(checkFloat.validate("123.34"))
        assertTrue(checkFloat.validate("0.20000"))
        assertTrue(checkFloat.validate("12349871234.12340981234098"))
        assertTrue(checkFloat.validate(".123"))
    }

    @Test
    fun `validate should return false for invalid float`() {
        assertFalse(checkFloat.validate("123"))
        assertFalse(checkFloat.validate("123.123."))
        assertFalse(checkFloat.validate("123.02a"))
        assertFalse(checkFloat.validate("123."))
        assertFalse(checkFloat.validate("012.4"))
    }

    @Test
    fun `validate should return false for empty string`() {
        assertFalse(checkFloat.validate(""))
    }

    @Test
    fun `validate should return false for non-numeric characters`() {
        assertFalse(checkFloat.validate("abc"))
    }

    @Test
    fun `validate should return true for float with leading zero followed by period`() {
        assertTrue(checkFloat.validate("0.1"))
    }

    @Test
    fun `validate should return false for float with leading zero not followed by period`() {
        assertFalse(checkFloat.validate("0123"))
    }
}