import foo.FooAnnotation;

// this should be processed by FooAspect, i.e. add @BarAnnotation(value = "comes_from_FooAspect")
@FooAnnotation
public class MyFoo {
}
