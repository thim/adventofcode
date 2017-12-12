import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseCaptchaTest {

    /**
     * PART 1
     */

    @Test
    fun Part1_sample1() {
        assertEquals(3, reverseCaptcha("1122"))
    }

    @Test
    fun Part1_sample2() {
        assertEquals(4, reverseCaptcha("1111"))
    }

    @Test
    fun Part1_sample3() {
        assertEquals(0, reverseCaptcha("1234"))
    }

    @Test
    fun Part1_sample4() {
        assertEquals(9, reverseCaptcha("91212129"))
    }


    /**
     * PART 2
     */

    @Test
    fun Part2_sample1() {
        assertEquals(6, reverseCaptcha2("1212"))
    }

    @Test
    fun Part2_sample2() {
        assertEquals(0, reverseCaptcha2("1221"))
    }

    @Test
    fun Part2_sample3() {
        assertEquals(4, reverseCaptcha2("123425"))
    }

    @Test
    fun Part2_sample4() {
        assertEquals(12, reverseCaptcha2("123123"))
    }

    @Test
    fun Part2_sample5() {
        assertEquals(4, reverseCaptcha2("12131415"))
    }
}