package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        //   Book book = context.getBean("book", Book.class);
        UniLibrary unilibrary = context.getBean("uniLibrary", UniLibrary.class);
        unilibrary.getBook();
        unilibrary.getMagazine();
//        unilibrary.returnMagazine();
//        unilibrary.addBook();


//        unilibrary.returnBook();
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
