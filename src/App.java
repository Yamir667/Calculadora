import java.util.Scanner;

public class App {
    /*Se requiere hacer una calculadora con java y utilizando POO
    Cada operacion debe tener su propio metodo, ejemplo sumar
    debe existir un metodo que nos ayude a la ejecucion del codigo
    el main debe estar limpio solo instancia y metodo de ejecucion
     */
    
    public double num1 = 0;
    public double num2 = 0;
    public int opcion = 0;
    public double sumar(double num1, double num2){

        return num1 + num2;

    }

    public double restar(double num1, double num2){

        return num1 - num2;

    }

    public double multiplicar(double num1, double num2){

        return num1 * num2;

    }

    public double dividir(double num1, double num2){

        return num1 / num2;

    }
    public void obtenerInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que deseas hacer?");
        System.out.println("1 - sumar, 2 - restar, 3 - multiplicar, 4 - dividir");
        this.opcion = scanner.nextInt();
        System.out.println("Escribe el valor 1");
        this.num1 = scanner.nextDouble();
        System.out.println("Escribe el valor 2");
        this.num2 = scanner.nextDouble();
    }
    public void ejecutar(){
        this.obtenerInfo();
        switch(this.opcion){
            case 1:
                System.out.println("La suma es " + this.sumar(this.num1, this.num2));
                break;
            case 2:
                System.out.println("La resta es " + this.restar(this.num1, this.num2));
                break;
            case 3:
                System.out.println("La multiplicacion es " + this.multiplicar(this.num1, this.num2));
                break;
            case 4:
                System.out.println("La division es " + this.dividir(this.num1, this.num2));
                break;
            default:
                System.out.println("No es una opcion valida");
                break;

        }
    }
    
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.ejecutar();
    }
}