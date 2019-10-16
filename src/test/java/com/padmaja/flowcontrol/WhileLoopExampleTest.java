package com.padmaja.flowcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class WhileLoopExampleTest {

        private WhileLoopExample whileLoopExample;
        @BeforeClass
        public static void setUpClass()
        {
            System.out.println("set up class");
            // ForLoopExample forLoopExample = new ForLoopExample();
        }
        @Before
        public void setUp(){
            whileLoopExample = new WhileLoopExample();
        }

        @After
        public void tearDown(){
            System.out.println("tear down");
            whileLoopExample = null;
        }
        @Test
        public void whileLoopExample1() {
            int result = whileLoopExample.tablesExample(9,false);
            System.out.println(result);
            int expectedresult = 6;
            assertEquals(expectedresult,result);
        }
        @Test
        public void WhileLoopExample2() {
            WhileLoopExample whileLoopExample = new WhileLoopExample();
            int result = whileLoopExample.whileLoopExample2(9,true);
            System.out.println(result);
            int expectedresult = 9;
            assertEquals(expectedresult,result);
        }

    @Test
    public void whileLoopExample3() {
        int result = whileLoopExample.tablesExample(99,true);
        System.out.println(result);
        int expectedresult = 99;
        assertEquals(expectedresult,result);
    }


    @Test
    public void WhileLoopExample4() {
        WhileLoopExample whileLoopExample = new WhileLoopExample();
        int result = whileLoopExample.whileLoopExample2(0,false);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }
    @Test
    public void whileLoopExample5() {
        int result = whileLoopExample.tablesExample(999,true);
        System.out.println(result);
        int expectedresult = 999;
        assertEquals(expectedresult,result);
    }

    @Test
    public void whileLoopExample6() {
        int result = whileLoopExample.tablesExample(0,false);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }

    @Test
    public void whileLoopExample7() {
        int result = whileLoopExample.tablesExample(-9,true);
        System.out.println(result);
        int expectedresult = -9;
        assertEquals(expectedresult,result);
    }

    @Test
    public void whileLoopExample8() {
        int result = whileLoopExample.tablesExample(-99999999,false);
        System.out.println(result);
        int expectedresult = -100000006;
        assertEquals(expectedresult,result);
    }

}



