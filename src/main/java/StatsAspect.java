import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by laurent on 17/08/14.
 */

@Aspect
public class StatsAspect {
    @After(value = "@annotation(Stats)")
    public void after(final JoinPoint joinPoint) throws Throwable {

        System.out.println("_____________");

        System.out.println(joinPoint.getSignature().getDeclaringTypeName());

        for (Object object : joinPoint.getArgs()) {
            System.out.println(object);
        }

        System.out.println("_____________");
    }
}
