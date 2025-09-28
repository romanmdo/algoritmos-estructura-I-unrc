import java.util.ArrayList; 

/**
 * Registros de temperaturas diarios de una estacion meteorológica
 */
public class MedicionesTemperaturas
{
    /**
     * Contiene las mediciones de temperaturas.
     */
    private ArrayList<Integer> registros;
    
    /**
     * Dia del registro
     */
    private int dia;
    
    /**
     * Mes del registro
     */
    private int mes;
    
    /**
     * Constructor de la clase. Inicializa dia y mes con los parámetros respectivos,
     * y la lista de registros se inicializa vacía (sin mediciones).
     * Precondición: 
     *  - dia debe ser un día válido (entre 1 y 31)
     *  - mes debe ser un mes válido (entre 1 y 12)
     */
    public MedicionesTemperaturas(int dia, int mes) {
        assert dia >= 1 && dia <= 31;
        assert mes >= 1 && mes <= 12;
        this.dia = dia;
        this.mes = mes;
        this.registros = new ArrayList<Integer>();
    }
    
    /**
     * Agrega una temperatura al registro de temperaturas
     */
    public void agregarRegistro(int nuevaTemperatura) {
        registros.add(nuevaTemperatura);
    }
    
    /**
     * Muestra todas las temperaturas registradas en 
     * la pantalla. 
     */
    public void imprimirTemperaturas() {
        System.out.println(dia + "/" + mes);
        int pos = 0;
        for (Integer temperatura: registros) {
            System.out.print(pos + ": ");
            System.out.println(temperatura + "C");
            pos = pos + 1;
        }
    }

    /**
     * Muestra en la terminal el promedio
     * de las temperaturas registradas.
     */

    public void promedioTemperaturas() {
        int promedioTemperaturas = 0;
        int sumaTemperaturas = 0;

        for (Integer temperatura: registros) {
            sumaTemperaturas += temperatura;
        }

        promedioTemperaturas = sumaTemperaturas / registros.size();
        System.out.println("El promedio de las temperaturas es: " + promedioTemperaturas);
    }

    /**
     * Muestra en la terminal la temperatura más alta
     * registrada.
     */

    public int mayorTemperatura() {
        int mayorTemperatura = 0;

        for (Integer temperatura: registros) {
            if(temperatura > mayorTemperatura) {
                mayorTemperatura = temperatura;
            }
        }

        System.out.println("La temperatura más alta es: " + mayorTemperatura);
        return mayorTemperatura;
    }

    /**
     * Muestra en la terminal la temperatura más alta
     * registrada.
     */
    
    public int menorTemperatura() {
        int menorTemperatura = 0;

        for (Integer temperatura: registros) {
            if(temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
            }
        }

        System.out.println("La menor temperatura registrada es: " + menorTemperatura);
        return menorTemperatura;
    }

    /**
     * Muestra en la terminal la amplitud termica,
     * (diferencia entre temperatura más alta y más baja)
     */
    
    public int amplitudTermica() {
        int mayorTemperatura = 0;
        int menorTemperatura = 0;
        int amplitudTermica = 0;

        for (Integer temperatura: registros) {
            if(temperatura > mayorTemperatura) {
                mayorTemperatura = temperatura;
            }
        }

        for (Integer temperatura: registros) {
            if(temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
            }
        }

        amplitudTermica = mayorTemperatura - menorTemperatura;
        System.out.println("La amplitud termica es: " + amplitudTermica);
        return amplitudTermica;
    }
}
