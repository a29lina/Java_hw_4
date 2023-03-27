package hw_java4;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        System.out.println("Если хотите использовать сложение, введите 1");
        System.out.println("Если хотите использовать вычитание, введите 2");
        System.out.println("Если хотите использовать умножение, введите 3");
        System.out.println("Если хотите использовать деление, введите 4");
        System.out.println("Если хотите извлечь квадратный корень, введите 5");
        System.out.println("Если хотите возвести в степень, введите 6");

        try (Scanner iScanner = new Scanner(System.in)) {
            char x = iScanner.next().charAt(0);

            if(x == '1') {
                try{
                System.out.printf("Введите первое число: ");
                double a = iScanner.nextDouble();
                System.out.printf("Введите второе число: ");
                double b = iScanner.nextDouble();
                double res = addition(a, b);
                System.out.println(res); 
                } catch (Exception e) {
                    System.out.println("Некорректный ввод");
                }
            }
            
            if(x == '2') {
                try {
                    System.out.printf("Введите первое число: ");
                    double a = iScanner.nextDouble();
                    System.out.printf("Введите второе число: ");
                    double b = iScanner.nextDouble();
                    double res = substraction(a, b);
                    System.out.println(res);
                }   catch (Exception e) {
                    System.out.println("Некорректный ввод");
                }
            }

            if(x == '3') {
                try {
                    System.out.printf("Введите первое число: ");
                    double a = iScanner.nextDouble();
                    System.out.printf("Введите второе число: ");
                    double b = iScanner.nextDouble();
                    double res = multiplication(a, b);
                    System.out.println(res);
                } catch (Exception e) {
                    System.out.println("Некорректный ввод");
                }
            }

            if(x == '4') {
                try {
                    System.out.printf("Введите первое число: ");
                    double a = iScanner.nextDouble();
                    System.out.printf("Введите второе число: ");
                    double b = iScanner.nextDouble();
                    double res = divison(a, b);
                    System.out.println(res);  
                } catch (Exception e) {
                    System.out.println("Некорректный ввод");
                }
            }

            if(x == '5') {
                try {
                System.out.printf("Введите число: ");
                double a = iScanner.nextDouble();
                double res = Math.sqrt(a);
                System.out.println(res);
                } catch (Exception e) {
                    System.out.println("Некорректный ввод");
                }
            }

            if(x == '6') {
                try{
                    System.out.printf("Введите число: ");
                    double a = iScanner.nextDouble();
                    System.out.printf("Введите, в какую степень возвести: ");
                    double b = iScanner.nextDouble();
                    double res = Math.pow(a, b);
                    System.out.println(res);
                } catch (Exception e) {
                    System.out.println("Некорректный ввод");
                }
            }
        }
    }


    static double divison(double a, double b) {
        return a / b;
    }

    static double multiplication(double a, double b) {
        return a * b;
    }

    static double addition(double a, double b) {
        return a + b;
    }

    static double substraction(double a , double b){
        return a - b;
    }
    
}
