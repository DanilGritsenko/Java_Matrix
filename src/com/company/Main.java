package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int x = 3;
        String text = "Hello";
        float arv = 1.34f;
        System.out.printf("Arvub %d, \nText on %s\nFloat number %.2f....\n", x, text, arv);
        Scanner entry = new Scanner(System.in);
        System.out.println("Misinu nimi?: ");
        String nimi = entry.nextLine();
        System.out.println(nimi);
        System.out.println("Jahei?: ");
        Boolean yesno = entry.nextBoolean();
        System.out.print(yesno);
        entry.close();
        if (yesno && nimi.equals("Kirill")) {
            System.out.println("Tere   ");
        }
            else{
                System.out.println("Head");
            }

        int number = 100;
            do{
                System.out.printf("Ruud juur %d arvust %4f\n",number,Math.sqrt(number));
                number--;

            }while(number>=1);
            number = 100;
            while(number>=0){
                System.out.printf("Ruud juur %d arvust %4f\n",number,Math.sqrt(number));
                number--;
            }*/
        int[] arvud = new int[]{1, 100, 25, 700};
        int[] arvud2 = new int[6];
        arvud2[0] = 29;
        arvud2[1] = 20;
        arvud2[2] = 24;
        arvud2[3] = 67;
        arvud2[4] = 8;
        arvud2[5] = 106;

        for (int i = 0; i < arvud2.length; i++) {
            System.out.println(arvud2[i]);


        }

        int[][] nums = new int[][]
                {
                        {7, 2, 3},
                        {4, 5, 6},
                        {7, 6, 9}
                };
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter the numbers, 3 numbers per row, enter after each: ");
        int entry1 = Integer.parseInt(entry.nextLine());
        System.out.print(entry1);
        System.out.print("   ");
        int entry2 = Integer.parseInt(entry.nextLine());
        System.out.print(entry1 + " " + entry2);
        System.out.print("   ");
        int entry3 = Integer.parseInt(entry.nextLine());
        System.out.println(entry1+ " " +entry2+ " " +entry3);
        System.out.print("   ");
        int entry4 = Integer.parseInt(entry.nextLine());
        System.out.print(entry4);
        System.out.print("   ");
        int entry5 = Integer.parseInt(entry.nextLine());
        System.out.print(entry4+ " " +entry5);
        System.out.print("   ");
        int entry6 = Integer.parseInt(entry.nextLine());
        System.out.println(entry4+ " " +entry5+ " " +entry6);
        System.out.print("   ");
        int entry7 = Integer.parseInt(entry.nextLine());
        System.out.print(entry7);
        System.out.print("   ");
        int entry8 = Integer.parseInt(entry.nextLine());
        System.out.print(entry7+ " " +entry8);
        System.out.print("   ");
        int entry9 = Integer.parseInt(entry.nextLine());
        System.out.println(entry7+ " " +entry8+ " " +entry9);
        System.out.println("Completed matrix: ");
        int[][] mnums = new int[][]
                {
                        {entry1, entry2, entry3},
                        {entry4, entry5, entry6},
                        {entry7, entry8, entry9}
                };
        for (int i = 0; i < mnums.length; i++) {
            for (int j = 0; j < mnums[i].length; j++) {
                System.out.printf("%d ", mnums[i][j]);
            }
            System.out.println();
        }

            int mnums1 = mnums[0][0] * mnums[1][1] * mnums[2][2];
            int mnums2 = mnums[0][1] * mnums[1][2] * mnums[2][0];
            int mnums3 = mnums[0][2] * mnums[1][0] * mnums[2][1];
            int mnums4 = mnums[0][2] * mnums[1][1] * mnums[2][0];
            int mnums5 = mnums[0][0] * mnums[1][2] * mnums[2][1];
            int mnums6 = mnums[0][1] * mnums[1][0] * mnums[2][2];
            int answer = mnums1 + mnums2 + mnums3 - mnums4 - mnums5 - mnums6;

            System.out.print("Answer is: ");
            System.out.println(answer);

           /* for(int i=0;i<nums.length;i++){
                for (int j=0;j<nums[i].length;j++){
                    System.out.printf("%d",nums[i][j]);
                }
                System.out.println();
            }

          int nums1 = nums[0][0] * nums[1][1] * nums[2][2];
          int nums2 = nums[0][1] * nums[1][2] * nums[2][0];
          int nums3 = nums[0][2] * nums[1][0] * nums[2][1];
          int nums4 = nums[0][2] * nums[1][1] * nums[2][0];
          int nums5 = nums[0][0] * nums[1][2] * nums[2][1];
          int nums6 = nums[0][1] * nums[1][0] * nums[2][2];
          int answer = nums1+nums2+nums3-nums4-nums5-nums6;
          System.out.print("Answer is: ");
          System.out.println(answer);*/
        }
    }
