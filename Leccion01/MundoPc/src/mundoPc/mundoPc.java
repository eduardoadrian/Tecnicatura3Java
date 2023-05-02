
package mundoPc;

import ar.com.system2023.mundopc.*;

public class mundoPc {

   
    public static void main(String[] args) {
       Monitor monitorHP = new Monitor("HP", 13);//Importar la clase 
       Teclado tecladoHP = new Teclado("Bluetooth", "HP");
       Raton ratonHP = new Raton("Bluetooth", "HP");
       Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
       
       //Creamos otros objetos de diferente marca
       Monitor monitorGamer = new Monitor("Gamer", 13);//Importar la clase 
       Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
       Raton ratonGamer = new Raton("Bluetooth", "Gamer");
       Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
       Orden orden1 = new Orden();//Inicializando el arreglo vacio
       Orden orden2 = new Orden();//Una nueva lista para el objeto orden2
       orden1.agregarComputadora(computadoraHP);
       orden1.agregarComputadora(computadoraGamer);
       
       Computadora computadoraVarias = new Computadora("Computadora de diefernetes marcas", monitorHP, tecladoGamer, ratonHP);
       orden2.agregarComputadora(computadoraVarias);
       
       orden1.mostrarOrden();
       orden2.mostrarOrden();
       
       //Crear mas objetos de tipo computadora con todos sus elementos
       //completar una lista en el objeto orden1 que legue a los 10 elementos
       //probar de esta manera los metodos al maximo rendimiento
       
    }
}
 