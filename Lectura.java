/*
    Clase para la lectura de datos, tanto enteros como reales y ahora confirmaciones de lectura
*/

import java.io.*;
import javax.swing.JOptionPane;

public class Lectura{
    
    private int inputE;
    private double inputD;
    private char inputC;
    private boolean error;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //lectura de datos enteros
    public int DatosE() {
        do{
            try{
                error=false;
                inputE = Integer.parseInt(br.readLine());
                if(inputE <= 0){
                    System.out.println("Introduzca un dato valido");
                    
                }
            }  catch(IOException e){
                System.out.println(e);
                error = true;
            } catch(NumberFormatException er){
                System.out.println("Conversion erronea de datos, pruebe con valores numericos entero");
                error = true;
            }
        }while (error);
        
        return inputE;
    }
    //Metodo modificable para el momento de lectura de Opciones
    public int Opcion() {
        do{
            try{
                error=false;
                inputE = Integer.parseInt(br.readLine());
                if((inputE <= 0)||(inputE>3)){
                    System.out.println("Introduzca un dato valido");
                    error = true;
                }
            }  catch(IOException e){
                System.out.println(e);
                error = true;
            } catch(NumberFormatException er){
                System.out.println("Conversion erronea de datos, pruebe con valores numericos entero");
                error = true;
            }
        }while (error);
        
        return inputE;
    }
    
    //Lectura de Datos double
    public double DatosD(){
        do{
            try{
                error = false;
                inputD = Double.parseDouble(br.readLine());
               if(inputD <= 0){
                    System.out.println("Introduzca un dato valido");
                    error = true;
                }
            }  catch(IOException e){
                System.out.println(e);
                error = true;
            } catch(NumberFormatException er){
                System.out.println("Conversion erronea de datos, pruebe con valores numericos entero");
                error = true;
            }
        }while (error);
        
        return inputD;
    }
    
    
    //Sobrecarga de los metodos 
    //lectura de datos enteros
    public int DatosE(String entrada) {
        do{
            try{
                error=false;
                inputE = Integer.parseInt(entrada);
                while((inputE <= 0)){
                    JOptionPane.showMessageDialog(null, "No se aceptan numero negativos", "ERROR",JOptionPane.ERROR_MESSAGE);
                    entrada = JOptionPane.showInputDialog(null, "Introduzca un dato correcto");
                    inputE = Integer.parseInt(entrada);  
                }
            } catch(NumberFormatException er){
                JOptionPane.showMessageDialog(null, "Conversion erronea de datos, pruebe con valores numericos entero", "ERROR",JOptionPane.ERROR_MESSAGE);
                  entrada = JOptionPane.showInputDialog(null, "Introduzca un dato correcto");
                 error=true;
            }
        }while (error);
        
        return inputE;
    }
    
    //Metodo modificable para el momento de lectura de Opciones
    public int Opcion(String entrada) {
        do{
            try{
                error=false;
                inputE = Integer.parseInt(entrada);
                while((inputE <= 0)||(inputE>3)){
                    JOptionPane.showMessageDialog(null, "Introduzca un dato correcto", "ERROR",JOptionPane.ERROR_MESSAGE);
                    entrada = JOptionPane.showInputDialog(null, "Introduzca un dato correcto");
                 inputE = Integer.parseInt(entrada);
                }
            
            } catch(NumberFormatException er){
                JOptionPane.showMessageDialog(null, "Conversion erronea de datos, pruebe con valores numericos entero", "ERROR",JOptionPane.ERROR_MESSAGE);
                entrada = JOptionPane.showInputDialog(null, "Introduzca un dato correcto");
                     error=true;
                //inputE = Integer.parseInt(entrada);
            }
        }while (error);
        
        return inputE;
    }
    
    //Lectura de Datos double
    public double DatosD(String entrada){
        do{
            try{
                error = false;
                inputD = Double.parseDouble(entrada);
             while((inputD <= 0)){
                    JOptionPane.showMessageDialog(null, "No se aceptan numero negativos", "ERROR",JOptionPane.ERROR_MESSAGE);
                    entrada = JOptionPane.showInputDialog(null, "Introduzca un dato correcto");
                 inputD = Integer.parseInt(entrada);
                }
            
            } catch(NumberFormatException er){
                JOptionPane.showMessageDialog(null, "Conversion erronea de datos, pruebe con valores numericos entero", "ERROR",JOptionPane.ERROR_MESSAGE);
              entrada = JOptionPane.showInputDialog(null, "Introduzca un dato correcto");
                   error=true;
                //inputE = Integer.parseInt(entrada);
            }
        }while (error);
        
        return inputD;
    }
    
    
}