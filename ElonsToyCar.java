package elonstoys;

/**
 * Ejercicio 8: Elon's Toys (también conocido como Jedlik's Toy Car)
 * Concepto: Classes / Constructors (Clases, estado interno, encapsulación y métodos)
 *
 * Modela un auto de juguete a control remoto con batería recargable
 * y pantalla LED que muestra la distancia recorrida y el nivel de batería.
 */
public class ElonsToyCar {

    private int batteryPercentage;
    private int distanceDrivenInMeters;

    /**
     * Constructor por defecto: auto nuevo con 100% de batería y 0 metros conducidos.
     */
    public ElonsToyCar() {
        this.batteryPercentage = 100;
        this.distanceDrivenInMeters = 0;
    }

    /**
     * Método estático de fábrica para comprar un auto nuevo.
     */
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    /**
     * Conduce el auto: avanza 20 metros y consume 1% de batería,
     * siempre que quede batería disponible.
     */
    public void drive() {
        if (this.batteryPercentage > 0) {
            this.distanceDrivenInMeters += 20;
            this.batteryPercentage -= 1;
        }
    }

    /**
     * Muestra la distancia recorrida en la pantalla LED.
     * Ejemplo: "Driven 0 meters", "Driven 20 meters"
     */
    public String distanceDisplay() {
        return "Driven " + this.distanceDrivenInMeters + " meters";
    }

    /**
     * Muestra el porcentaje de batería en la pantalla LED.
     * Ejemplo: "Battery at 100%", o "Battery empty" si llegó a 0%.
     */
    public String batteryDisplay() {
        if (this.batteryPercentage <= 0) {
            return "Battery empty";
        }
        return "Battery at " + this.batteryPercentage + "%";
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public int getDistanceDrivenInMeters() {
        return distanceDrivenInMeters;
    }
}
