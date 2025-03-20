/******************************************************************************
Student class contains details like name,rollno,marks.To CRUD operations using a dowhile() and to 
override toString() and equals() method
*******************************************************************************/
import java.util.*;
class Student{
    String name;
    int rollNo;
    float marks;
    
    Student(String name,int rollNo,float marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }
    
    public String toString(){
        return "Student name : "+name+"\nRoll Number : "+rollNo+"\nMarks obtained : "+marks;
    }

    public boolean equals(Object obj){
        if(this==obj){return true;}
        if(obj==null || this.getClass()!=obj.getClass()){return false;}
        Student s=(Student)obj;
        return this.rollNo==s.rollNo;
    }
}
public class StudentRecord
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	    int choice,count=0;
	    Student[] student=new Student[3];
	    do{
	        System.out.println("1.Add the student Details\n2.Delete the student details\n3.Fetch the Student details\n4.Exit\nENTER THE REQUIRED OPERATION");
	        choice=sc.nextInt();
	        switch(choice){
	            case 1:
	                if(count>=3){
	                    System.out.println("Overflow Occured!! Cannot add more than 3 Student details\n");
	                }
	                else{
	                    sc.nextLine();
	                    System.out.println("Enter the Student name");
	                    String name=sc.nextLine();
	                    System.out.println("Enter the roll name");
	                    int rollNo =sc.nextInt();
	                    boolean rollNoExists=false;
	                    for(int i=0;i<count;i++){
                            if(student[i].rollNo==rollNo){
                                rollNoExists=true;
                                System.out.println("Student with this "+ rollNo+" already exists\n");
                                break;
                            }
                        }
                        if(!rollNoExists){
                            System.out.println("Enter the marks obtained");
                            float marks=sc.nextFloat();
                            Student obj=new Student(name,rollNo,marks);
                            student[count]=obj;
                            count++;
                            //System.out.println(obj.toString());
                            System.out.println("Student record added sucessfully\n");
                        }
	                }
	                break;
	           case 2 :
	               if(count==0){
	                   System.out.println("No Records found!!  Please Add student details\n");
	               }
	               else{
	                   System.out.println("Enter the Roll Number to be deleted");
	                   int rollNumber=sc.nextInt();
	                   boolean flag=false;
	                   for(int i=0;i<count;i++){
	                       if(student[i].rollNo==rollNumber){
	                           for(int j=i;j<count-1;j++){
	                               student[j]=student[j+1];
	                           }
	                           student[count-1]=null;
	                           count--;
	                           flag=true;
	                           System.out.println("\nStudent record deleted sucessfully\n");
	                           break;
	                       }
	                   }
	                   if(!flag){
	                       System.out.println("Student with roll Number "+rollNumber+" not found\n");
	                   }
	               }
	               break;
	           case 3:
	               if(count==0){
	                   System.out.println("No Records found!!  Please Add student details\n");
	               }
	               else{
	                   for(int i=0;i<count;i++){
	                       System.out.println("\nDetails of student "+(i+1)+" \n"+student[i].toString()+"\n");
	                   }
	               }    
	               break;
	           case 4:
	               System.out.println("You are Exiting,THANK YOU\n");
	               break;
	           default:
	               System.out.println("Invalid choice,Please enter the right option");
	       }
	   }while(choice!=4);
	}
}