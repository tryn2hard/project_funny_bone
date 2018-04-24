package com.udacity.gradle.builditbigger;


import android.support.test.runner.AndroidJUnit4;


import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest implements EndpointsAsyncTask.AsyncResponse{


    @Test
    public void getJokeTest() {
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.delegate = this;
        task.execute();
    }

    @Override
    public void processFinish(String output) {

        assertNotNull("There is a joke", output);
        assertTrue("The joke is not empty", !output.isEmpty());

    }
}
