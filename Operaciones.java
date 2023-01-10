public class Operaciones {
    public static void main(String args[]){
        int num_1 = 6;
        int num_2 = 6;
        int result = 0;


       /*  Lo que hara aqui el programa es que va leer el codigo de derecha a izquierda
        entonces seria que el programa va a tomar num_2 y lo va dividir entre dos
        y cuanto num_2 = 6 entonces esto seria 6 / 2 = 3 y 3 + 6 serian 9 */
        result = num_1 + num_2 / 2;

        System.out.println("El resultado para esta expresion es Incorrecto : " + result);

        result = (num_1 + num_2) / 2;
        System.out.println("El resultado para esta expresion es Correcto : " + result);
    }
}
