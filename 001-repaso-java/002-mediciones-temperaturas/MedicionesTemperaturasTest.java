public class MedicionesTemperaturasTest{
    public static void main(String[] args) {
        MedicionesTemperaturas t1 = new MedicionesTemperaturas(01, 02);

        t1.agregarRegistro(-1);
        t1.agregarRegistro(3);
        t1.agregarRegistro(8);
        t1.agregarRegistro(15);
        t1.agregarRegistro(12);
        t1.agregarRegistro(6);
        t1.agregarRegistro(6);
        t1.agregarRegistro(2);

        t1.imprimirTemperaturas();
        t1.promedioTemperaturas();
        t1.mayorTemperatura();
        t1.menorTemperatura();
        t1.amplitudTermica();
    }
}
