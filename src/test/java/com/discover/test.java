package com.discover;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class test {

    @Test
    public void test() {

        Motion.motionOpen();
        Motion.votingProcess();
        Motion.motionClosed();

        if (Motion.votingProcess().equals("Voting passed!")) {
            Assert.assertTrue(Motion.votingProcess().equals("Voting passed!"));
        } else {
            Assert.assertTrue(Motion.votingProcess().equals("Voting failed!"));
        }


    }
}



