package com.programmers.sort;

import org.junit.Assert;
import org.junit.Test;

public class FileNameAlignmentTest {

    @Test
    public void testCase1(){
        //GIVEN
        String[] files = {"foo9.txt", "foo010bar020.zip", "F-15"};
        String[] expectedResult = {"F-15", "foo9.txt", "foo010bar020.zip"};
        //WHEN
        FileNameAlignment processCommand = new FileNameAlignment();
        String[] actualResult = processCommand.main(files);
        //THEN
        int index = 0;
        for(String s : expectedResult){
            Assert.assertEquals(s, actualResult[index]);
            index++;
        }
    }

    @Test
    public void testCase2(){
        //GIVEN
        String[] files = {"muzi1.txt", "MUZI1.txt", "muzi001.txt", "muzi1.TXT"};
        String[] expectedResult = {"muzi1.txt", "MUZI1.txt", "muzi001.txt", "muzi1.TXT"};
        //WHEN
        FileNameAlignment processCommand = new FileNameAlignment();
        String[] actualResult = processCommand.main(files);
        //THEN
        int index = 0;
        for(String s : expectedResult){
            Assert.assertEquals(s, actualResult[index]);
            index++;
        }
    }

    @Test
    public void testCase3(){
        //GIVEN
        String[] files = {"img12.png", "img10.png", "img02.png",
                                "img1.png", "IMG01.GIF", "img2.JPG"};
        String[] expectedResult = {"img1.png", "IMG01.GIF", "img02.png",
                                        "img2.JPG", "img10.png", "img12.png"};
        //WHEN
        FileNameAlignment processCommand = new FileNameAlignment();
        String[] actualResult = processCommand.main(files);
        //THEN
        int index = 0;
        for(String s : expectedResult){
            Assert.assertEquals(s, actualResult[index]);
            index++;
        }
    }

    @Test
    public void testCase4(){
        //GIVEN
        String[] files = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II",
                                "F-14 Tomcat"};
        String[] expectedResult = {"A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter",
                                        "F-14 Tomcat"};
        //WHEN
        FileNameAlignment processCommand = new FileNameAlignment();
        String[] actualResult = processCommand.main(files);
        //THEN
        int index = 0;
        for(String s : expectedResult){
            Assert.assertEquals(s, actualResult[index]);
            index++;
        }
    }

    @Test
    public void testCase5(){
        //GIVEN
        String[] files = {"ab001ba002.txt", "Ab01ba001.txt", "F100a112.zip",
                                "F.80a113.zip", "F 80a113.txt"};
        String[] expectedResult = {"ab001ba002.txt", "Ab01ba001.txt", "F100a112.zip",
                                "F 80a113.txt", "F.80a113.zip"};
        //WHEN
        FileNameAlignment processCommand = new FileNameAlignment();
        String[] actualResult = processCommand.main(files);
        //THEN
        int index = 0;
        for(String s : expectedResult){
            Assert.assertEquals(s, actualResult[index]);
            index++;
        }
    }

    @Test
    public void testCase6(){
        //GIVEN
        String[] files = {"a5555574ba.txt", "a5555547ba.txt"};
        String[] expectedResult = {"a5555574ba.txt", "a5555547ba.txt"};
        //WHEN
        FileNameAlignment processCommand = new FileNameAlignment();
        String[] actualResult = processCommand.main(files);
        //THEN
        int index = 0;
        for(String s : expectedResult){
            Assert.assertEquals(s, actualResult[index]);
            index++;
        }
    }
}
