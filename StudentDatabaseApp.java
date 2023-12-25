
//main class
package StudentManagement;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args){

        
        //ask how many new users they want to add
        System.out.println("How many new students do you want to add? ");
        Scanner input = new Scanner(System.in);
        int numOfstudents = input.nextInt();
        student[] Students = new student[numOfstudents]; //array of object type student

        //create n number of new student
        for(int i = 0; i < numOfstudents; i++){
            Students[i] = new student();
            Students[i].enroll();
            Students[i].payTuition();
            System.out.println(Students[i].toString());
        }
         
    }
}
