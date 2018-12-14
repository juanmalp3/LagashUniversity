
package lagashuniversity;

import javax.swing.JOptionPane;


public class Estacionamiento implements ParkingLot {

    int AutosEstacionados = 0; //Inicialización del Contador de Autos
    
    @Override
    //Metodo utilizado para consultar la cantidad de autos estacionados en el momento de la consulta
    public int CantidadEstacionados() {
        if (AutosEstacionados == 0){
            JOptionPane.showMessageDialog(null, "null");
        } else {
        JOptionPane.showMessageDialog(null, "Hay " + AutosEstacionados + " autos estacionados en este momento");
        }
        return AutosEstacionados;
    }

    @Override
    //Metodo utilizado para consultar la cantidad de estacionamientos disponibles
    //en el momento de la consulta
    public int EspaciosDisponibles() {
        JOptionPane.showMessageDialog(null, "Hay " + (100 - AutosEstacionados) + " estacionamientos disponibles" );
        return AutosEstacionados;
    }

    @Override
    //Metodo utilizado para ingresar al sistema la entrada de un vehículo
    //detectada por sensor
    public void IngresoDetectado() {
        if (AutosEstacionados < 100){
            AutosEstacionados = AutosEstacionados + 1;
            JOptionPane.showMessageDialog(null,"Un auto ha ingresado");
        }
        else{
            JOptionPane.showMessageDialog(null, "El estacionamiento está lleno");
        }
    }

    @Override
    //Metodo utilizado para ingresar al sistema la salida de un vehículo
    //detectada por sensor
    public void EgresoDetectado() {
        if (AutosEstacionados > 0){
            AutosEstacionados = AutosEstacionados - 1;
            JOptionPane.showMessageDialog(null,"Un auto ha salido");
        }
        else {
            JOptionPane.showMessageDialog(null,"No hay autos estacionados");
        }
    }

    @Override
    //Metodo que calcula la Facturación diaria en base a la cantidad de autos
    //estacionados a las 00hs del día.
    public void FacturarEstadia(int PrecioPorDia) {
        int Estadia = PrecioPorDia * AutosEstacionados;
        JOptionPane.showMessageDialog(null,"La factura total del día es de " + Estadia + " ARS");
        ServicioExterno.EnviarMail("Estadias a Cobrar", 
                                    "El monto total a cobrar por estadias es de "
                                    + Estadia, 
                                    "Encargado del Estacionamiento");
    }

}
