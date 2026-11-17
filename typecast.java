class TypeCast {
    public static void main(String[] args) {
        
        byte b = 12;
        int a = b;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        int a1 = 1291;
        byte b1 = (byte) a1;
        System.out.println("a1 = "+ a1);
        System.out.println("b1 = "+ b1);

        byte a11 = 41;
        byte a12 = 51;
        int c = a11 * a12/100;
        System.out.println("a1 = "+ c);

        byte x = 5;
        byte y = 4;
        int z = x * y;
        System.out.println("z = "+ z);

    }
}