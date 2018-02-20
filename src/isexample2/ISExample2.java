/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isexample2;

import com.sun.org.apache.xml.internal.serialize.Serializer;
import java.util.Scanner;

/**
 *
 * @author entrar
 */
public class ISExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a la aplicación\n"
                + "Si desea obtener el número atómico de un elemento pulse 1.\n"
                + "Si desea obtener el peso atómico de un elemento pulse 2.\n"
                + "Si desea obtener el símbolo de un elemento pulse 3.\n"
                + "Si desea obtener todos los elementos de la tabla periodica"
                + " pulse 4.\n ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Scanner reader;
        String element = "";
        switch(i){
            case 1:
                System.out.println("Introduzca en elemento en ingles : ");
                reader = new Scanner(System.in);
                element = reader.next();
                Serializer new1 = new Persister(); 
                
            case 2:
                System.out.println("Introduzca en elemento en ingles : ");
                reader = new Scanner(System.in);
                element = reader.next();
                
            case 3:
                
                System.out.println("Introduzca en elemento en ingles : ");
                reader = new Scanner(System.in);
                element = reader.next();

            case 4:
                
        
        }
        
    }

    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }

    private static String getAtomicWeight(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

    private static String getAtoms() {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getElementSymbol(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }
    
}
