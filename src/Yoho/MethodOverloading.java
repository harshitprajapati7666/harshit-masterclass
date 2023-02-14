package Yoho;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
    }

    public byte addNums(byte a, byte b) {
        return (byte) (a + b);
    }

    public short addNums(short a, short b) {
        return (short) (a + b);
    }

    public int addNums(int a, int b) {
        return a + b;
    }

    public long addNums(long a, long b) {
        return a + b;
    }

    public float addNums(float a, float b) {
        return a + b;
    }

    public double addNums(double a, double b) {
        return a + b;
    }
}
