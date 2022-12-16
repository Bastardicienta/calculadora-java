package PooEjercicio2;

public class Calculadora {
    //Método para sumar
    public float operacionSuma(float num1, float num2) {
        float suma = num1 + num2;
        return suma;
    }

    //Método para restar
    public float operacionResta(float num1, float num2) {
        float resta = num1 - num2;
        return resta;
    }

    //Método para multiplicar
    public float operacionMultiplicacion(float num1, float num2) {
        float multi = num1 * num2;
        return multi;
    }

    //Método para dividir
    public float operacionDivision(float num1, float num2) {
        if (num2 == 0){
            System.out.println("La división no se puede realizar");
        }
        return num1 / num2;
    }

    //Método con el menú
    public void menu (){
        System.out.println("Seleccione la operación que quieres hacer:");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicación");
        System.out.println("4) División");
    }
}
