public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    class Vehiculo {
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