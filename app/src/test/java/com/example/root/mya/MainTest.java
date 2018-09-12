package com.example.root.mya;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.junit.Assert.assertNotNull;

@RunWith(LocalRobolectricTestRunner.class)
public class MainTest {

    MainActivity mainActivity;
    @Before
    public void setUp(){
        mainActivity = Robolectric.setupActivity(MainActivity.class);
        assertNotNull(mainActivity);
    }

    @Test
    public void testShow() throws  Exception {


        Assert.assertTrue(true);
    }


    @Test
    public void testCost(){
        int a=5;
        int b=6;
        Assert.assertEquals(11,a+b);
    }
}
