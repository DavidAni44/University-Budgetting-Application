package com.company;

public class Main {
    public static java.util.Scanner in = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        Budgeting();
    }

    public static void Budgeting() {
        System.out.println("Hey user how much do you earn monthly");
        int salary = in.nextInt();

        int length = String.valueOf(salary).length();
        if (length < 4) {
            System.out.println("This is for users who make 4 or more figures");
            Budgeting();
        }

        System.out.println("And how much is your rent");
        float rent = in.nextInt();
        float newSalary = salary - rent;
        System.out.println("Your salary after your rent is £" +newSalary);
        System.out.println("We will now break down your finances to benefit you as much as possible");
        System.out.println("What percentage of your salary would you like to save?");
        float PSavings = in.nextInt();
        float DSavings = PSavings / 100;

        float monthlySavings = (float) (newSalary * DSavings);
        double MSroundOff = Math.round(monthlySavings * 100.0) / 100.0;

        System.out.println("How much do you spend monthly on bills");
        float Utilitybills = in.nextInt();

        float remainingSalary = newSalary - monthlySavings - Utilitybills;

        System.out.println("Your monthly savings are £" +MSroundOff);
        System.out.println("Your monthly billings are £" +Utilitybills);
        System.out.println("Your remaining salary after all bills and savings is £" +remainingSalary);
        double yearlySavings = ((float) 12 * (newSalary * MSroundOff));

        System.out.println("After following our programme for 12 months you will save up to £" +yearlySavings);
    }


}
