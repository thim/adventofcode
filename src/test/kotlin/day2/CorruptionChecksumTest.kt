package day2

import org.junit.Assert
import org.junit.Test

class CorruptionChecksumTest {

    @Test
    fun part1_sample1() {
        Assert.assertEquals(8, lineDifference("5\t1\t9\t5"))
    }

    @Test
    fun part1_sample2() {
        Assert.assertEquals(4, lineDifference("7\t5\t3"))
    }

    @Test
    fun part1_sample3() {
        Assert.assertEquals(6, lineDifference("2\t4\t6\t8"))
    }

    @Test
    fun part1_sample4() {
        Assert.assertEquals(18, calculateBlock("5\t1\t9\t5\n" + "7\t5\t3\n" + "2\t4\t6\t8"))
    }

    @Test
    fun part2_sample1() {
        Assert.assertEquals(4, lineDiv("5\t9\t2\t8"))
    }

    @Test
    fun part2_sample2() {
        Assert.assertEquals(3, lineDiv("9\t4\t7\t3"))
    }

    @Test
    fun part2_sample3() {
        Assert.assertEquals(2, lineDiv("3\t8\t6\t5"))
    }
}