public class Student
{
    String name;
    int std;
    char div;
    int age;
    double mark;
    
    Student(String name,int std,char div,int age,double mark){
        this.name=name;
        this.std=std;
        this.div=div;
        this.age=age;
        this.mark=mark;
    }
    public String getName()
    {
        return name;
    }
    public int getStd()
    {
        return std;
    }
    public char getDiv()
    {
        return div;
    }
    public static void main(String[] args){
        Student stud=new Student("Anjana",7,'A',13,9.5);
        System.out.println("Name is "+stud.getName()+"\nClass is "+stud.getStd()+"\nDivision is "+stud.getDiv()
        +"\nAge is "+stud.age+"\nMark is "+stud.mark);

	}
}
