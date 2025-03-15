package Week1.InLab;
class LibrarySystem{
    int bookID;
    String bookName;
    String author;
    double price;
    void setBookID(int bookID){
        this.bookID=bookID;
    }
    void setBookName(String bookName){
        this.bookName=bookName;
    }
    void setAuthor(String author){
        this.author=author;
    }
    void setPrice(double price){
        this.price=price;
    }
    int getBookID(){
        return bookID;
    }
    String getBookName(){
        return bookName;
    }
    String getAuthor(){
        return author;
    }
    double getPrice(){
        return price;
    }
    public String toString(){
        return "BookName: "+bookName+" Author: "+author+" Price: "+price;
    }

}
class DVD extends LibrarySystem{
    public DVD(){
        super();
    }

}
class books extends LibrarySystem{
    public books(){
        super();
    }
}
class magazines extends LibrarySystem{
    public magazines(){
        super();
    }
}

public class Library {
    public static void main(String[] args) {

        LibrarySystem ls = new LibrarySystem();
        ls.setBookID(1);
        ls.setBookName("DVD");
        ls.setAuthor("DVD");
        ls.setPrice(2.5);

    }
}
