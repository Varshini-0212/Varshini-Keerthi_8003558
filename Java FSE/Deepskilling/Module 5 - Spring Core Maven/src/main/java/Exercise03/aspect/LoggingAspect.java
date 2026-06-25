package Exercise03.aspect;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {

    public void logBefore(JoinPoint joinPoint) {
        System.out.println(
                "Logging: Method called -> "
                        + joinPoint.getSignature().getName()
        );
    }
}