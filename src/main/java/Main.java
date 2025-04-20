public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Vehiculo miVehiculo = new Vehiculo("Toyota", "Corolla", 180, 0);
        miVehiculo.stateCar(true); // Enciende
        miVehiculo.stateCar(false); // Apaga
        miVehiculo.speedUp(30);  // Acelera a 30
        miVehiculo.speedUp(160); // Llega al máximo (180)
        miVehiculo.speedUp(10); // No permite acelerar estando apagado
        miVehiculo.reverse(5);
    }

    static class Vehiculo {
        private String marca;
        private String modelo;
        private int velocidad_maxima;
        private int velocidad_minima;
        private int velocidadActual;
        private boolean encendido;
        private boolean necesitaRepostar;

        public Vehiculo(String marca, String modelo, int velocidad_maxima, int velocidad_minima) {
            this.marca = marca;
            this.modelo = modelo;
            this.velocidad_maxima = velocidad_maxima;
            this.velocidad_minima = velocidad_minima;
            this.velocidadActual = 0;
            this.encendido = false;
            this.necesitaRepostar = false;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getVelocidad_maxima() {
            return velocidad_maxima;
        }

        public void setVelocidad_maxima(int velocidad_maxima) {
            this.velocidad_maxima = velocidad_maxima;
        }

        public int getVelocidad_minima() {
            return velocidad_minima;
        }

        public void setVelocidad_minima(int velocidad_minima) {
            this.velocidad_minima = velocidad_minima;
        }

        public int getVelocidadActual() {
            return velocidadActual;
        }

        public void setVelocidadActual(int velocidadActual) {
            this.velocidadActual = velocidadActual;
        }

        public boolean isEncendido() {
            return encendido;
        }

        public void setEncendido(boolean encendido) {
            this.encendido = encendido;
        }

        public boolean isNecesitaRepostar() {
            return necesitaRepostar;
        }

        public void setNecesitaRepostar(boolean necesitaRepostar) {
            this.necesitaRepostar = necesitaRepostar;
        }

        public void stateCar(boolean encender) {
            if (encender) {
                this.encendido = true;
                System.out.println("Vehículo encendido.");
            } else {
                this.encendido = false;
                velocidadActual = 0;
                System.out.println("Vehículo apagado.");
            }
        }

        public void speedUp(int incremento) {
            if (encendido == false) {
                System.out.println("No se puede acelerar. El vehículo está apagado.");
                return;
            }

            if (incremento <= 0) {
                System.out.println("El incremento debe ser mayor a cero.");
                return;
            }

            velocidadActual += incremento;

            if (velocidadActual > velocidad_maxima) {
                velocidadActual = velocidad_maxima;
                System.out.println("¡Has alcanzado la velocidad máxima permitida! Velocidad actual: " + velocidadActual + " km/h");
            } else {
                System.out.println("Acelerando... Velocidad actual: " + velocidadActual + " km/h");
            }
        }

        public void reverse(int velocidad) {
            if (!encendido) {
                System.out.println("No se puede retrodecer. El vehículo está apagado.");
                return;
            }

            if (velocidad <= 0) {
                System.out.println("La velocidad para retrodecer debe ser mayor a cero.");
                return;
            }

            if (velocidadActual > 0) {
                System.out.println("No puedes ir en reversa mientras estás avanzando.");
                return;
            }
            velocidadActual -= velocidad;

            int nuevaVelocidad = velocidadActual - velocidad;
            int limiteReverse = -20;

            if (nuevaVelocidad < limiteReverse) {
                velocidadActual = limiteReverse;
                System.out.println("Has alcanzado la velocidad máxima en reversa: " + velocidadActual + " km/h");
            } else {
                velocidadActual = nuevaVelocidad;
                System.out.println("Retrocediendo... Velocidad actual: " + velocidadActual + " km/h");
            }
        }
        
        public void slowDown(int decremento) {

        }

        @Override
        public String toString() {
            return "Vehiculo{" +
                    "marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", encendido=" + encendido +
                    ", velocidadActual=" + velocidadActual +
                    ", necesitaRepostar=" + necesitaRepostar +
                    '}';
        }
    }
}