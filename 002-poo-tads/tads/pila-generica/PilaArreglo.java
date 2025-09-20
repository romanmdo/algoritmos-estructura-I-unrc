public class PilaArreglo<T> implements Pila<T>{
    public static final int MAX_PILA = 5;
    private T[] items;
    private int tope;

    public PilaArreglo(){
        items = (T[]) new Object[MAX_PILA];
        tope = -1;
    }

    @Override
    public void apilar(T item){  
        items[++tope] = item;
    }

    @Override
    public void getPila(){
        for (int i = tope; i >= 0; i--) {
            System.out.println(items[i]);
        }

        System.out.println("Tope: " + tope);
    }

    @Override
    public void desapilar(){
    }

    @Override
    public boolean esVacia(){
        return true;
    }

    @Override
    public void vaciar(){
    }
}