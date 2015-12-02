package com.qyf404.learn.maven;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;


public class AppTest {


    private App app;

    @Before
    public void setUp() {
        app = new App();
    }

    @Test
    @Category(com.qyf404.learn.maven.FastTests.class)
    public void testAdd() throws InterruptedException {
        int a = 1;
        int b = 2;
        int result = app.add(a, b);
        System.out.println("---" + Thread.currentThread().getName());
        Assert.assertEquals(a + b, result);
    }

    @Test()
    @Category(com.qyf404.learn.maven.SlowTests.class)
    public void testSubtract() throws InterruptedException {
        int a = 1;
        int b = 2;
        int result = app.subtract(a, b);
        System.out.println("---" + Thread.currentThread().getName());
        Assert.assertEquals(a - b, result);
    }

    @After
    public void tearDown() throws Exception {
    }

}