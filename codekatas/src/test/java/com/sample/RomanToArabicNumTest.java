package com.sample;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by acer pc on 22-04-2017.
 */
public class RomanToArabicNumTest {

    RomanToArabicNum underTest=new RomanToArabicNum();

    @Test
    public void shouldReturnArabicNumber(){
        int expected=10;
        int arabicNum=underTest.romanToArabicNumber("X");
        Assert.assertEquals(expected,arabicNum);


    }

}
