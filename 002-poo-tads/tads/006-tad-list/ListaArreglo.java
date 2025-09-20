public class ListaArreglo<T> implements Lista<T> {
    public static final int MAX_LISTA = 5;
    private T[] items;

    public ListaArreglo(){
        items = (T[]) new Object[MAX_LISTA];
    }

    @Override
    public void insertarFin(T item){
        items[MAX_LISTA - 1] = item;
    }

    @Override
    public void getLista(){
        for(int i = 0; i < items.length; i++){
            System.out.println("# Item: " + items[i] + " pos: " + i);
        }
    }

    @Override
    public void insertarInicio(T item){
        items[0] = item;
    }

    @Override
    public void insertarPos(T item, int pos){
        assert pos < 10;
        items[pos] = item;
    }

    @Override
    public T eliminarUltimo(){
        T itemEliminado = items[MAX_LISTA - 1];
        items[MAX_LISTA - 1] = null;
        System.out.println("# El item eliminado en pos = MAX_LISTA - 1 de la lista, era: " + itemEliminado);
        return itemEliminado;
    }

    @Override
    public T eliminarPrimero(){
        T itemEliminado = items[0];
        items[0] = null;
        System.out.println("# El item eliminado en pos = 0 de la lista, era: " + itemEliminado);
        return itemEliminado;
    }

    @Override
    public T eliminarPos(T item, int pos){
        assert pos < 10;
        T itemEliminado = items[pos];
        items[pos] = null;
        System.out.println("# El item eliminado de la lista era: " + itemEliminado);
        return itemEliminado;
    }

    @Override
    public T getPrimero(){
        assert items.length > 0;
        T getItem = items[0];
        System.out.println("# El primer item de la lista es: " + getItem);
        return getItem;
    }

    @Override
    public T getUltimo(){
        assert items.length > 0;
        T getItem = items[MAX_LISTA - 1];
        System.out.println("# El ultimo item de la lista es: " + getItem);
        return getItem;
    }

    @Override
    public T getPos(int pos){
        assert pos < 10;
        T getItem = items[pos];
        System.out.println("# El item en la pos: " + pos + " de la lista es: " + getItem);
        return getItem;
    }

    @Override
    public int buscar(T item){
        assert items.length > 0;

        for(int i = 0; i < items.length; i++){
            if(item.equals(items[i])){
                int pos = i;
                System.out.println("# Este item ya se encuentra en la lista, esta en la pos: " + i);
                return pos;
            }
        }
        System.out.println("# Este item no se encuentra en la lista");
        return -1;
    }

    @Override
    public int longitud(){
        assert items.length > 0;
        int cantidad = 0;
        for(int i = 0; i < items.length; i++){
            if(items[i] != null){
                cantidad += 1;
            }
        }

        System.out.println("# La lista contiene " + cantidad + " elementos");
        return cantidad;
    }

    @Override
    public boolean esVacia(){
        if(items.length < 0){
            return true;
        } else{
            return false;
        }
    }
}