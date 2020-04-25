package by.academy.project;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({ TYPE, ElementType.METHOD })
public @interface DealSettings {

	Legality legality();

	String coutry() default "Belarus";

	int numProduct();

}
