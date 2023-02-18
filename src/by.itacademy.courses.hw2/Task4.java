package by.itacademy.courses.hw2;

public class Task4 {

    public static void main(String[] args) {
        byte a = 100;
        short b = a;
        int c = a;
        long d = a;
        float e = a;
        double i = a;
        char sb = (char) a;

        short a1 = 1;
        int b1 = a1;
        long c1 = a1;
        float d1 = a1;
        double e1 = a1;
        byte sb1 = (byte) a1;
        char sc1 = (char) a1;

        char a2 = 'd';
        int b2 = a2;
        long c2 = a2;
        float d2 = a2;
        double e2 = a2;
        byte sb2 = (byte) a2;
        short sc2 = (short) a2;

        int a3 = 55;
        long b3 = a3;
        float c3 = a3;
        double d3 = a3;
        byte sb3 = (byte) a3;
        short sc3 = (short) a3;
        char sd3 = (char) a3;

        long a4 = 123456789L;
        float b4 = a4;
        double c4 = a4;
        byte sb4 = (byte) a4;
        short sc4 = (short) a4;
        char sd4 = (char) a4;
        int si4 = (int) a4;

        float a5 = 123.5F;
        double b5 = a5;
        byte sb5 = (byte) a5;
        short sc5 = (short) a5;
        char sd5 = (char) a5;
        int si5 = (int) a5;
        long sq5 = (long) a5;

        double a6 = 0.123D;
        byte sb6 = (byte) a6;
        short sc6 = (short) a6;
        char sd6 = (char) a6;
        int si6 = (int) a6;
        long sq6 = (long) a6;
        float sw6 = (float) a6;

        transbyte(sb, i, e, d, c, b, a);
        transshort(sb1, sc1, e1, d1, c1, b1, a1);
        transchar(sb2, sc2, e2, d2, c2, b2, a2);
        transint(sb3, sc3, sd3, d3, c3, b3, a3);
        translong(si4, sd4, sc4, sb4, c4, b4, a4);
        transfloat(sq5, si5, sd5, sc5, sb5, b5, a5);
        transfdouble(sw6, sq6, si6, sd6, sc6, sb6, a6);
    }

    public static void transbyte(char sb, double i, float e, long d, int c, short b, byte a) {
        b = (byte) a;
        c = (byte) a;
        d = (byte) a;
        e = (byte) a;
        i = (byte) a;
        sb = (char) a;
        System.out.printf("\n Trans Byte: \nshort %d\nint %d\nlong %d\nfloat %f\ndouble %f\nchar %c", b, c, d, e, i, sb);
    }

    public static void transshort(byte sb1, char sc1, double e1, float d1, long c1, int b1, short a1) {
        b1 = (short) a1;
        c1 = (short) a1;
        d1 = (short) a1;
        e1 = (short) a1;
        sb1 = (byte) a1;
        sc1 = (char) a1;
        System.out.printf("\n\n Trans short: \nint %d\nlong %d\nfloat %f\ndouble %f\nchar %c\nbyte %o", b1, c1, d1, e1, sc1, sb1);
    }

    public static void transchar(byte sb2, short sc2, double e2, float d2, long c2, int b2, char a2) {
        b2 = (char) a2;
        c2 = (char) a2;
        d2 = (char) a2;
        e2 = (char) a2;
        sb2 = (byte) a2;
        sc2 = (short) a2;
        System.out.printf("\n\n Trans char: \nint %d\nlong %d\nfloat %f\ndouble %f\nbyte %o\nshort %d", b2, c2, d2, e2, sb2, sc2);
    }

    public static void transint(byte sb3, short sc3, char sd3, double d3, float c3, long b3, int a3) {
        b3 = (int) a3;
        c3 = (int) a3;
        d3 = (int) a3;
        sb3 = (byte) a3;
        sc3 = (short) a3;
        sd3 = (char) a3;
        System.out.printf("\n\n Trans int: \nlong %d\nfloat %f\ndouble %f\nbyte %o\nshort %s\nchar %c", b3, c3, d3, sb3, sc3, sd3);
    }

    public static void translong(int si4, char sd4, short sc4, byte sb4, double c4, float b4, long a4) {
        b4 = (long) a4;
        c4 = (long) a4;
        sb4 = (byte) a4;
        sc4 = (short) a4;
        sd4 = (char) a4;
        si4 = (int) a4;
        System.out.printf("\n\n Trans long: \nfloat %f\ndouble %f\nbyte %o\nshort %d\nchar %c\nint %d", b4, c4, sb4, sc4, sd4, si4);
    }

    public static void transfloat(long sq5, int si5, char sd5, short sc5, byte sb5, double b5, float a5) {
        b5 = (float) a5;
        sb5 = (byte) a5;
        sc5 = (short) a5;
        sd5 = (char) a5;
        si5 = (int) a5;
        sb5 = (byte) a5;
        sq5 = (long) a5;
        System.out.printf("\n\n Trans float: \ndouble %f\nbyte %o\nshort %d\nchar %c\nint %d\nlong %d", b5, sb5, sc5, sd5, si5, sq5);
    }

    public static void transfdouble(float sw6, long sq6, int si6, char sd6, short sc6, byte sb6, double a6) {

        sb6 = (byte) a6;
        sc6 = (short) a6;
        sd6 = (char) a6;
        si6 = (int) a6;
        sb6 = (byte) a6;
        sq6 = (long) a6;
        sw6 = (float) a6;
        System.out.printf("\n\n Trans double: \nbyte %o\nshort %d\nchar %c\nint %d\nlong %d\nfloat %f", sb6, sc6, sd6, si6, sq6, sw6);
    }
}