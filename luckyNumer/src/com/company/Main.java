package com.company;


import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Main {
    static int totalGames=0;
    static int  totalGuesses=0;
    static double guessesGame ;
    static int bestGame = 0;
    static String again ;


    public static void main(String[] args) {
        // write your code here
        RunGame();//gọi hàm  RunGame để thực hiện trò chơi
        report();//gọi hàm report để hiển thị báo cáo
    }
    public static void RunGame(){
        Random luckyNumber = new Random();
        System.out.println("I'm thinking of a number between 0 and 100...");
        Scanner sc = new Scanner(System.in);
        int next;
        int lucky;//số ngẫu nhiên

        do {
            lucky = luckyNumber.nextInt(100)+1;//số ngẫu nhiên từ 1 -100
            System.out.println(lucky);
            int guessPerGame4 = 1;//số guess trong một game

            do {

                System.out.print("Your guess?");
                next = sc.nextInt();//nhập số ngẫu nhiên
                if(next > lucky){
                    System.out.println("It's  lower.");
                    guessPerGame4++;
                }
                else if (next < lucky){
                    System.out.println("It's higher");
                    guessPerGame4++;
                }
                else{//nếu next == lucky thì in ra
                    System.out.println("You got it right in "+ guessPerGame4 + " guess!");
                }

            }
            while (next != lucky);//khi không bằng số lucky thì chạy lại hàm do

            System.out.print("Do you want to play again?");

            again= sc.next();
            System.out.println("I'm thinking of a number between 0 and 100...");

            totalGames++;
            totalGuesses+=guessPerGame4;
            guessesGame = (double)totalGuesses/totalGames;
            if(bestGame > guessPerGame4 || bestGame == 0){
                bestGame = guessPerGame4;
            }
        }

        while (again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("y"));//nếu next == lucky thì chạy lệnh trên

    }


    public static void report(){
        System.out.println("Overall results: " );
        System.out.println("Total game: " + totalGames);//hiển thị số lần chơi game
        System.out.println("Total guesses: " + totalGuesses  );//hiển thị tất cả số lượt đoán
        System.out.println("Guesses/Game: " + guessesGame);//hiển thị trung bình mỗi lượt
        System.out.println("Best game: "+bestGame);

    }
}
