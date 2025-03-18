class Books {
    String name;
    int price;
    String author;

    public boolean equals(Object obj){
        if(this==obj)
        {
            return true;
        }
        if(obj==null||this.getClass()!=obj.getClass())
        {
            return false;
        }

        Books b= (Books)obj;
        return this.name.equals(b.name) &&
                this.price==b.price ;//&&
                //this.author.equals(b.author);
    }
    Books(String name,int price,String author){
        this.name=name;
        this.price=price;
        this.author=author;
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Books book1 = new Books("Oliver Twist", 150, "Charles Dickens");
        Books book2 = new Books("Romeo and Juliet", 400, "William S hakespare");
        Books book3 = book1;
        Books book4 = new Books("Oliver Twist", 150, "Robert Frost");
        Books book5 = new Books("Oliver Twist", 150, "Robert Frost");
        System.out.println(book1.equals(book2));
        System.out.println(book3.equals(book1));
        System.out.println(book4.equals(book1));
        System.out.println(book4.equals(book5));
    }
}