public class Datatype {
    public static void main(String[] args){
        //there are 8 data type in java 
        /*datatype       size
         * byte          1 byte
         * short         2 byte
         * int           4 byte
         * long          8 byte
         * float         4 byte
         * double        8 byte
         * boolean       1 bit
         * char          2 byte
         * 
         * The byte data type can store whole numbers from -128 to 127.
         * The short data type can store whole numbers from -32768 to 32767:
         * The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':
         */
        byte myNum = 100;
        System.out.println(myNum);

        short Num = 5000;
        System.out.println(Num);

        long Nm = 15000000000L;
        System.out.println(Nm);

        double dig = 19.99d;
        System.out.println(dig);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);

        char myGrade = 'B';
        System.out.println(myGrade);
    }
}
