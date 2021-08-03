package com.hqyj.mc.Test.Junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JunitDemo {
    @Before
    public void init(){
        System.out.println("---init");
    }
    @After
    public void aa(){
        System.out.println("---aa");
    }
    @Test
    public void testAdd(){
        jisaunqi jsq = new jisaunqi();
        int add = jsq.add(1, 2);
        System.out.println(add);
    }
    @Test
    public void testSub(){
        jisaunqi jsq = new jisaunqi();
        int sub = jsq.sub(5, 2);
        Assert.assertEquals(3,sub);
    }
}
