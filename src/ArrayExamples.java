public class ArrayExamples {
    //22.07.2022.
    // For - each loop, Two-dimensional arrays - 25.07.2022.
    public static void main(String[] args) {

        //Declare Array that will hold 3 String type variables
        String[] names1 = new String[3];

        //How to set array's element values
        names1[0] = "Kārlis";
        names1[1] = "Jānis";
        names1[2] = "Pēteris";

        //How to get array's elements value
        //System.out.println(names[0]);

        int[] grades = new int[10];
        grades[0] = 10;
        grades[1] = 9;
        grades[2] = 1;
        grades[3] = 7;
        grades[4] = 5;
        grades[5] = 2;
        grades[6] = 9;
        grades[7] = 10;
        grades[8] = 6;
        grades[9] = 4;

        //How to get Array's size
        //System.out.println("Array's size: " + grades.length);

        //Print out all elements
        for(int i = 0; i < grades.length; i++){
            //System.out.print(grades[i] + " ");
        }

        //25.07.2022
        //For each loop (only for iterating variable with multiple values)
        //Printing out all array's elements using For-each loop
        System.out.print("Source Array: ");
        for(int temp : grades){
            System.out.print(temp + " ");
        }

        // Two dimensional array
        int[][] age = new int[][]{{2,5,8,12,1},{25,28,35,35,20}}; //[][] - two dimensions, {} - show whole array
        //Print second column values
        System.out.println("Child - " + age[0][1]);
        System.out.println("Parent - " + age[1][1]);

        // Example 2
        String[][] names = new String[2][5]; // 2 rows and 5 columns

        //1'st row
        names[0][0] = "Alice";
        names[0][1] = "Bob";
        names[0][2] = "John";
        names[0][3] = "Lucas";
        names[0][4] = "Joshua";

        //2'nd row
        names[1][0] = "Tyron";
        names[1][1] = "Daren";
        names[1][2] = "Israel";
        names[1][3] = "Cyril";
        names[1][4] = "Lewis";

        //Number of rows in 2d Array
        System.out.println(names.length);

        //Number of columns in specific row
        System.out.println(names[0].length);

        // i - rows
        // j = columns

        for (int i = 0; i < names.length; i++){
            System.out.println("Row no. " + (i+1));
            for (int j = 0; j < names[i].length; j++){
                System.out.println(names[i][j]);
            }
            System.out.println();
        }

        for (String [] tempNames : names){
            System.out.print("Row - ");
            for (String name : tempNames) {
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }
}
