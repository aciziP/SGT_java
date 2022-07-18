public class Operators {
    //11.07.2022.
    public static void main(String[] args) {

        //Math operators + - / * %

        int x = 100;
        x += 100;
        System.out.println(x);


        int a;
        int b;
        a = 17%13;
        System.out.println(a);


        //INCREMENTATION OPERATORS
        //Post-incrementation
        int num = 10;
        System.out.println("num = " + num++);
        System.out.println(num);

        //Pre-incrementation
        int num2 = 20;
        System.out.println(++num2);

        //RELATION operators
        //Equality ==
        int z = 1;
        int c = 2;
        System.out.println("Equality = " + (z==c)); //is z equal to c?


        //Inequality !=
        System.out.println("Inequality - " + (z != c)); // is z not equal to b?

        //Greater than > and greater than or equal to >=
        System.out.println(z > c); //if z is greater than c
        System.out.println(z >= c); // if z is greater or equal to c

        //Less than < and less than or equal to <=
        System.out.println(z < c);

        //Logical operators
        //Logical AND - &&

        boolean wind = false;
        boolean weather = true;
        System.out.println(wind && weather);

        //Logical OR - ||
        boolean sale = false;
        boolean rich = true;
        System.out.println(sale || rich);


    }
}
