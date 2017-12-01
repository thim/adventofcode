import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseCaptchaTest {

    @Test
    fun Part1_sample1() {
        assertEquals(3, ReverseCaptchaPart1.reverseCaptcha("1122"))
    }

    @Test
    fun Part1_sample2() {
        assertEquals(4, ReverseCaptchaPart1.reverseCaptcha("1111"))
    }

    @Test
    fun Part1_sample3() {
        assertEquals(0, ReverseCaptchaPart1.reverseCaptcha("1234"))
    }

    @Test
    fun Part1_sample4() {
        assertEquals(9, ReverseCaptchaPart1.reverseCaptcha("91212129"))
    }


    /**
     * PART 2
     */

    @Test
    fun Part2_sample1() {
        assertEquals(6, ReverseCaptchaPart2.reverseCaptcha("1212"))
    }

    @Test
    fun Part2_sample2() {
        assertEquals(0, ReverseCaptchaPart2.reverseCaptcha("1221"))
    }

    @Test
    fun Part2_sample3() {
        assertEquals(4, ReverseCaptchaPart2.reverseCaptcha("123425"))
    }

    @Test
    fun Part2_sample4() {
        assertEquals(12, ReverseCaptchaPart2.reverseCaptcha("123123"))
    }

    @Test
    fun Part2_sample5() {
        assertEquals(4, ReverseCaptchaPart2.reverseCaptcha("12131415"))
    }
}