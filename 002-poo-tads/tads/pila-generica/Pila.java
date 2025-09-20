public interface Pila<T> {
    void apilar(T item);
    void getPila();
    void desapilar();

    boolean esVacia();
    void vaciar();
}