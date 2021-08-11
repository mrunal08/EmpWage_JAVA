package com.company;

public class Main {

    //main method
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Program");
        int FT=1;
        int EMP=10;

        double totalHours=(EMP*10)%2;
     
        if(FT==totalHours){
            System.out.println("Employee Absent");
        }
        else {
            System.out.println("Employee Present");
        }


    }
}

