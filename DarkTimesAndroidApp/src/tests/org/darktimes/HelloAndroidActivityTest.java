package org.darktimes;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class HelloAndroidActivityTest
{
    @Test
    public void testSome(){
       Assert.assertEquals(3, 3);
    }
}
