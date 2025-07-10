/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integracion;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Integracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       
       Agente empleado = new Agente();
       
       empleado.setNombre(JOptionPane.showInputDialog("Digite su nombre: "));
       empleado.setId(JOptionPane.showInputDialog("Digite su cedula: "));
       empleado.setCodigo(JOptionPane.showInputDialog("Digite el codigo de la factura: "));
       String fecha = JOptionPane.showInputDialog("Digite del 1 al 12 el mes en el que se realizo la factura: ");
       empleado.setMes(Integer.parseInt(fecha));
       
       String mensajeFinal = JOptionPane.showInputDialog(empleado.toString());
       
       
 
       String lectura = JOptionPane.showInputDialog("Digite la cantidad de facturas que va a ingresar");
       int factura = Integer.parseInt(lectura);
               
        if (factura == 1 ) {
            
        Factura facturacion = new Factura();
        facturacion.setSucursal(JOptionPane.showInputDialog("Digite La sucursal en la que labora: "));
        facturacion.setVehiculo1(JOptionPane.showInputDialog("Tiene vehiculo propio?"));
        String lectura1 = JOptionPane.showInputDialog("Digite el monto de la factura; ");
        facturacion.setMonto1(Double.parseDouble(lectura1));
        facturacion.setElectronicos1(JOptionPane.showInputDialog("Esta factura contiene productos electronicos?"));
        facturacion.setAutomotrices1(JOptionPane.showInputDialog("Esta factura contiene productos automotrices?"));
        facturacion.setContruccion1(JOptionPane.showInputDialog("Esta factura contiene productos de contruccion?"));
        
        
            
        }
        if (factura == 2 ) {
            
        Factura facturacion = new Factura();
        facturacion.setSucursal(JOptionPane.showInputDialog("Digite La sucursal en la que labora: "));
        facturacion.setVehiculo1(JOptionPane.showInputDialog("Tiene vehiculo propio?"));
        String lectura1 = JOptionPane.showInputDialog("Digite el monto de la factura; ");
        facturacion.setMonto1(Double.parseDouble(lectura1));
        facturacion.setElectronicos1(JOptionPane.showInputDialog("Esta factura contiene productos electronicos?"));
        facturacion.setAutomotrices1(JOptionPane.showInputDialog("Esta factura contiene productos automotrices?"));
        facturacion.setContruccion1(JOptionPane.showInputDialog("Esta factura contiene productos de contruccion?"));
        
        String lectura2 = JOptionPane.showInputDialog("Digite el monto de la factura; ");
        facturacion.setMonto2(Double.parseDouble(lectura2));
        facturacion.setElectronicos2(JOptionPane.showInputDialog("Esta factura contiene productos electronicos?"));
        facturacion.setAutomotrices2(JOptionPane.showInputDialog("Esta factura contiene productos automotrices?"));
        facturacion.setContruccion2(JOptionPane.showInputDialog("Esta factura contiene productos de contruccion?"));
        
        mensajeFinal += facturacion.toString();
        
        JOptionPane.showMessageDialog(null, mensajeFinal );   
        }
        if (factura == 3 ) {
            
        Factura facturacion = new Factura();
        facturacion.setSucursal(JOptionPane.showInputDialog("Digite La sucursal en la que labora: "));
        facturacion.setVehiculo1(JOptionPane.showInputDialog("Tiene vehiculo propio?"));
        String lectura1 = JOptionPane.showInputDialog("Digite el monto de la factura; ");
        facturacion.setMonto1(Double.parseDouble(lectura1));
        facturacion.setElectronicos1(JOptionPane.showInputDialog("Esta factura contiene productos electronicos?"));
        facturacion.setAutomotrices1(JOptionPane.showInputDialog("Esta factura contiene productos automotrices?"));
        facturacion.setContruccion1(JOptionPane.showInputDialog("Esta factura contiene productos de contruccion?"));
        
        String lectura2 = JOptionPane.showInputDialog("Digite el monto de la factura; ");
        facturacion.setMonto2(Double.parseDouble(lectura2));
        facturacion.setElectronicos2(JOptionPane.showInputDialog("Esta factura contiene productos electronicos?"));
        facturacion.setAutomotrices2(JOptionPane.showInputDialog("Esta factura contiene productos automotrices?"));
        facturacion.setContruccion2(JOptionPane.showInputDialog("Esta factura contiene productos de contruccion?"));
        
        String lectura3 = JOptionPane.showInputDialog("Digite el monto de la factura; ");
        facturacion.setMonto3(Double.parseDouble(lectura3));
        facturacion.setElectronicos3(JOptionPane.showInputDialog("Esta factura contiene productos electronicos?"));
        facturacion.setAutomotrices3(JOptionPane.showInputDialog("Esta factura contiene productos automotrices?"));
        facturacion.setContruccion3(JOptionPane.showInputDialog("Esta factura contiene productos de contruccion?"));
        
        
        mensajeFinal += facturacion.toString();
        
        JOptionPane.showMessageDialog(null, mensajeFinal );   
        }
        
        if (factura == 4 ) {
            
        Factura facturacion = new Factura();
        facturacion.setSucursal(JOptionPane.showInputDialog("Digite La sucursal en la que labora: "));
        facturacion.setVehiculo1(JOptionPane.showInputDialog("Tiene vehiculo propio?"));
        String lectura1 = JOptionPane.showInputDialog("Digite el monto de la factura; ");
        facturacion.setMonto1(Double.parseDouble(lectura1));
        facturacion.setElectronicos1(JOptionPane.showInputDialog("Esta factura contiene productos electronicos?"));
        facturacion.setAutomotrices1(JOptionPane.showInputDialog("Esta factura contiene productos automotrices?"));
        facturacion.setContruccion1(JOptionPane.showInputDialog("Esta factura contiene productos de contruccion?"));
        
        String lectura2 = JOptionPane.showInputDialog("Digite el monto de la factura; ");
        facturacion.setMonto2(Double.parseDouble(lectura2));
        facturacion.setElectronicos2(JOptionPane.showInputDialog("Esta factura contiene productos electronicos?"));
        facturacion.setAutomotrices2(JOptionPane.showInputDialog("Esta factura contiene productos automotrices?"));
        facturacion.setContruccion2(JOptionPane.showInputDialog("Esta factura contiene productos de contruccion?"));
        
        String lectura3 = JOptionPane.showInputDialog("Digite el monto de la factura; ");
        facturacion.setMonto3(Double.parseDouble(lectura3));
        facturacion.setElectronicos3(JOptionPane.showInputDialog("Esta factura contiene productos electronicos?"));
        facturacion.setAutomotrices3(JOptionPane.showInputDialog("Esta factura contiene productos automotrices?"));
        facturacion.setContruccion3(JOptionPane.showInputDialog("Esta factura contiene productos de contruccion?"));
        
        String lectura4 = JOptionPane.showInputDialog("Digite el monto de la factura; ");
        facturacion.setMonto4(Double.parseDouble(lectura4));
        facturacion.setElectronicos4(JOptionPane.showInputDialog("Esta factura contiene productos electronicos?"));
        facturacion.setAutomotrices4(JOptionPane.showInputDialog("Esta factura contiene productos automotrices?"));
        facturacion.setContruccion4(JOptionPane.showInputDialog("Esta factura contiene productos de contruccion?"));
        
        
        mensajeFinal += facturacion.toString();
        
        JOptionPane.showMessageDialog(null, mensajeFinal );   
        }
       
       
       
      
    }
    
}
