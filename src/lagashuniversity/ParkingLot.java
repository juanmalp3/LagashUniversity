
package lagashuniversity;


public interface ParkingLot {
    int PrecioPorDia = 80; //Variable que contiene el precio de la estadía por día
    
    //Metodos utilizados en clase Estacionamiento
    int CantidadEstacionados();
    int EspaciosDisponibles();
    void IngresoDetectado();
    void EgresoDetectado();
    void FacturarEstadia(int PrecioPorDia);
    
}
