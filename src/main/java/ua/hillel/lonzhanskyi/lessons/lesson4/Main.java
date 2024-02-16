package ua.hillel.lonzhanskyi.lessons.lesson4;

public class Main {
    public static void main(String[] args) {

//        int a = 3;
//        int b = 10;

//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(b / a);
//
//        System.out.println();
//        System.out.println(10.0 / 3);
//        System.out.println(10 / 3.0);
//        System.out.println(10.0 / 3.0);
//        System.out.println(10D / 3);
//
//        System.out.println((double) b / a);
//        System.out.println(b / (double) a);
//        System.out.println((double) b / (double) a);


//        System.out.println(8 % 3); // 2 * 3 = 6.   8 - 6 = 2
//        System.out.println(9 % 4); // 2 * 4 = 8.   9 - 8 = 1
//
//        System.out.println(7 % 4); // 1 * 4 = 4.    7 - 4 = 3
//
//        System.out.println();
//        System.out.println();


//        System.out.println(10 % 1); // 10 8    / 10 * 1 = 10  10 - 10 = 0
//        System.out.println(10 % 2); // 0   5 * 2 = 10  10 - 10 = 0
//        System.out.println(10 % 3); // 1   3 * 3 = 9    10 - 9 = 1
//        System.out.println(10 % 4); // 2   2 * 4 = 8    10 - 8 = 2
//        System.out.println(10 % 5); // 0
//        System.out.println(10 % 6); // 4
//        System.out.println(10 % 7); // 3
//        System.out.println(10 % 8); // 2
//        System.out.println(10 % 9); // 1
//        System.out.println(10 % 10); // 0
//        System.out.println(10 % 11); // 10


//        System.out.println("qweqweqweq\t\t\t\tweqweqyuweuyqwe uyqwtuyeqw  euyqweuyqw euyqw \n\n\neuyqw euqwy euyqw euyqw eyuqw eyuqw eyuqw euqw euqw euqw ue");


//        System.out.println("qwetguqyw qweqweqweq qweqweqweqweqweqweqweg " +
//                "qwugeqwueqiwuge iqwu " +
//                "eqiwu euqw eiqwu eqw euqw euqw eqw eq " +
//                "weiqweiqw iqw eiqw e");
        
        
//        int x = 10;
//
//        int y = x + 5;
//
//        x = y;
//
//        System.out.println(x);


//        int x = 10;
//
//        x = x + 5;
//        System.out.println(x);


//        int x = 10;
//
//        x += 5;
//        x -= 5;
//        x *= 5;
//        x /= 5;
//        x %= 5;
//
//        System.out.println(x);



//        int x = 10;

//        x = x + 1;
//        x += 1;
//        x++;


//        System.out.println(x++); // постфiксний iнкремент - first give value, after increment
//        System.out.println(++x); // префiксний iнкремент - first increment value, after give value


//        int a = 5;
//        int b = 2;
//        int result = a++ + ++a - --b;
//
//        System.out.println("result = " + result);   // 11
//        System.out.println("a = " + a);             // 7
//        System.out.println("b = " + b);             // 1


//        int absValue = Math.abs(10);
//        System.out.println(absValue);
//        System.out.println(Math.abs(-10));


//        System.out.println(Math.pow(2.2, 4.3));

//        System.out.println(Math.sqrt(16.55));

//        System.out.println(Math.round(11.1));  // 11
//        System.out.println(Math.round(11.4));  // 11
//        System.out.println(Math.round(11.5));  // 12
//        System.out.println(Math.round(11.9));  // 12


//        System.out.println(Math.max(11, 5));
//        System.out.println(Math.min(11, 5));


//        System.out.println(Math.random()); // from 0.0 to 0.9999999999999999999999999999

//        System.out.println( (int) (Math.random() * 11)); // from 0 to 10;
//        System.out.println(Math.round(Math.random() * 10)); // from 0 to 10;


        // from 15 to 30
//        int randomValue = Math.random();


        // 0.0 * 16 = 0 + 15 = 15
        // 0.999 * 16 = 15 + 15 = 30
        System.out.println((int) (Math.random() * 16) + 15);

        int min = 25;
        int max = 50;

        int result = (int) (Math.random() * (max - min + 1) + min);

        System.out.println(result);



    }
}
