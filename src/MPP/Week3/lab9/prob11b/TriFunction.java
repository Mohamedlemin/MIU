package MPP.Week3.lab9.prob11b;

@FunctionalInterface
public interface TriFunction<S,T,U,R> {
	R apply(S s, T t, U u);
}
