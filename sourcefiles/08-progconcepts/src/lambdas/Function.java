package lambdas;

public interface Function<T, R> {
    R apply(T t); //applies function to a T and returns an R
}
