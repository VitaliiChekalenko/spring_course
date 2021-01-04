package aop.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookAspect: в библиотеку пытаются вернуть книгу");

        //      long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
        try{
         targetMethodResult = proceedingJoinPoint.proceed();}
        catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice: было поймано исключение " + e);
//            targetMethodResult = "Неизвестное название книги";
            throw e;
        }
        //    long end = System.currentTimeMillis();
        //  targetMethodResult = "Майн кампф";
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу");
        //    System.out.println("aroundReturnBookLoggingAdvice: метод returnBook віполнил работу за " + (end-begin) + " миллисекунд" );
        return targetMethodResult;
    }
}
