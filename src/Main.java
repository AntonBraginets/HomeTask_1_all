import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Task_1_1();
        Task_1_2();
        Task_1_3();
        Task_1_4_1();
        Task_1_4_2();
        Task_1_4_3();
        Task_1_4_4();
        Task_1_4_5();
    }

    private static void Task_1_1() {
        System.out.println("Задание 1.1");
        System.out.println("Пример решения квадратного уравнения со следующими значениями коэффициентов a, b и c:\n");
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите значение коэффициента a: ");
        double a = Scanner.nextDouble();
        System.out.print("Введите значение коэффициента b: ");
        double b = Scanner.nextDouble();
        System.out.print("Введите значение коэффициента c: ");
        double c = Scanner.nextDouble();
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D < 0) {
            System.out.println("\nПоскольку дискриминант меньше нуля, действительных корней нет");
        } else {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("\nЗначение корня x1 равно: " + x1);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Значение корня x2 равно: " + x2);
        }
    }

    private static void Task_1_2() {
        // write your code here
        System.out.println();
        System.out.println("Задание 1.2");
        System.out.println("Вычисление периметра и площади прямоугольника со сторонами A и B:\n");
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Длина стороны A: ");
        double var_a = Scanner.nextDouble();
        System.out.print("Длина стороны B: ");
        double var_b = Scanner.nextDouble();
        double Perim = var_a * 2 + var_b * 2;
        double S = var_a * var_b;
        System.out.println("\nПериметр заданного прямоугольника равен:\t" + Perim + "\n");
        System.out.println("Площадь заданного прямоугольника равна:\t\t" + S);
    }

    private static void Task_1_3() {
        System.out.println();
        System.out.println("Задание 1.3");
        System.out.println("Нахождение длины стороны квадрата по периметру:\n");
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите площадь квадрата: ");
        double S = Scanner.nextDouble();
        double stor = Math.sqrt(S);
        System.out.println("\nДлина стороны заданного квадрата составляет: " + stor);
    }

    private static void Task_1_4_1() {
        System.out.println();
        System.out.println("Задание 1.4.1");
        System.out.println("Программа для формулы 1, пункт 4:\n");
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите значение параметра a: ");
        double a = Scanner.nextDouble();
        System.out.print("Введите значение параметра b: ");
        double b = Scanner.nextDouble();
        System.out.print("Введите значение параметра c: ");
        double c = Scanner.nextDouble();
        double ans = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("\nОтвет: " + ans);
    }

    private static void Task_1_4_2() {
        System.out.println();
        System.out.println("Задание 1.4.2");
        System.out.println("Программа для формулы 2, пункт 4:\n");
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите значение параметра a: ");
        double a = Scanner.nextDouble();
        System.out.print("Введите значение параметра b: ");
        double b = Scanner.nextDouble();
        System.out.print("Введите значение параметра c: ");
        double c = Scanner.nextDouble();
        System.out.print("Введите значение параметра d: ");
        double d = Scanner.nextDouble();
        double ans = (a / c) * (b / d) - (a * b - c) / (c * d);
        System.out.println("\nОтвет: " + ans);
    }

    private static void Task_1_4_3() {
        System.out.println();
        System.out.println("Задание 1.4.3");
        System.out.println("Программа для формулы 3, пункт 4: \n");
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите значение параметра x: ");
        double x = Scanner.nextDouble();
        double ans = x - Math.pow(x, 3) / 3 + Math.pow(x, 5) / 5;
        System.out.println("\nОтвет: " + ans);
    }

    private static void Task_1_4_4() {
        System.out.println();
        System.out.println("Задание 1.4.4");
        System.out.println("Программа для формулы 4, пункт 4: \n");
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите значение параметра x: ");
        double x = Scanner.nextDouble();
        System.out.print("Введите значение параметра y: ");
        double y = Scanner.nextDouble();
        double ans = (x + y) / (y + 1) - (x * y - 12) / (34 + x);
        System.out.println("\nОтвет: " + ans);
    }

    private static void Task_1_4_5() {
        System.out.println();
        System.out.println("Задание 1.4.5");
        System.out.println("Программа для  формулы 5, пункт 4:\n");
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите значение параметра x: ");
        double x = Scanner.nextDouble();
        double answr = Math.sin(Math.sqrt(x + 1)) - Math.sin(Math.sqrt(x - 1));
        System.out.println("\nОтвет: " + answr);
    }
}
