package com.company;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int weightMidterm;
    static int weightFinal;
    static int scoreAssignments;
    static int maxAssignments;
    static int sumAll;
    static int sunAllMax;
    static double scoreWeightedMidterms;
    static double scoreWeightedFinals;
    static double weightedScores;
    //Giá trị trả về
    public static double sum(double a , double b){
        return a+b;
    }
    public static void main(String[] args) {
	// write your code here
        begin();
        System.out.println();
        midterm();
        System.out.println();
        finalTerm();
        System.out.println();
        homework();
        System.out.println();
        report();
    }
    //Tạo hàm begin() để hiển thị thông điệp chào mừng.
    public static void begin(){
        System.out.println("This program reads exam/homework scores and reports your overall course grade");
    }
    //Hàm midterm() để nhập và tính toán điểm thi giữa kỳ.
    public static void midterm(){
        System.out.println("Midterm:");
        //Nhập trọng số của điểm thi giữa kỳ
        System.out.print("Weight (0-100): ");
        weightMidterm = sc.nextInt();
        //Nhập điểm số mà người dùng đã đạt được
        System.out.print("Score earned? ");
        double scoreMidterm =sc.nextDouble();
        //chọn 1 là có và hai là không
        System.out.print("Were scores shifted (1=yes, 2 =no)? ");
        String yes = sc.next();
        //nếu có thì tăng thêm điểm
        if(yes.equals("1")){
            System.out.print("Shift amount?");
            int amountMidterm = sc.nextInt();
            //totalPoints tổng điểm
            double totalPoints = sum(scoreMidterm , amountMidterm);
            //totalPoints không đc quá 100
            if(totalPoints > 100){
                totalPoints =100;
            }
            System.out.println("Total points = " + totalPoints + "/ 100");
            //Tính Weighted score
            double  scoreWeightedMidterm = (totalPoints /100)*weightMidterm;
            scoreWeightedMidterms =Math.round(scoreWeightedMidterm*10.0)/10.0;
            System.out.println("Weighted score = " + scoreWeightedMidterms +" / "+ weightMidterm);
        }
        //nếu người dùng nhặp vào là 2
        else if(yes.equals("2")){
            System.out.println("Total points = " + scoreMidterm + "/ 100");
            //số Weighted score khi chưa làm tròn
            double scoreWeightedMidterm = (scoreMidterm/100)*weightMidterm;
            //số Weighted score khi  làm tròn  tới 1 chữ số đằng sau dấu thập phân.
             scoreWeightedMidterms =Math.round(scoreWeightedMidterm*10.0)/10.0;
            System.out.println("Weighted score = " + scoreWeightedMidterms +" / "+ weightMidterm);

        }
    }

    //Hàm finalterm() để nhập và tính toán điểm thi cuối kỳ.
    public static void finalTerm(){
        System.out.println("Final:");
        //trọng số của điểm thi cuối kì
        System.out.print("Weight (0-100): ");
        weightFinal = sc.nextInt();
        //điểm số mà người dùng đã đạt được.
        System.out.print("Score earned? ");
        double scoreFinal =sc.nextDouble();
        //chọn 1 là có và hai là không
        System.out.print("Were scores shifted (1=yes, 2 =no)? ");
        String yes = sc.next();
        //nếu có thì tăng thêm điểm

        if(yes.equals("1")){
            System.out.print("Shift amount?");
            int amountMidterm = sc.nextInt();
            //totalPoints tổng điểm
            double totalPoints = sum(scoreFinal , amountMidterm);
            //totalPoints không đc quá 100
            if(totalPoints > 100){
                totalPoints =100;
            }
            //Tính Weighted score
            System.out.println("Total points = " + totalPoints + "/ 100");

            double scoreWeightedFinal= (totalPoints /100)*weightFinal;
            //số Weighted score khi  làm tròn  tới 1 chữ số đằng sau dấu thập phân.
            scoreWeightedFinals =Math.round(scoreWeightedFinal*10.0)/10.0;
            System.out.println("Weighted score = " + scoreWeightedFinals +" / "+ weightFinal);
        }
        //nếu người dùng nhặp vào là 2

        else if(yes.equals("2")){
            System.out.println("Total points = " + scoreFinal + "/ 100");
            //số Weighted score khi chưa làm tròn
            double scoreWeightedFinal = (scoreFinal /100)*weightFinal;
            //số Weighted score khi  làm tròn  tới 1 chữ số đằng sau dấu thập phân.
            scoreWeightedFinals =Math.round(scoreWeightedFinal*10.0)/10.0;
            System.out.println("Weighted score = " + scoreWeightedFinals +" / "+ weightFinal);

        }
    }
    //Hàm homework() để nhập và tính toán điểm bài tập về nhà.
    public static void homework(){
        System.out.println("Homework:");
        //trọng số của điểm bài tập về nhà
        System.out.print("Weight (0-100): ");
        double weightHomeWork = sc.nextDouble();

        //nếu 3 trọng số Weight không bằng 100 thì nhặp lại
        while (weightHomeWork + weightMidterm + weightFinal  != 100) {

            System.out.println("Vui lòng nhập lại ! Bạn phải đảm bảo tổng 3 trọng số Weight chính xác là 100");
            System.out.print("Weight (0-100): ");
            int weightHomeWorkAgain = sc.nextInt();
            if (weightHomeWorkAgain + weightMidterm + weightFinal == 100) {
                break;
            }
        }
        //Số bài assignments
        System.out.print("Number of assignments: ");
        int numberAssignments = sc.nextInt();
        //Lặp từng bài assignments tương ưng với số bài mình vừa nhập
        for (int i = 1 ; i <= numberAssignments ; i++){
                System.out.print("Assignment " + i + " score and max: ");
                 scoreAssignments = sc.nextInt();
                  maxAssignments =sc.nextInt();
                  //tổng tất cả của scoreAssignments
                  sumAll += scoreAssignments;
                  //tổng tát cả của maxAssignments
                  sunAllMax += maxAssignments;
            }
        //nếu số thực của sinh viên đạt được lớn hơn 150 thì cho nó bằng 150
        if (sumAll > 150){
            sumAll = 150;
        }
        //nếu  điểm tối đa của bài lớn hơn 150 thì cho bằng 150
        if (sunAllMax >150){
            sunAllMax =150;
        }
        //số lượng buổi học sinh viên đã đi học và được điểm danh
        System.out.print("How many sections did you attend ? ");
        int sections =sc.nextInt();
        // tổng số điểm chuyên cần của sinh viên, với mỗi buổi được điểm danh là 5 điểm
        int totalSectionPoints = sections * 5 ;
        //Điểm tối đa của phần Attend là 30, nếu vượt quá 30 thì vẫn chỉ tính là 30.
        if(totalSectionPoints > 30){
            totalSectionPoints = 30 ;
        }
        System.out.println("Section points: " + totalSectionPoints + " / 30");
        //điểm số của sinh viên đạt được và điểm chuyên cần
        double scoreTotalPoints = (int)sumAll + totalSectionPoints;
        //Điểm tối đa của phần bài tập và điểm chuyên cần
        int maxTotalPoints = sunAllMax + 30 ;
        System.out.println("Total points = " + scoreTotalPoints + " / " + maxTotalPoints);
        // điểm tính theo trọng số thực tế
        double weightedScore =  (scoreTotalPoints / maxTotalPoints)* weightHomeWork;
        //Làm tròn lên chữ số thứ nhất
        weightedScores = Math.round(weightedScore * 10.0)/10.0;
        System.out.println("Weighted score = " + weightedScores + " / 45");

    }


    //Hàm report() để tính toán về hiển thị kết quả GPA cũng như thông báo nhận xét tương ứng.
    public static void report(){
        //tổng điểm sinh viên đạt được của 3 môn tính theo thang điểm 100
        double Overall = scoreWeightedMidterms + scoreWeightedFinals +weightedScores;
        System.out.println("Overallpercentage = " + Overall);
        double grade = 0;
        //Quy tắc tính min grade: 85% and above: 3.0; 84.99% - 75%: 2.0; 74.99% - 60%: 0.7; under 60%: 0.0.
        if (grade<100 || grade >=85){
            grade += 3.0;
            System.out.println("Your grade will be at least : " + grade);
            System.out.println("Rất tốt hãy cố gắng hơn nữa!");
        }else if (grade <= 84.99 || grade >= 75){
            grade += 2.0;
            System.out.println("Your grade will be at least : " + grade);
            System.out.println("Tạm ổn hãy cải thiện!");
        }else if (grade <= 74.99 || grade >=60){
            grade += 0.7;
            System.out.println("Your grade will be at least : " + grade);
            System.out.println("Kém hãy cố hơn!");
        }else if (grade < 60){
            grade += 0 ;
            System.out.println("Your grade will be at least : " + grade);
            System.out.println("Rất kém cần chăm chỉ hơn!");
        }else {
            grade +=4;
            System.out.println("Your grade will be at least : " + grade);
            System.out.println("Tuyệt vời hãy giữ phong độ");
        }



    }
}
