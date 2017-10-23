package com.jjg297;

class Sorts
{
    static int[] bubbleSort(int[] in_array)
    {
        int[] return_array = in_array;
        int end_flag = 1;

        while(end_flag == 1)
        {
            end_flag = 0;
            for(int i = 0; i < return_array.length-1; i++)
            {
                // Sort Least to Greatest
                if(return_array[i] > return_array[i+1])
                {
                    end_flag = 1;
                    int temp;
                    temp = return_array[i];
                    return_array[i] = return_array[i+1];
                    return_array[i+1] = temp;
                }
            }
        }

        return return_array;
    }
}
