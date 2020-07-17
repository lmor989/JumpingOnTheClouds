package org.example;

/**
 * Hacker Rank Interview Preparation kit
 * Jumping On The Clouds
 * Difficulty: Easy
 */
public class JumpingOnTheClouds
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int jumpingOnClouds(int[] c) {
        int jumps = 0;

        for (int i = 0; i < c.length; i++) {
            while (i + 2 < c.length && c[i + 2] == 0) {
                jumps++;
                i += 2;
            }
            if (i + 1 < c.length && c[i + 1] == 0) {
                jumps++;
            }
        }

        return jumps;
    }
}
