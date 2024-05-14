/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbeans.hostpayara;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author admin
 */
public class checks {

@Target(value = {ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Resource {

    public enum AuthenticationType {
        CONTAINER, APPLICATION;

        private AuthenticationType() {
            // compiled code
        }
    }

    public String name() default "";

    public String lookup() default "";

    public Class<?> type() default Object.class;

    public AuthenticationType authenticationType() default AuthenticationType.CONTAINER;

    public boolean shareable() default true;

    public String mappedName() default "";

    public String description() default "";
}
    
}
