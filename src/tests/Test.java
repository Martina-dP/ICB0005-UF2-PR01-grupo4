import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StateCarTest {

    @Test
    void testStateCarEncender() {
        Main.Vehiculo vehiculo = new Main().new Vehiculo("Toyota", "Corolla", 180, 0);
        vehiculo.stateCar(true);
        assertTrue(vehiculo.isEncendido());
    }

    @Test
    void testStateCarApagar() {
        Main.Vehiculo vehiculo = new Main().new Vehiculo("Toyota", "Corolla", 180, 0);
        vehiculo.stateCar(true);
        vehiculo.stateCar(false);
        assertFalse(vehiculo.isEncendido());
        assertEquals(0, vehiculo.getVelocidadActual());
    }
}