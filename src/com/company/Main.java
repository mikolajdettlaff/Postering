package com.company;
import java.util.Scanner;

public class Main
    {
        public static void main(String[] args)
            {
                int postersAmount = 0;
                int a = 0;
                Scanner scanner = new Scanner(System.in);
                int buildingsAmount = scanner.nextInt();
                int [] x = new int[buildingsAmount];
                int [] stack = new int[buildingsAmount ];
                x[0] = scanner.nextInt();
                stack[0] = scanner.nextInt();
                for(int i = 1; i < buildingsAmount; i++)
                    {
                        x[i] = scanner.nextInt();
                        int height = scanner.nextInt();
                        while (height < stack[a])
                            {
                                postersAmount++;
                                a--;
                                if(a == -1) stack[++a] = height;
                            }
                        if(height > stack[a]) stack[++a] = height;
                    }
                    postersAmount += a+1;
                    System.out.println(postersAmount);
            }
    }