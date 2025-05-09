import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StateCarTest {

    @Test
    void testStateCarEncender() {
        Main.Vehiculo vehiculo = new Main.Vehiculo("Toyota", "Corolla", 180, 0);
        vehiculo.stateCar(true);
        assertTrue(vehiculo.isEncendido());
    }

    @Test
    void testStateCarApagar() {
        Main.Vehiculo vehiculo = new Main.Vehiculo("Toyota", "Corolla", 180, 0);
        vehiculo.stateCar(true);
        vehiculo.stateCar(false);
        assertFalse(vehiculo.isEncendido());
        assertEquals(0, vehiculo.getVelocidadActual());
    }
}

class SpeedUpTest {

        @Test
        void testSpeedUpWhenCarIsOff() {
            Main.Vehiculo vehiculo = new Main.Vehiculo("Toyota", "Corolla", 180, 0);
            vehiculo.speedUp(50);
            assertEquals(0, vehiculo.getVelocidadActual());
        }
    
        @Test
        void testSpeedUpWithNegativeIncrement() {
            Main.Vehiculo vehiculo = new Main.Vehiculo("Toyota", "Corolla", 180, 0);
            vehiculo.stateCar(true);
            vehiculo.speedUp(-10);
            assertEquals(0, vehiculo.getVelocidadActual());
        }
    
        @Test
        void testSpeedUpWithinMaxLimit() {
            Main.Vehiculo vehiculo = new Main.Vehiculo("Toyota", "Corolla", 180, 0);
            vehiculo.stateCar(true);
            vehiculo.speedUp(50);
            assertEquals(50, vehiculo.getVelocidadActual());
        }
    
        @Test
        void testSpeedUpExceedingMaxLimit() {
            Main.Vehiculo vehiculo = new Main.Vehiculo("Toyota", "Corolla", 180, 0);
            vehiculo.stateCar(true);
            vehiculo.speedUp(200);
            assertEquals(180, vehiculo.getVelocidadActual());
        }


}
class ReverseTest {
    @Test
    void testReverseWhenCarIsOff() {
        Main.Vehiculo vehiculo = new Main.Vehiculo("Toyota", "Corolla", 180, 0);
        vehiculo.reverse(10);
        assertEquals(0, vehiculo.getVelocidadActual());
    }
    @Test
    void testReverseWithZeroSpeed() {
        Main.Vehiculo vehiculo = new Main.Vehiculo("Toyota", "Corolla", 180, 0);
        vehiculo.stateCar(true);
        vehiculo.reverse(0);
        assertEquals(0, vehiculo.getVelocidadActual());
    }
    @Test
    void testReverseWhileMovingForward() {
        Main.Vehiculo vehiculo = new Main.Vehiculo("Toyota", "Corolla", 180, 0);
        vehiculo.stateCar(true);
        vehiculo.speedUp(5);
        vehiculo.reverse(5);
        assertEquals(5, vehiculo.getVelocidadActual());  // no debería permitir reversa
    }

    @Test
    void testReverseNormally() {
        Main.Vehiculo vehiculo = new Main.Vehiculo("Toyota", "Corolla", 180, 0);
        vehiculo.stateCar(true);
        vehiculo.reverse(10);
        assertEquals(-10, vehiculo.getVelocidadActual());
    }

    @Test
    void testReverseExceedingLimit() {
        Main.Vehiculo vehiculo = new Main.Vehiculo("Toyota", "Corolla", 180, -15);
        vehiculo.stateCar(true);
        vehiculo.reverse(30);
        assertEquals(-20, vehiculo.getVelocidadActual());
    }
}