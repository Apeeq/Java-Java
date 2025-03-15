import java.util.Scanner;

public class main {
    public static void main(String[] args) {



        //System.out.println(Integer.MAX_VALUE);

        System.out.println("Введите свой вес");
        double weight = new Scanner(System.in).nextDouble();
        System.out.println("Введите свой рост");
        double height = new Scanner(System.in).nextDouble();
        System.out.println("BMI =" +  weight / (height * height));

        //*
        System.out.println("****\t\t\tКалькуль умножения****");
        System.out.println("Введите число");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число");
        int b = new Scanner(System.in).nextInt();
        System.out.println(a + "*" + b + "=" + a * b);


        //+
        System.out.println("1 число");
        int a = new Scanner(System.in).nextInt();
        System.out.println("2 число");
        int b = new Scanner(System.in).nextInt();
        System.out.println(a + "+" + b + "=" + (a + b));


        //-
        System.out.println("1 number");
        int a = new Scanner(System.in).nextInt();
        System.out.println("2 number");
        int b = new Scanner(System.in).nextInt();
        System.out.println(a + "-" + b + "=" + (a-b));


        //'/'
        System.out.println("1 number");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("2 number");
        double b = new Scanner(System.in).nextDouble();
        System.out.println(a + "/" + b + "=" + (a/b));


        // rub/usd
        System.out.println("Введите сумму");
        double rub = new Scanner(System.in).nextDouble();System.out.println("Курс доллара");
        double dollar = new Scanner(System.in).nextDouble();
        System.out.println(rub * (1/dollar));


        // rub/eur
        System.out.println("Введите сумму");
        double rub = new Scanner(System.in).nextDouble();
        System.out.println("Курс евро");
        double eur = new Scanner(System.in).nextDouble();
        System.out.println(rub * (1/eur));








    }
}
