package com.udacity.gradle.builditbigger;

import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
@SmallTest

public class EndpointsAsyncTaskTest {
    EndpointsAsyncTask.AsyncResponse mEndpointsAsyncTask;
    String mResult;


    @Test
    public void getJokeTest() throws TimeoutException, InterruptedException, ExecutionException {

        mEndpointsAsyncTask = new EndpointsAsyncTask.AsyncResponse() {
            @Override
            public void processFinish(String output) {
                mResult = output;
                assertNotNull("Test Failed", mResult);
                assertTrue("Test Failed", mResult.length() > 0);
                assertTrue("Test Failed", mResult.equals("Best joke ever!"));
            }
        };

    }
}
