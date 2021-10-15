package com.generation;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// arreglos:  hya que definir el tipo de dato que contendra el arreglo, solo se peude de un tipo
        //el tamaño del arreglo es estatico, no se puede modificar
//        String universidades[];
//        universidades = new String[5];
        //para declararlo en una sola línea:
//        String universidades[] = new String[5];
        //otra forma de inicializar valores:
       String  universidades[]= new String[]{"ITVH", "ULA","UAM","UADM","UNAM"};
//        universidades[0] ="ITVH";
//        universidades[1]="ULA";
//        universidades[2]="UAM";
//        universidades[3]="UADM";
//        universidades[4]="UNAM";
//        universidades[5]="UPN";
//        universidades[6]="IPN";
//        universidades[7]="TESCO";

        //el vector uiversodades sera recorrido con la ayuda de la variable universidad
        //es similae al foreach de javascript
        System.out.println("arreglos");
        for(String universidad : universidades){
            System.out.println(universidad);

        }
        System.out.println("--------------------------------");
        //colecciones: conjunto de objetos, hay diferentes maneras de almacenarlas,
        //principalmente 3 formas: array, set y map

        //set: no puede contener elementos duplicados
        //Si hay valores repetidos no los toma en cuenta, pero no marca error
        //conunto de metodoos de set:
        //hashset: tabla con mejor rendimiento,es la mas rapdia
        //el orden de los elementos puede variar
        //se puede inicializar con un tamaño,pero este solo sera el tamaño MINIMO,
        //por lo que se pueden añadir mas elementos
        //es el mas rapido

        //para almacenar numeros:<Integer>
        Set<String> frutas = new HashSet(4);
        frutas.add("Manngo");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Melon");
        frutas.add("Lima");
        frutas.add("Lima"); //no lo toma en cuenta

        System.out.println("Set: hashset");

        for (String fruta : frutas){
            System.out.println(fruta);
        }
        System.out.println("--------------------------------");
//
//        //treeset
//        //es el mas lento
//        //ordena los elementos alfabeticamente
//        //no se le puede establecer un cambio inicial
//
//
        Set<String> frutas2 = new TreeSet<>();
        frutas2.add("Manngo");
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Melon");
        frutas2.add("Lima");

        System.out.println("Set: treeset");

        for (String fruta : frutas2){
            System.out.println(fruta);
        }
        System.out.println("--------------------------------");
//        //LinkedHashSet
//        //almacena los valores en prden de insercion
//        //si se le puede darun tamaño inicial
//
        Set<String> frutas3 = new LinkedHashSet<>(4);
        frutas3.add("Manngo");
        frutas3.add("Fresa");
        frutas3.add("Pera");
        frutas3.add("Uva");
        frutas3.add("Melon");
        frutas3.add("Lima");
        System.out.println("Set: LinkedHasSet");
        for (String fruta : frutas3){
            System.out.println(fruta);
        }
        System.out.println("--------------------------------");

        // List
        //acepta elementos duplciados
        //aparecen los elementos en orden
        //get: devuelve elemento especficio de la collection, realiza busqueda
        //es mas lento
        //tiene mas metodos, puede eliminar lugareso asignar nuevos valors
        //list es de las mas utilizadas

        List<String> frutas4 = new ArrayList<>();

        frutas4.add("Manngo");
        frutas4.add("Fresa");
        frutas4.add("Pera");
        frutas4.add("Uva");
        frutas4.add("Melon");
        frutas4.add("Lima");
        frutas4.add("Manngo");
        System.out.println("List");

        for (String fruta : frutas4){
            System.out.println(fruta);
        }

        System.out.println("--------------------------------");

        System.out.println(frutas4.get(3));
        //SI no conozco el indice
        int indice = frutas4.indexOf("Melon"); //busca el indice del elemento, solo del primer elementomque encuentre
        System.out.println(frutas4.get(indice));

        System.out.println("--------------------------------");

        //Linkedlist
        //tiene los mismos metodos que list
        //tiene una estructura onterna diferente, es una lista doblemente enlazada
        //esto significa que el elemento sabe que va antes y despues
        //por ejemplo el elemento fresa sabe que antes va mango y despues peroa
        //tambien acepta elementos repetidos

        List<String> frutas5 = new LinkedList<>();

        frutas5.add("Manngo");
        frutas5.add("Fresa");
        frutas5.add("Pera");
        frutas5.add("Uva");
        frutas5.add("Melon");
        frutas5.add("Lima");
        frutas5.add("Manngo");
        System.out.println("List: linked list");
        for (String fruta : frutas5){
            System.out.println(fruta);
        }

        System.out.println("--------------------------------");
        //map - hashmap
        //trabaja con clave y valor, las asocia
        //podemos almacenar pares de infromacion
        //no puede tener claves repetidas
        //solo puede tener un valor asociado a la vlave
        //a este tipo de colleccionaes les pueden decir diccionarios
        //put nos permite colocar claves y valores
        //las claves tambien pueden ser textto, por ejemplo las palcas de un auto
        //LAS CLAVES NO SE PUEDEN REPETIR
        //no garantiza un orden
        //se recomienda darle un tamaño especifico inicial
        Map<Integer, String> universidades2 = new HashMap<Integer, String>(); //aqui crea la coleccion vacia
        universidades2.put(1, "IPN");
        universidades2.put(2, "UNAM");
        universidades2.put(3, "UAEM");
        universidades2.put(4, "UAM");
        universidades2.put(5, "TESCO");

        System.out.println(universidades2.get(3));
        System.out.println("Map: HasMap");
        //para recorrer la coleccion:
        for (Map.Entry<Integer, String> universidad : universidades2.entrySet()) {
            System.out.println("clave=" + universidad.getKey() + ", valor=" + universidad.getValue());
        }

        System.out.println("--------------------------------");

    //tree Map
        //ordena los daots en funcion de sus valores de la CLAVE
        //es mas lento que HashMap
        //interfaz comparable ._.
        Map<String, String> autos = new TreeMap<String, String>();
        autos.put("PLE9945", "FORD");
        autos.put("PMK7764", "RENAULT");
        autos.put("PMA1359", "VW");
        autos.put("GGN3426", "NISSAN");
        autos.put("LTU5408", "CHEVROLET");
        System.out.println("Map: tree Map");

        for (Map.Entry<String, String> auto : autos.entrySet()) {
            System.out.println("clave=" + auto.getKey() + ", valor=" + auto.getValue());
        }

        System.out.println("--------------------------------");

        //LinkedHashMap
     //almacena las claves en funcion del orden de insercion
     //se tarda mas que hashmap
     Map<String, String> autos2 = new LinkedHashMap<String, String>();
     autos2.put("PLE9945", "FORD");
     autos2.put("PMK7764", "RENAULT");
     autos2.put("PMA1359", "VW");
     autos2.put("GGN3426", "NISSAN");
     autos2.put("LTU5408", "CHEVROLET");

     System.out.println("Map: LinkedMap");

     for (Map.Entry<String, String> auto : autos2.entrySet()) {
      System.out.println("clave=" + auto.getKey() + ", valor=" + auto.getValue());
     }
     
    }
}
