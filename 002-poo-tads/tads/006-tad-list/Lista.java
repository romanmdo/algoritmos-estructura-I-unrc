public interface Lista<T> {
	// Metodos insertar - setters
	void insertarFin(T item);
	void insertarInicio(T item); 
	void insertarPos(T item, int pos);

	// Metodos auxiliares - getters
	void getLista();
	int longitud();
	boolean esVacia();
	// int buscar(T item);

	// Metodos eliminar - setters 
	T eliminarUltimo(); 
	T eliminarPrimero();
	// T eliminarPos();

	// Metodos retornar - getters
	T getPrimero();
	T getUltimo();
	// T getPos();

}