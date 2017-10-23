package com.jjg297;

import java.util.Random;

class Generator {

    int[] generate_array(int size)
    {
        int[] return_array = new int[size];
        Random random_gen = new Random();

        for(int i=0; i<size; i++)
        {
            int temp = random_gen.nextInt(2000);
            while(temp < 0)
            {
                temp = random_gen.nextInt(2000);
            }

            return_array[i] = temp;
        }

        return return_array;
    }
}
