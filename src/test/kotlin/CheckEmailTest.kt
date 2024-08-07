import org.example.contexts.CheckEmail
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CheckEmailTest {

    val checkEmail = CheckEmail()

    @Test
    fun `validate should return true for valid email addresses`() {
        assertTrue(checkEmail.validate("a@b.c"))
//        assertTrue(checkEmail.validate("joseph.ditton@usu.edu"))
//        assertTrue(checkEmail.validate("{}*$.&$*(@*$%&.*&*"))
    }

    @Test
    fun `validate should return false for email missing part one`() {
        assertFalse(checkEmail.validate("@b.c"))
    }

    @Test
    fun `validate should return false for email with multiple at symbols`() {
        assertFalse(checkEmail.validate("a@b@c.com"))
    }

    @Test
    fun `validate should return false for email with multiple periods after at symbol`() {
        assertFalse(checkEmail.validate("a.b@b.b.c"))
    }

    @Test
    fun `validate should return false for email containing spaces`() {
        assertFalse(checkEmail.validate("joseph ditton@usu.edu"))
    }

    @Test
    fun `validate should return false for email with empty part two`() {
        assertFalse(checkEmail.validate("a@.com"))
    }

    @Test
    fun `validate should return false for email with empty part three`() {
        assertFalse(checkEmail.validate("a@b."))
    }

    @Test
    fun `validate should return false for email with invalid characters`() {
        assertFalse(checkEmail.validate("a@b,c"))
        assertFalse(checkEmail.validate("a@b;c"))
        assertFalse(checkEmail.validate("a@b:c"))
    }

    @Test
    fun `validate should return false for email missing at symbol`() {
        assertFalse(checkEmail.validate("abc.com"))
    }

    @Test
    fun `validate should return false for email missing period after at symbol`() {
        assertFalse(checkEmail.validate("a@bc"))
    }
}