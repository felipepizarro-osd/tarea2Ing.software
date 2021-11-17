import java.util.Scanner;

import javax.swing.JOptionPane;

import java.sql.*;

//hacer una inyeccion sql a la database
//ex: ver los registros de arriendos actuales
//sacar por consola una muestras de los puntos de arriendo sin ninguna reservacion
//crear una query de la reservacion escogida para el arriendo
//test  ingresar persona 
//1)buscar la persona en la base de datos 
//2)ver si la persona tiene una reservacion activa
//      Si tiene ver de cuantos dias es su reservacion
//          si tiene una reservacion de 28 dias anterior a la fecha de reservacion no pasa a registrar la nueva incidencia
//          si no registra en la base de datos el nuevo arriendo
//          
//      Si no la tiene ver los numeros de dias ingresados
//          si es menor o igual a 28 dias actualizar la base de datos 
//      Si la reservacion es mas de 28 dias cancelar la reservacion

public class App {
    public static void main(String[] args) throws Exception {
            String DB = "jdbc:postgresql://localhost:5432/sunsetbandb";
            String user = "postgres";
            String password = "root";
            try{
                Connection conectate = DriverManager.getConnection(DB, user, password);
                JOptionPane.showMessageDialog(null, "Base de datos conectada con exito");
                
            }catch(Exception error){
                JOptionPane.showMessageDialog(null, "intento de coneccion fallida revise las propiedades de coneccion");
            }
            /*
            Scanner Sc = new Scanner(System.in);
            System.out.println("Ingrese su nombre porfavor ! :");
            String persona = Sc.nextLine();
            System.out.println("Ingrese el numero de dias de su estancia ");
            //seleccionCasa(persona);
            int numeroDias = Sc.nextInt();
            System.out.println("Ingrese el año en que desea hacer la reservacion");
            String año = Sc.nextLine();
            //arrienda(persona,numeroDias,)
            */            
    }

}
