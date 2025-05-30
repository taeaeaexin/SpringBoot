package annotation;

import java.lang.annotation.Annotation;
import AnnotationTest.Minseo;

public class ttest {
	public static void main(String[] args) throws Exception {
		Class<?> myClass = Class.forName("AnnotationTest.Letter");

		Annotation[] annotations = myClass.getAnnotations();
		for(Annotation annotation : annotations) {
		    if(annotation instanceof Minseo) {
		        Minseo minseo = (Minseo) annotation;
		        System.out.println("To. " + minseo.player());
		        System.out.println(minseo.message());
		        System.out.println();
		        System.out.println("From. " + minseo.team());
		    }
		}
	}
}