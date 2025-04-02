import java.util.*;
class Book{
    int bookId;
    String title;
    String author;
    boolean isAvailable;
    
    public Book(int bookId,String title,String author){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }
    public String toString(){
        return "BOOK TITLED "+title+" WITH BOOK ID "+bookId+" WRITTEN BY "+author+" IS "+(isAvailable ? "AVAILABLE" : "BORROWED");
    }
}
class Library{
    
}
class LibraryManagementSystem{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        Map<Integer,Book> bookMap= new LinkedHashMap<>();
        //ArrayList <Book> arr=new ArrayList<>();
        do{
            System.out.println("""
            WELCOME TO LIBRARY MANAGEMENT SYSTEM
            
            1.Add Books
            2.Display Books
            3.Borrow a Book
            4.Return a Book
            5.View Borrowed books
            6.Exit
            Enter your Choice """);
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Book id");
                    int bookId=sc.nextInt();
                    sc.nextLine();
                    if(bookMap.containsKey(bookId)){
                        System.out.println("This book already exists!Add another book\n");
                        break;
                    }
                    else{
                        System.out.println("Enter Book Title");
                        String title=sc.nextLine();
                        System.out.println("Enter Author name");
                        String author=sc.nextLine();
                        Book book=new Book(bookId,title,author);
                        bookMap.put(bookId,book);
                        System.out.println("Book added sucessfully\n");
                    }
                    break;
                    
                case 2:
                    if(bookMap.isEmpty()){
                        System.out.println("The library is empty!!Add books");
                    }
                    else{
                        bookMap.forEach((key,value)->System.out.println(value));
                        break;
                    }
                    
                    
                case 3:
                    System.out.println("Enter the bookID of the book you wish to borrow");
                    int borrowId=sc.nextInt();
                    if(bookMap.containsKey(borrowId)){
                        Book borrowBook=bookMap.get(borrowId);
                        if(borrowBook.isAvailable){
                            borrowBook.isAvailable=false;
                            //arr.add(borrowBook);
                            System.out.println("The book with following details "+borrowBook);
                            //arr.forEach(System.out::println);
                            System.out.println(" has been borrowed sucessfully\n");
                        }else{
                            System.out.println("Sorry!The book is already borrowed\n");
                        }
                    }else{
                        System.out.println("Book Not Found");
                    }
                    break;
                case 4:
                    System.out.println("Enter the bookID of the book you wish to return");
                    int returnId=sc.nextInt();
                    if(bookMap.containsKey(returnId)){
                        Book returnBook=bookMap.get(returnId);
                        if(!returnBook.isAvailable){
                            returnBook.isAvailable=true;
                            //arr.remove(returnBook);
                            System.out.println("The book with following details "+returnBook+" has been returned sucessfully\n ");
                        }else{
                            System.out.println("The book was not borrwed");
                        }
                        
                    }
                    else{
                        System.out.println("Book Not Found");
                    }
                    break;
                case 5:
                    boolean found=false;
                    for (Book b:bookMap.values()){
                        if(!b.isAvailable){
                            System.out.println(b);
                            found=true;
                        }
                    }
                    if(!found){
                        System.out.println("Sorry!!No books are borrowed");
                    }
                    break;
                case 6:
                    System.out.println("Thank You!!You are exiting...");
                    break;
                default:
                   System.out.println("Please Enter a valid choice!!\n");
                    
            }
            
        }while(choice!=5);
        
    }
    
    
}