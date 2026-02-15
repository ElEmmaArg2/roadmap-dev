public class Clase002 {
    public static void main(String[] args) {
        String saludar = "Hola mundo como estas";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;
        Integer numero2 = 20;

        //numero. X --- No funciona asi no es una instancia o una clase, no puede usar metodos
        float numero3 = numero2.floatValue();

        System.out.println("numero2 = " + numero2);
        System.out.println("numero3 = " + numero3);

        boolean verdadero = true;
        if (verdadero) {
            System.out.println("Es verdadero");
        }


    }
}
