package Polymorphism;

public class Store extends Book
{
    @Override
    public void info() {
        System.out.println("Store information");
    }

    @Override
    public void info(String name) {
        System.out.println("Book name" +name);
    }

    public static void main(String[] args) {

        Book book=new Book();
        book.info();
        Book b = new Book();
        b.info("I love My India");

    }

}
