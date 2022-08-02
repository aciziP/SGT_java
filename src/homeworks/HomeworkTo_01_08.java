package homeworks;

import java.util.Scanner;

public class HomeworkTo_01_08 {
    //Homework to 01.08.2022. - Christmas tree;
    public static void main(String[] args) {
        /*Christmas tree:
        Write an application, that will draw Christmas tree according to examples below. The
        height of the tree should be read from user (positive integer). Use scanner to ask
        user for tree size.

        Your code should print a tree for any proper height given. Your application should
        generate the tree using single characters - it must not return tree copy-pasted by
        you!*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required size of the Christmas tree:");
        int treeSize = scanner.nextInt();

        for (int i = 0; i <= treeSize; i++) {
            if (i==treeSize){
                for (int j = 0; j < treeSize; j++)
                    System.out.print(" ");
                System.out.print("#");
            } else {
                for (int j = 0; j < treeSize - i; j++)
                    System.out.print(" ");
                for (int k = 0; k < (2 * i + 1); k++)
                    System.out.print("*");
                System.out.println();
            }

        }

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter tree size");
        int size  = scanner.nextInt();

        //Each level
        for(int i = 0; i < size; i++){
            //Spaces
            for(int j = 0; j < size - 1 - i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int j = 0; j < i * 2 + 1; j++){
                System.out.print("*");
            }
            //Move to next line
            System.out.println();
        }

        //Base level
        for(int i = 0; i < size - 1; i++){
            System.out.print(" ");
        }

        System.out.println("#");
        */

    }
}
