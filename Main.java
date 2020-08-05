/*
-Johann Zimermann
-Jose Perez
-Daniel Downs
-Eric Mason

*						ADOO
*       SistemaSolar
*------------------------
*-masa
*-edad
*------------------------
* +traerP()
* +traerE()
* +asignarE()
* +asignarP()
* +calcularPeso()
* +calcularEdad()
*
*/

import java.io.*;
import javax.swing.*;
import java.text.*;


class SistemaSolar{
  private int edad;
  private double peso;
  
  public void asignarE(int edad){
    this.edad = edad;
  }
  public void asignarP(double peso){
    this.peso = peso;
  }
  
  public double traerP(){
    return peso;
  }
  public double traerE(){
    return edad;
  }
  
  double calcularPeso(double planeta){
    return peso * planeta;
  }
  double calcularEdad(double planeta){
    return edad * planeta;
  }
}
class Main {
  public static void main(String[] args) {
    Lectura leer = new Lectura ();
    SistemaSolar sist = new SistemaSolar();
    DecimalFormat decimal= new DecimalFormat("####.00");
    Icon ima ;
    
    int seleccion=0, ed=0, op=0;
    double p;
   
    String[] opciones1 = {"Peso","Edad","Salir"};
    String[] opciones = {"Mercurio", "Venus", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno"};
    
    //                    Mercurio Venus Marte Júpiter Saturno Urano Neptuno
    double planetasP[] = {0.39, 0.87, 0.38,  2.55,  0.93,  0.99, 1.38};
    double planetasE[] = {4.19, 1.62, 0.53, 0.084, 0.034, 0.012, 0.006};
    
    do{
      seleccion = JOptionPane.showOptionDialog(null,"QUE DESEAS SABER DE TI EN OTRO PLANETA","Calculo de peso",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones1, opciones1[0]);
      seleccion+=1;
      switch(seleccion){
        case 1 :
          p = leer.DatosD(JOptionPane.showInputDialog(" Introduce tu peso"));
          sist.asignarP(p);
          op = JOptionPane.showOptionDialog(null, "En que planeta quiere saber su peso","Calculo de peso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
          switch(op+1){
            case 1:
             ima = new ImageIcon("mercurio.jpg");
             JOptionPane.showMessageDialog(null,"Tu peso en la tierra: "+decimal.format(sist.traerP())+"\nSu peso en Mercurio: "+decimal.format(sist.calcularPeso(planetasP[op]))+"\nEsto se debe a que la gravedad en mercurio es mucho menor a la de la tierra y hace que los objetos pesen mucho menos", "MERCURIO", JOptionPane.QUESTION_MESSAGE, ima);
            break;
            
            case 2:
             ima = new ImageIcon("venus.jpg");
             JOptionPane.showMessageDialog(null,"Tu peso en la tierra: "+decimal.format(sist.traerP())+"\nSu peso en Venus: "+decimal.format(sist.calcularPeso(planetasP[op]))+"\nEl peso cambia debido a que la gravedad en venus es de mucho menor a la de la tierra y hace que los objetos sean mas livianos", "VENUS", JOptionPane.QUESTION_MESSAGE, ima);
            break;
            
            case 3:
               ima = new ImageIcon("marte.jpg");
             JOptionPane.showMessageDialog(null,"Tu peso en la tierra: " + decimal.format(sist.traerP() )+ "\nSu peso en Marte: " + decimal.format(sist.calcularPeso(planetasP[op]))+"\nEl peso en Marte es menor a la de la tierra ya que que la gravedad es menor y hace que todo sea mas liviano", "MARTE", JOptionPane.QUESTION_MESSAGE, ima);
            break;
            
            case 4:
               ima = new ImageIcon("jupiter.jpg");
               JOptionPane.showMessageDialog(null,"Tu peso en la tierra: " + decimal.format(sist.traerP()) + "\nSu peso en Jupiter: " + decimal.format(sist.calcularPeso(planetasP[op]))+"\nEn jupiter la gravedad es alta pero no superior a la de la tierra lo cual hace que seas mas pesado en comparacion\na los otros planetas pero no mas que la tierra", "JUPITER", JOptionPane.QUESTION_MESSAGE, ima);
              break;
            
            case 5:
              ima = new ImageIcon("saturno.jpg");
              JOptionPane.showMessageDialog(null,"Tu peso en la tierra: " + decimal.format(sist.traerP()) + "\nSu peso en Saturno: " + decimal.format(sist.calcularPeso(planetasP[op]))+"\nEn saturno la gravedad es muy baja haciendo que los objetos sean mas livianos", "SATURNO", JOptionPane.QUESTION_MESSAGE, ima);
              break;
            
            case 6:
               ima = new ImageIcon("urano.jpg");
               JOptionPane.showMessageDialog(null,"Tu peso en la tierra: " + decimal.format(sist.traerP()) + "\nSu peso en Urano: " + decimal.format(sist.calcularPeso(planetasP[op]))+"\nTiene una gravedad muy baja y eso hace que que todos los objetos sean menos pesados", "URANO", JOptionPane.QUESTION_MESSAGE, ima);
               break;
            
            case 7:
               ima = new ImageIcon("neptuno.jpg");
           	   JOptionPane.showMessageDialog(null,"Tu peso en la tierra: " + decimal.format(sist.traerP()) + "\nSu peso en Neptuno: " + decimal.format(sist.calcularPeso(planetasP[op]))+"\nSu gravedad es baja y hace que los objetos sean mas livinanos en comparacion a la tierra", "NEPTUNO", JOptionPane.QUESTION_MESSAGE, ima);
               break;
          }
        break; 
      
				case 2:
           ed = leer.DatosE(JOptionPane.showInputDialog("Introduce tu edad"));
           sist.asignarE(ed);
           op = JOptionPane.showOptionDialog(null, "En que planeta quiere saber su edad","Calculo de edad",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
           switch(op+1){
              case 1:
                ima = new ImageIcon("mercurio.jpg");
             	JOptionPane.showMessageDialog(null,"Su edad en la tierra es:"+ sist.traerE() + "\nSu edad en Mercurio es:"+decimal.format(sist.calcularEdad(planetasE[op]))+"\nTiene mucho tiempo de estar viv@ aqui!! Esto se deba problablemente a que este planeta le toma muchisimo menos tiempo en dar una vuelta alrededor del sol a comparacion de la Tierra\n" , "MERCURIO", JOptionPane.QUESTION_MESSAGE, ima);
           		break;
              
              case 2:
                ima = new ImageIcon("venus.jpg");
             	JOptionPane.showMessageDialog(null,"Su edad en la tierra es:"+ sist.traerE() + "\nSu edad en Venus es:"+decimal.format(sist.calcularEdad(planetasE[op]))+"\nEsta es su edad ya que en Venus tarda menos tiempo en dar una vuelta alrededor del sol\n" , "VENUS", JOptionPane.QUESTION_MESSAGE, ima);
           		break;
              
              case 3:
                ima = new ImageIcon("marte.jpg");
             	JOptionPane.showMessageDialog(null,"Su edad en la tierra es:"+ sist.traerE() + "\nSu edad en Marte es:"+decimal.format(sist.calcularEdad(planetasE[op]))+"\nAqui tarda mas tiempo en dar una vuelta alrededor del sol, se empieza ver mas joven\n" , "MARTE", JOptionPane.QUESTION_MESSAGE, ima);
           		break;
              
              case 4:
                ima = new ImageIcon("jupiter.jpg");
             	JOptionPane.showMessageDialog(null,"Su edad en la tierra es:"+ sist.traerE() + "\nSu edad en Jupiter es:"+decimal.format(sist.calcularEdad(planetasE[op])) +"\nTenga cuidado con su edad! La cantidad de tiempo que le toma a este planeta dar una vuelta es mayor a la del planeta Tierra \n" , "JUPITER", JOptionPane.QUESTION_MESSAGE, ima);
            	break;
              
              case 5:
                ima = new ImageIcon("saturno.jpg");
             	JOptionPane.showMessageDialog(null,"Su edad en la tierra es:"+ sist.traerE() + "\nSu edad en Saturno es:"+decimal.format(sist.calcularEdad(planetasE[op])) +"\nNo se preocupe si pareciese que esta volviendose mas joven de lo normal, esto sucede ya que este planeta le toma mas tiempo dar una revolucion\n" , "SATURNO", JOptionPane.QUESTION_MESSAGE, ima);
            	break;
              
              case 6:
                ima = new ImageIcon("urano.jpg");
             	JOptionPane.showMessageDialog(null,"Su edad en la tierra es:"+ sist.traerE() + "\nSu edad en Urano es:"+decimal.format(sist.calcularEdad(planetasE[op])) +"\nEsta muy joven usted! Probablemente suceda por la cantidad de tiempo que le toma a este planeta dar una revolucion \n" , "URANO", JOptionPane.QUESTION_MESSAGE, ima);
            	break;
              
              case 7:
                ima = new ImageIcon("neptuno.jpg");
             	JOptionPane.showMessageDialog(null,"Su edad en la tierra es:"+ sist.traerE() + "\nSu edad en Neptuno es:"+decimal.format(sist.calcularEdad(planetasE[op])) +"\nYa parece un recien nacido! Esto pasa porque su edad varia mucho con respecto a las revoluciones del planeta\n" , "NEPTUNO", JOptionPane.QUESTION_MESSAGE, ima);
           		break;
           }
        break;
      }
    }while(seleccion!=0);
    }
  }