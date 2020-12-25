package aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    public void getBook(){

        System.out.println("Мы берем книгу");
    }
}
