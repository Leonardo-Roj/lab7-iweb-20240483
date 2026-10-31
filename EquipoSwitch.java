package pe.edu.pucp.iweb.lab7.beans;

/**
 * Ejercicio 2b: equipo de tipo 'SWITCH'.
 *
 * Soporte mensual (S/) = 0.015 x precio x cantidad
 */
public abstract class EquipoSwitch extends EquipoRed{ // TODO 2b: debe heredar de EquipoRed

    // TODO 2b: implementar calcularSoporteMensual()


    @Override
    public void calcularSoportMensual(double precio, int cantidad) {
        double soporte = precio*cantidad*0.015;
        System.out.println("Soporte: "+soporte);
    }
}
