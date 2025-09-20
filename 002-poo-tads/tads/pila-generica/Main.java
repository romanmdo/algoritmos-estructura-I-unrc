public class Main {
    public static void main(String[] args) {
        Pila<String> pila = new PilaArreglo<>();
        
        pila.apilar("Naranja");
        pila.apilar("Azul");
        pila.apilar("Verde");
        pila.apilar("Rojo");
        pila.apilar("Violeta");
        pila.getPila();
    }
}