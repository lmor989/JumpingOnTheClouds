package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class JumpingOnTheCloudsTest {
    JumpingOnTheClouds obj = new JumpingOnTheClouds();
    int[] clouds;

    @Test
    public void jumpingOnTheCloudsTest() {
        clouds = new int[]{0,0,1,0,0,1,0};

        int expectedJumps = 4;
        int actualJumps = obj.jumpingOnClouds(clouds);

        Assert.assertEquals(expectedJumps, actualJumps);
    }

    @Test
    public void jumpingOnTheCloudsTest2() {
        clouds = new int[]{0, 0, 0, 1, 0, 0};

        int expectedJumps = 3;
        int actualJumps = obj.jumpingOnClouds(clouds);

        Assert.assertEquals(expectedJumps, actualJumps);
    }

    @Test
    public void jumpingOnTheCloudsTest3() {
        clouds = new int[]{0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1,
                0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0,
                0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0};
        int expectedJumps = 46;
        int actualJumps = obj.jumpingOnClouds(clouds);

        Assert.assertEquals(expectedJumps, actualJumps);
    }
}
