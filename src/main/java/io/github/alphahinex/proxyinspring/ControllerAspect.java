package io.github.alphahinex.proxyinspring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ControllerAspect {

    @Pointcut("execution(* *..*Controller.*(..))")
    public void dataPointcut() { }

    @Around("dataPointcut()")
    public Object doAround(ProceedingJoinPoint point) throws Throwable {
        throw new CheckedException();
    }

}
