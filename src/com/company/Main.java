package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество целых чисел\n");
        int amount = in.nextInt();
        double [][]Numbers = new double[amount][amount];
        for(int i = 0;i < amount; i++)
        {
            for(int j = 0;j < amount; j++)
            {
                Numbers[i][j] = (int) (Math.random()*(2*amount+1)) - amount;
                System.out.print(Numbers[i][j]+" ");

            }
            System.out.print("\n");

        }
        System.out.print("\n");
        double Sum = 0;
        for(int i = 0;i < amount; i++)
        {
            for(int j = 0;j < amount; j++)
            {
                if(Numbers[i][j] > 0 )
                {
                    j++;
                    while(j < amount && Numbers[i][j] <=0)
                    {
                        Sum = Sum + Numbers[i][j];
                        j++;
                    }
                    break;
                }
            }
        }
        System.out.print("Сумма элементов равна "+Sum);
    }
}
