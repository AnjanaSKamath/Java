/*Program to demonstrate equals() and hashCode() methods to compare 2 objects*/
import java.util.*;
class Bird{
    String name;
    int id;
    String nickName;

    Bird(String name,int id,String nickName)
    {
        this.name=name;
        this.id=id;
        this.nickName=nickName;
    }

    /* public boolean equals(Object obj){
         if(this==obj){
             return true;
         }
         if(obj==null || this.getClass()!=obj.getClass()){
             return false;
         }
         Bird b=(Bird)obj;
         return this.name.equals(b.name)
         && this.id==b.id
         && this.nickName.equals(b.nickName);
     }*/
    public int hashCode()
    {
        return Objects.hash(name,id,nickName);
    }
}
public class BirdShop
{
    public static void main(String[] args) {
        Bird bird1=new Bird("Pigeon",1,"kuttan");
        Bird bird2=new Bird("Pigeon",1,"kuttan");
        Bird bird3=new Bird("Peacock",2,"Kili");
        Bird bird4=bird3;
        Bird bird5=new Bird("Peacock",2,"Ammu");
	    /*System.out.println(bird1.equals(bird2));
	    System.out.println(bird1.equals(bird3));
	    System.out.println(bird3.equals(bird4));
	    System.out.println(bird5.equals(bird3));*/

        System.out.println(bird1.hashCode());
        System.out.println(bird2.hashCode());
        System.out.println(bird3.hashCode());
        System.out.println(bird4.hashCode());

        System.out.println(bird1.hashCode()==bird2.hashCode());
        System.out.println(bird1.hashCode()==bird3.hashCode());
        System.out.println(bird3.hashCode()==bird4.hashCode());
        System.out.println(bird3.hashCode()==bird5.hashCode());
    }
}
