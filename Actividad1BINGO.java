//ACTIVIDAD EVALUABLE 1 PROGRAMACION

//MARTA PEREZ 1ª DAW 2023-2024

//EJERCICIO BINGO

//(Incluye algunas notas al final)


import java.util.Scanner;

public class Actividad1BINGO {
    public static void main(String[] args) {


        //Pedir predicción y apuesta al usuario

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos números crees que harán falta para BINGO?");
        int prediccion = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Por favor, introduce tu apuesta");
        int apuesta = scanner2.nextInt();

        //Crear un cartón de 10 números aleatorios (no duplicados)

        int[] carton = new int[10];
        boolean comprobacion = false;

        for (int i = 0; i < 10; i++) {
            int numero;
            do {
                numero = (int) (Math.random() * 99) + 1;

                //recorrer la lista

                for (int item : carton) {
                    if (item == numero) {
                        comprobacion = true;
                    } else {
                        comprobacion = false;
                    }
                }
            } while (comprobacion);
            carton[i] = numero;
        }
        System.out.println("Tu cartón de hoy es: ");
        for (int item : carton) {
            System.out.print(item + " ");
        }


        //Sacar bolas con numero aleatorias para BINGO

        int[] numerosSacados = new int[99];

        System.out.println("\n" + "\n");
        System.out.println("Los números que han salido son: ");

        for (int i = 0; i < 99; i++) {
            int numero2;
            numero2 = (int) (Math.random() * 99) + 1;
            numerosSacados[i] = numero2;

            for (int item2 : numerosSacados) {
                System.out.print(item2 + " ");
            }
        }
        // Comparar estos números con mi cartón

        boolean estanNumeros = false;
        for (int i = 0; i < carton.length; i++) {
            if (carton[i] == numerosSacados[i]) {
                estanNumeros = true;
                break;
            }
        }
        if (estanNumeros) {
            System.out.println("Numero encontrado");
        } else {
            System.out.println("No está");
        }

    }

}


//Tras muchos intentos, me temo que esto es lo máximo que he alcanzado a hacer.
//Salen muchísimos números, no solo 99 y, al igual que el cartón, continúan repitiendose.
//Tampoco he conseguido emparejar bien los numerosSacados con los numeros del cartón, por lo que llego a un punto muerto en el ejercicio...

/* Incluyo en las notas algunos de los otros intentos que he realizado. Si no es mucho inconveniente, agradecería que les echases un vistazo:

1) También probé el metodo utilizando unicamente if y for, pero los números del cartón seguian repitiendose y salian más de diez números.

 int [] carton = new int [10];

        System.out.println("Su cartón de hoy es: ");
        for (int i=0; i<carton.length; i++){
            int cartonRandom = (int) (Math.random()*99)+1;
            boolean numeroRepetido = false;

            for (int j = 0; j <=i && !numeroRepetido; j++) {

                if (carton[j] == cartonRandom) {
                    numeroRepetido = true;
                }
            }
            if (!numeroRepetido){
                carton[i] = cartonRandom;
            }
            else {
                i=i-1;
            }
            System.out.print(cartonRandom+" ");


        }

2) O este otro, que se quedaba funcionando sin llegar a generar nada:

int[] carton = new int[10];

        for (int i = 0; i < carton.length; i++) {
            int numeroAleatorio;
            boolean duplicado;

            do{
                numeroAleatorio = (int) (Math.random() *99);
                duplicado = false;

                for (int j = 0; j < i; j++) {
                    if (carton[i] == numeroAleatorio); {
                        duplicado = true;
                        break;
                    }
                }
            }while (duplicado);
            carton[i] = numeroAleatorio;
        }
        System.out.println("El cartón de hoy es: ");
        for (int item:carton
             ) {
            System.out.println(item +"\t");
        }

Creo que en teoría entiendo lo que necesito hacer, pero me falta más práctica con el código a la hora de escribirlo.
En cualquier, caso muchas gracias por la ayuda, espero hacerlo mejor la próxima vez.

 */
