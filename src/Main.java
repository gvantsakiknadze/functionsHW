import gvantsaclass.Person;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Main {
    public static double funcA(double a, double b) {
        return (Math.pow(a, 3) * b - a * Math.pow(b, 3)) / (a * b * (a - b));
    }

    public static double funcB(double x, double y) {
        return (x / y - y / x) * (x * y / (x + y));
    }

    public static double funcC(double x, double y) {
        return (x / (y * y) - 1 / x) / ((x - y) / (x * y * y));
    }

    public static double funcD(double x) {
        return ((x * x - 1) / (x * x + x + 1)) / ((x + 1) / (Math.pow(x, 3) - 1));
    }

    public static double funcE(double x, double y) {
        return Math.pow((Math.pow(x, 3) - Math.pow(y, 3)) / (x * x + x * y + y * y) - (y - x), 2);
    }

    public static double funcF(double a, double b) {
        return (Math.pow(a, 4) * b + a * Math.pow(b, 4)) / (Math.pow(a + b, 2) - 3 * a * b) * a * b / (a + b);
    }

    public static double funcG(double x, double y) {
        return (5 * Math.pow(x, 3) * y + 5 * x * Math.pow(y, 3)) / (Math.pow(x, 4) - Math.pow(y, 4)) * (1 / (x * x - y * y));
    }

    public static double funcH(double x) {
        return (2 - 2 * x / (x + 2)) * (Math.pow(x, 3) + 2 * Math.pow(x, 2));
    }

    public static double funcI(double a) {
        return (((a - 1) / (3 * a + Math.pow((a - 1), 2))) - (1 - 3 * a + Math.pow(a, 2)) / (Math.pow(a, 3) - 1) - (1 / (a - 1))) / ((Math.pow(a, 2) + 1) / (1 - a));
    }

    public static double funcJ(double a, double b) {
        return ((Math.pow(a, 2) - a * b) / (Math.pow(a, 2) * b + Math.pow(b, 3)) - (2 * Math.pow(a, 2)) / (Math.pow(b, 3) - a * Math.pow(b, 2) + Math.pow(a, 2) * b - Math.pow(a, 3))) * (1 - (b - 1) / a - b / Math.pow(a, 2));
    }

    public static double funcK(double x, double y) {
        return (1 / Math.pow(x, 2) + 1 / Math.pow(y, 2) + 2 / (x + y) * (1 / x + 1 / y)) / ((Math.pow(x, 3) + Math.pow(y, 3)) / (Math.pow(x, 2) * Math.pow(y, 2)));
    }

    public static double funcL(double a, double b) {
        return (1 / (2 * a - b) + 3 * b / (Math.pow(b, 2) - 4 * Math.pow(a, 2)) - 2 / (2 * a + b)) / ((4 * Math.pow(a, 2) + Math.pow(b, 2)) / (4 * Math.pow(a, 2) - Math.pow(b, 2)) + 1);
    }

    public static double funcM(double a, double b) {
        return (Math.pow(a, 2) / (Math.pow(a, 2) - Math.pow(b, 2)) - Math.pow(a, 2) * b / (Math.pow(a, 2) + Math.pow(b, 2)) * (a / (a * b + Math.pow(b, 2)) + b / (Math.pow(a, 2) + a * b))) / (b / (a - b));
    }

    public static double funcN(double p, double q) {
        return ((Math.pow(p, 2) - Math.pow(q, 2)) / (p * q) - 1 / (p + q) * (Math.pow(p, 2) / q - Math.pow(q, 2) / p)) / ((p - q) / p);
    }

    public static void main(String[] args) {
        System.out.println(funcN(2, 4));


    }
}



