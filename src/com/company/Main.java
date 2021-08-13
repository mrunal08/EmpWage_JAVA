package com.company;

public class Main {

    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        /*   ------------------------------------------------------------------*/

        //Employee Present of absent//
        int FT = 1;
        int EMP = 10;

        double totalHours = (EMP * 10) % 2;
      
        if (FT == totalHours) {
            System.out.println("UC1->Employee Absent");
        } else {
            System.out.println("UC1->Employee Present");
        }

        /*-------------------------------------------------------------------*/

        //Employee Daily Wage
        int fullHour = 8;
        int wage = fullHour * 20;
        System.out.println("UC2->Employee Daily Fulltime Wage is " + wage);

        //Employee Daily Part time Wage

        int partTimeHour = 4;
        int partTimeWage = partTimeHour * 20;
        System.out.println("UC3->Employee Daily Part Time Wage is " + partTimeWage);

        /*---------------------------------------------------------------------*/



        int totalHour;
        String work;
        int rand = (int)(Math.floor(Math.random() * 10) % 3);

        switch (rand) {
            case 0:
                totalHour = 8;
                wage = totalHour * 20;
                work = "FullTime";
                break;
            case 1:
                totalHour = 4;
                wage = partTimeHour * 20;
                work = "HalfTime";
                break;
            default:
                totalHour = 0;
                wage = 0;
                work = "Absent";
                break;
        }
        System.out.println("UC4->Employee Wage for " + work + " is " + wage);

        /*-----------------------------------------------------------*/
        int FULLT=1;
        int HALFT=0;
        int monthWage;
        int WORKDAYS = 20;
        int totalMonthWage = 0;
        int totalMonthHours;
        int hour = 0;
        double tHour=(Math.floor(Math.random()*10)%2);


        if (hour == FULLT) {
            totalMonthHours = WORKDAYS * 8;
            totalMonthWage = totalMonthHours * 20;
        } else if (hour == HALFT) {
            totalMonthHours = WORKDAYS * 4;
            totalMonthWage = totalMonthHours * 20;
        }

        System.out.println("UC5->Total Montly wage of Employee is: " + totalMonthWage);


        /*--------------------------------------------------------------------*/
//UC6--Wages till a condition is met
    /*   int MAX_DAYS=20;
       int MAX_HOURS=100;
        int empHrs=0,totalWorkingHours=0;
        int totalWorkingDays=0;

        int FULLTIME=1;
        int HALFTIME=0;

        while(empHrs<MAX_HOURS && totalWorkingDays <MAX_DAYS){
          totalWorkingDays++;
           int check=(int)(Math.floor(Math.random()*10)%3);
            switch(check) {
            case FULLTIME:
                empHrs=8;
                break;
            case HALFTIME:
                 empHrs=4;
                break;
            default:
                empHrs=0;
                break;
        }
            totalWorkingHours+=empHrs;
        System.out.println("UC6->Total working Hours " + totalWorkingHours);

        }*/
    }
    }
















