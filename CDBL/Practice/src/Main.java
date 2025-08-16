public class Main {
    public static void main(String[] args) {
    double z = add(6.0, 7.0);
    System.out.println(z);
    }

    static int add(int a, int b) {
        System.out.println("This is overload 1");
        return a + b;
    }
    static int add(int a,int b,int c) {
        System.out.println("This is overload 2");
        return a + b + c;
    }
    static int add(int a,int b,int c, int d) {
        System.out.println("This is overload 3");
        return a + b + c + d;
    }

    static double add(double a, double b) {
        System.out.println("This is overload 4");
        return a + b;
    }
    static double add(double a,double b,double c) {
        System.out.println("This is overload 5");
        return a + b + c;
    }
    static double add(double a,double b,double c, double d) {
        System.out.println("This is overload 6");
        return a + b + c + d;
    }

}



