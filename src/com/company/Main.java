package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int t = 0;
        int lowest = 0;
        int total;
        int lowest_hour_diff = 0;
        while (0 <= t && t <= 100)
        {
            // t*(t-20)*(t-100) + 120000
            int current = t*(t-20)*(t-100) + 120000;
            int previous = (t-1)*((t-1)-20)*((t-1)-100) + 120000;
            total = current - previous;

            if (total < lowest)
            {
                lowest = total;
                lowest_hour_diff = t;
            }

            t++;
        }
        System.out.println(lowest_hour_diff);
    }
}
