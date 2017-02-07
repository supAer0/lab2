public class calc {
    public static void main(String[] args){
        System.out.println(func_add(10.8,5));
	System.out.println(func_sub(10.8,5));
	System.out.println(func_mul(10.8,5));
    }

    private static double func_add(double a, double b){
        return a+b;
    }

    private static double func_sub(double a, double b){
        return a-b;
    }
    private static double func_mul(double a, double b){
        return 2*a;
    }

}
