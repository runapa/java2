package lesson2;

public class ClassWork {

    public static void main(String[] args) {
        int m = 5;
        int n = 9;
        int target = 7;

        int res1 = target - m;
        int res2 = target -n;
        boolean result = Math.abs(res1) < Math.abs(res2);

        int str = result ? n : m;

        System.out.println(str);

        //checkNumber(5.25, 7.25);
        //checkNumber(15.1, 15);

        growNumbers(50, 200, 150);
        lessNumbers(50, 200, 150);
        checkInterval(150, 49, 150);
        checkB(6);

        findRoots(2, 3, 1);
        findRoots(16, 5, 1);
    }

    public static void findRoots(double a, double b, double c){
        if(a != 0){
            double d = b * b - 4 * a * c;
            if(d < 0){
                System.out.println("Discriminant = " + d + ". Quadratic equations has no real roots");
            }else{
                double x1 = (-b - Math.sqrt(d)) / (2 * a);
                double x2 = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println("Discriminant = " + d + " and > 0. Quadratic equations has two real roots:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
            if(d == 0){
                double x = -b / (2 * a);
                System.out.println("x = " + x);
            }
        }else{
            System.out.println("The a can't be equal to zero");
        }
    }

    public static void checkB(int b){
        if(b == 6 || b == 5 || b == 8 || b == 9){
            System.out.println("FALSE");
        }else{
            System.out.println("TRUE");
        }
    }

    public static void checkInterval(int x, int a, int b){
        if(x >= a && x < b){
            System.out.println("This number is in interval:" + x);
        }else{
            System.out.println("This number not in interval:" + x);
        }
    }

    public static void lessNumbers(double number1, double number2, double number3){
        double x = 0.0, y = 0.0, z = 0.0;

        if(number1 > number2 && number1 > number3){
            x = number1;
            if(number2 > number3){
                y = number2;
                z = number3;
            }else{
                y = number3;
                z = number2;
            }

        }
        if(number2 > number1 && number2 > number3){
            x = number2;
            if(number1 > number3){
                y = number1;
                z = number3;
            }else{
                y = number3;
                z = number1;
            }
        }
        if(number3 > number1 && number3 > number2){
            x = number3;
            if(number1 > number2){
                y = number1;
                z = number2;
            }else{
                y = number2;
                z = number1;
            }
        }
        System.out.println(x + " " + y + " " + z);
    }

    public static void growNumbers(double number1, double number2, double number3){
        double x = 0.0, y = 0.0, z = 0.0;

        if(number1 < number2 && number1 < number3){
            x = number1;
            if(number2 < number3){
                y = number2;
                z = number3;
            }else{
                y = number3;
                z = number2;
            }

        }
        if(number2 < number1 && number2 < number3){
            x = number2;
            if(number1 < number3){
                y = number1;
                z = number3;
            }else{
                y = number3;
                z = number1;
            }
        }
        if(number3 < number1 && number3 < number2){
            x = number3;
            if(number1 < number2){
                y = number1;
                z = number2;
            }else{
                y = number2;
                z = number1;
            }
        }
        System.out.println(x + " " + y + " " + z);
    }

    public static void checkNumber(double digit1, double digit2){
        if(digit1 > digit2){
            System.out.println("First number is bigger");
        }else{
            if (digit1 != digit2){
                System.out.println("Second number is bigger");
            }else{
                System.out.println("The numbers are equal");
            }
        }
    }
}
