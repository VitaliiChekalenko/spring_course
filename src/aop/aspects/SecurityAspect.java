package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {

    @Before("aop.aspects.MyPointCuts.allGetMethods()")
    public void beforeGetSecurityAdvise(){
        System.out.println("beforeGetSecurityAdvise: проверка прав на получение книги или журнала");
    }
}
