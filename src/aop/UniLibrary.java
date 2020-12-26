package aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(Book book){
        System.out.println("Мы берем книгу из UniLibrary " + book.getName());
    }

     String returnBook(){
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "OK!";
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал из UniLibrary");
    }
}
