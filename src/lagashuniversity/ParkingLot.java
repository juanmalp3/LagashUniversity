
package lagashuniversity;


public interface ParkingLot {
    int PrecioPorDia = 78;
    
    int CantidadEstacionados();
    int EspaciosDisponibles();
    void IngresoDetectado();
    void EgresoDetectado();
    void FacturarEstadia(int PrecioPorDia);
    
}
