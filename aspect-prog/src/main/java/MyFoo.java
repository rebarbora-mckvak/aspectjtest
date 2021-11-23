import foo.FooAnnotation;

import java.lang.annotation.Annotation;

// This should be processed by FooAspect, i.e. add @BarAnnotation(value = "comes_from_FooAspect")
@FooAnnotation
public class MyFoo {
    public static void main(String[] args) {
        for (Annotation annotation : MyFoo.class.getDeclaredAnnotations()) {
            System.out.println(annotation);
        }
    }
}
