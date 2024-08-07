import org.example.contexts.CheckPassword
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CheckPasswordTest {

    val checkPassword = CheckPassword()

    @Test
    fun `validate should return true for valid password`() {
        assertTrue(checkPassword.validate("abcdE!fg"))
    }

    @Test
    fun `validate should return true for password with multiple capital letters and special characters`() {
        assertTrue(checkPassword.validate("AbcD!EfGh@Ij"))
    }

    @Test
    fun `validate should return true for password with tons of stuff`() {
        assertTrue(checkPassword.validate("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH"))
    }

    @Test
    fun `validate should return false for password less than 8 characters`() {
        assertFalse(checkPassword.validate("aA!bc"))
    }

    @Test
    fun `validate should return false for password without capital letter`() {
        assertFalse(checkPassword.validate("abcd!efg"))
    }

    @Test
    fun `validate should return false for password without special character`() {
        assertFalse(checkPassword.validate("abcdEfgh"))
    }

    @Test
    fun `validate should return false for password ending with special character`() {
        assertFalse(checkPassword.validate("abcdEfg!"))
    }

    @Test
    fun `validate should return false for empty string`() {
        assertFalse(checkPassword.validate(""))
    }

    @Test
    fun `validate should return false for password with spaces`() {
        assertFalse(checkPassword.validate("abcd Efg"))
    }

    @Test
    fun `validate should return false for password with only special characters`() {
        assertFalse(checkPassword.validate("!@#$%^&*"))
    }
}