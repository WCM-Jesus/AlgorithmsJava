package com.jjg297;

import java.util.Random;

public class Generator {

    public int[] generate_array(int size)
    {
        int[] return_array = new int[size];
        Random random_gen = new Random();

        for(int i=0; i<size; i++)
        {
            return_array[i] = random_gen.nextInt();
        }

        return return_array;
    }
}
