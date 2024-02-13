package ua.hillel.lonzhanskyi.lessons.lesson2;

public class Main {

    public static void main(String[] args) {

        byte age;
        age = 55;
        System.out.println(age);

        byte age2 = 25;
        System.out.println(age2);
        age2 = 127;
        System.out.println(age2);

        short shortVariable = 32700;
        System.out.println(shortVariable);

        int intVariable = 214700000;
        System.out.println(intVariable);

        long longVariable = 2147000000000000L;
        System.out.println(longVariable);


        float floatVariable = 1.123456789012345F;
        double doubleVariable = 1.12345678901234567;

        System.out.println(floatVariable);
        System.out.println(doubleVariable);


        char charA = 'A';
        char charA2 = 65;
        char charA3 = '\u00B0';

        System.out.println(charA);
        System.out.println(charA2);
        System.out.println(charA3);


        boolean isOK = true;
        System.out.println(isOK);


        String str = "Hello!";
        System.out.println(str);


        System.out.println(str + "   " + longVariable + " sersdfsdfsdfsd sdf sdf sd ");

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(age + (age2 + str));
        System.out.println(str + age + age2);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



        byte demoByte = 125;

        short demoShort = demoByte;
        int demoInt = 214700;

        System.out.println(demoShort);
        System.out.println(demoInt);

        double demoDouble = demoInt;
        System.out.println(demoDouble);

        char demoA = 'A';
        int demoCharToInt = demoA;

        System.out.println(demoCharToInt);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



        byte byteVariable = (byte) -130;

        System.out.println(byteVariable);

        System.out.println(5);
        System.out.println(5D);
        System.out.println((double) 5);


        double doubleDemo = 11.123;
        byteVariable = (byte) doubleDemo;

        System.out.println(byteVariable);
        System.out.println("DMS Lat 51° 30' 37.2852'' N DMS Long 0° 7' 0.3828'' W");


    }

}
