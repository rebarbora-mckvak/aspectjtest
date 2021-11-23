package foo;

public aspect FooAspect {
    declare @type:(@FooAnnotation *): @BarAnnotation(name = "comes_from_FooAspect");
}
