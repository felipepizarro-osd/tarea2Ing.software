import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
//          si no registra en la base de datos se registra el nuevo arriendo
//          
//      Si no la tiene ver los numeros de dias ingresados
//          si es menor o igual a 28 dias actualizar la base de datos 
//      Si la reservacion es mas de 28 dias cancelar la reservacion

public class App {
    public static void main(String[] args) throws Exception {
            int year = 2021;
            Scanner Sc = new Scanner(System.in);
            System.out.println("Ingrese su nombre porfavor ! :");
            String persona = Sc.nextLine();
            System.out.println("Ingrese el numero de dias de su estancia ");
            //seleccionCasa(persona);
            int numeroDias = Sc.nextInt();
            
            arrienda(persona,numeroDias,year);
                   
    }
    public static void IngresarArriendo(){
        String DB = "jdbc:postgresql://localhost:5432/sunsetbandb";
        String user = "postgres";
        String password = "root";
        try{
            Connection conectate = DriverManager.getConnection(DB, user, password);
            JOptionPane.showMessageDialog(null, "Base de datos conectada con exito");
            //inyeccion  sql con el arriendo nuevo
            String query = "SELECT * FROM casa ;"; 
            Statement st = conectate.createStatement();
            ResultSet rs = st.executeQuery(query);

            if (rs.next()){
                System.out.println("id "+rs.getString(1)+" valor "+ rs.getString(2)+" Dueño "+ rs.getString(3));
            }
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, "intento de coneccion fallida revise las propiedades de coneion");
        }
        
    }
    public static boolean arrienda(String personArriendo,int dias, int año){
        if( dias <= 27 ){
            System.out.println("Ingreso de la casa dentro de lo permitido");
            //llamar a la query para mostrar las casas disponibles
            IngresarArriendo();
            return true;
        }else{
            if (dias >= 28 ){
                System.out.println("No puede escribir una incidencia de mas de 28 dias en un mismo año");
                
            }
        }
        return false;
        
        
        
    }

}
