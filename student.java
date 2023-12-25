package StudentManagement;

import java.util.Scanner;

public class student {
    private String studentID;//unique student id
    private String FirstName;
    private String LastName;
    private int gradeYear;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600; //static means a variable true for all objects
    private static int id = 1000; //value is retained in the class when we create more students

    //constructor: prompt user to enter student's name and year
    public student(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.FirstName = input.nextLine();

        System.out.print("Enter student last name: ");
        this.LastName = input.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter class level: ");
        this.gradeYear = input.nextInt();

        setStudentID();//when we call function increment id by 1    
    }

    //generate an ID
    private void setStudentID(){
        //Grade level + ID

        id++;//the id increments each time we create a new student
        this.studentID = gradeYear + "" + id;//bc we have string there it will not add them just concate them
    }

    //enroll in courses
    public void enroll(){
        
        //get inside loop until user hits 'Q'
        do{
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a course to enroll (Q to quit) ");
            String course = input.nextLine();
            if(!course.equals("Q")){
                this.courses = courses + "\n " + course; //saving courses selected to courses variable
                tuitionBalance += costOfCourse;
            }else{
                break;//break out of loop
            }
        }while(1 != 0); //so forever
    }
 

    //view balance
    public void viewBalance(){
        System.out.println("Your balance is $" + tuitionBalance);
    } 

    //pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner input = new Scanner(System.in);
        int payment = input.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //show status
    public String toString(){
        return "Name: " + FirstName + " " + LastName +
        "\nStudent ID: " + studentID + 
        "\nCourses Enrolled: " + courses + 
        "\nBalance: $" + tuitionBalance;
    }
}
