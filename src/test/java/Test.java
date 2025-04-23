import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
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

    private Main.Vehiculo vehiculo;

    @BeforeEach
    void setUp() {
        vehiculo = new Main.Vehiculo("Toyota", "Corolla", 180, 0);
    }
}

class SlowDownTest {

    @Test
    void testSlowDownWhenCarIsOff() {
        Main.Vehiculo vehiculo = new Main.Vehiculo("Toyota", "Corolla", 180, 0);
        vehiculo.slowDown(10);
        assertEquals(0, vehiculo.getVelocidadActual());
    }

    @Test
    void testSlowDownWithNegativeDecrement() {
        Main.Vehiculo vehiculo = new Main.Vehiculo("Toyota", "Corolla", 180, 0);
        vehiculo.stateCar(true);
        vehiculo.slowDown(-10);
        assertEquals(0, vehiculo.getVelocidadActual());
    }
}