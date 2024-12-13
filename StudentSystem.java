import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    
    // Creating a ArrayList
    ArrayList<Student> students=new ArrayList<>();
    public static void main(String[] args) 
    {
        //Object of Class StudentSystem 
        StudentSystem obj=new StudentSystem();
        //Scanner Object 
        Scanner sc=new Scanner (System.in);
        int condition;
        // do-While Loop
        do
        {

            System.out.println("----------PLEASE ENTER CHOICE  FROM FOLLOWING------------- ");
            System.out.println("1/ADD STUDENT ");
            System.out.println("2/REMOVE STUDENT ");
            System.out.println("3/SEE ALL STUDENT ");
            System.out.println("4/EXIT");
            condition =sc.nextInt();
            switch (condition)
            {
                case 1: obj.addstudent();
                    
                    break;
                case 2:obj.removeStudent();
                break;
                case 3: obj.DisplayAll();
                break;
                case 4: return;
                
            }

        }while(condition!=4);
    }
    
    
    // Method for adding Student In ArrayList

    public void  addstudent()
    {
        //Getting inputs (Student Information) from user 
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME OF STUDENT : ");
        String name=sc.nextLine();
        System.out.println("ENTER ROLL NUMBER OF STUDENT :");
        int roll=sc.nextInt();
        Student info=new Student(name, roll);
        students.add(info);
        System.out.println("STUDENT ADDED SUCCESSFULLY  ");
       
    }

    
    // Method For removing Student from ArrayList
    public void removeStudent()
    {
        //Getting rollNumber as input to check the the students occurence 
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ROLL NUMBER OF THE STUDENT TO BE REMOVED: ");
        int rollNumber = sc.nextInt();
    
        for (int i = 0; i < students.size(); i++) 
        {
            if (students.get(i).getroll() == rollNumber) 
            {
                students.remove(i);
                System.out.println("STUDENT REMOVED SUCCESSFULLY");
                
                break; // Exit loop once student is removed
            }
        
        }
        System.out.println("STUDENT WITH THAT ROLL NUMBER DOES NOT EXISTS !!!!");
        
    }

    //Method to display All Students presennt in the List 
       
    public void DisplayAll()
    {
        System.out.println("-------------ALL STUDENTS  ------------------");
        if(students.size()>0)
        {
         for (Student student : students)
         {
            System.out.println("NAME : "+ " "+student.getname() +"   "+ "ROLLNO  : " + " "+student.getroll());
         }
        }else
        {
            System.out.println("NO STUDENT ADDED !");
        }
    }

    
}

// Student Class Used in ArrayList to store Student Informaton 
class Student
{
    private String name;
    private int roll;
   
    
Student(String name,int roll)
{
   this.name=name;
   this.roll=roll;

}
    public String getname()
    {
        return name;
    }
    public int getroll()
    {
        return roll;
    }



  

}