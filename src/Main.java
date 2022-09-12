public class Main {
    public static void main(String[] args) {

        numeroIf(2);
        numeroWhile(3);
        numeroDoWhile(3);
        numeroFor(3);
        Switch("noviembre");

    }

    public static void numeroIf(int a) {
        if (a > 0) {
            System.out.println("El numero es positivo");
        } else if (a < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es 0");
        }
    }

    public static void numeroWhile(int a) {
        int i = 0;
        while (i < a) {
            System.out.println("El numero while es: " + i);
            i++;
        }
    }

    public static void numeroDoWhile(int a) {
        int i = 3;
        do {
            System.out.println("El numero do while es: " + i);
            i++;
        } while (i < a);
    }

    public static void numeroFor(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("El numero for es: " + i);
        }
    }

    public static void Switch(String a) {
        switch (a) {
            case "enero":
            case "febrero":
            case "marzo":
                System.out.println("Es verano");
                break;
            case "abril":
            case "mayo":
            case "junio":
                System.out.println("Es otoño");
                break;
            case "julio":
            case "agosto":
            case "septiembre":
                System.out.println("Es invierno");
                break;
            case "octubre":
            case "noviembre":
            case "diciembre":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estacion");
                break;
        }
    }

}

/*
En este ejercicio practicarás las estructuras de control, para ello deberás crear:

Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
el bloque de código que tendrá el bucle deberá:

    Incrementar el valor de la variable en uno cada vez que se ejecute.

    Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que
la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse
por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en
la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.*/