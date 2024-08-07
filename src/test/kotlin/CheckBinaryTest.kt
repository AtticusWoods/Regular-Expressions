import org.example.contexts.CheckBinary
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CheckBinaryTest {

    val checkBinary = CheckBinary()

    @Test
    fun `validate should return true for valid binary starting and ending with 1`() {
        assertTrue(checkBinary.validate("1"))
        assertTrue(checkBinary.validate("11"))
        assertTrue(checkBinary.validate("101"))
        assertTrue(checkBinary.validate("111111"))
        assertTrue(checkBinary.validate("10011010001"))
    }

    @Test
    fun `validate should return false for binary not starting with 1`() {
        assertFalse(checkBinary.validate("01"))
        assertFalse(checkBinary.validate("010"))
        assertFalse(checkBinary.validate("0011"))
    }

    @Test
    fun `validate should return false for binary not ending with 1`() {
        assertFalse(checkBinary.validate("10"))
        assertFalse(checkBinary.validate("100"))
        assertFalse(checkBinary.validate("1010"))
    }

    @Test
    fun `validate should return false for binary with invalid characters`() {
        assertFalse(checkBinary.validate("100a01"))
        assertFalse(checkBinary.validate("10b01"))
        assertFalse(checkBinary.validate("1012"))
    }

    @Test
    fun `validate should return false for empty string`() {
        assertFalse(checkBinary.validate(""))
    }

    @Test
    fun `validate should return false for binary with spaces`() {
        assertFalse(checkBinary.validate("1 01"))
        assertFalse(checkBinary.validate("10 1"))
    }
}