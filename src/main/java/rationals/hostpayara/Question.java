/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rationals.hostpayara;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author admin
 */
public class Question {

@Target(value = {ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface DataSourceDefinition {

    public String name();

    public String className();

    public String description() default "";

    public String url() default "";

    public String user() default "";

    public String password() default "";

    public String databaseName() default "";

    public int portNumber() default -1;

    public String serverName() default "localhost";

    public int isolationLevel() default -1;

    public boolean transactional() default true;

    public int initialPoolSize() default -1;

    public int maxPoolSize() default -1;

    public int minPoolSize() default -1;

    public int maxIdleTime() default -1;

    public int maxStatements() default -1;

    public String[] properties() default {};

    public int loginTimeout() default 0;
}
    
}
