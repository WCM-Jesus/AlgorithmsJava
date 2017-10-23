package com.jjg297;

import java.util.Arrays;

import static java.lang.System.*;

/*
    This project is a personal project to test myself in implementing
    various algorithms or data structures. It will perhaps serve as a self-reference
    for myself.
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Generator array_generator = new Generator();

        int args_len = args.length;
        int[] in_array;

        switch(args_len)
        {
            case 2:
                out.println("No size specified, defaulting to size 10");
                in_array = array_generator.generate_array(10);

                out.println(Arrays.toString(in_array));
                break;
            case 3:
                // Enter some generation text
                String alg_select = "none";
                in_array = array_generator.generate_array(Integer.parseInt(args[3]));

                out.println(Arrays.toString(in_array));

                break;
            default:
                break;
        }

    }
}
