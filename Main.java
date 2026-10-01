package elonstoys;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  Ejercicio 8: Elon's Toys (Classes / State)");
        System.out.println("==================================================");

        ElonsToyCar car = ElonsToyCar.buy();

        // 1. Estado inicial
        System.out.println("1. Estado inicial:");
        System.out.println("   Distancia: " + car.distanceDisplay() + " (Esperado: Driven 0 meters)");
        System.out.println("   Bateria:   " + car.batteryDisplay() + " (Esperado: Battery at 100%)");

        // 2. Conducir dos veces (40 metros, 98% batería)
        car.drive();
        car.drive();
        System.out.println("\n2. Tras conducir dos veces:");
        System.out.println("   Distancia: " + car.distanceDisplay() + " (Esperado: Driven 40 meters)");
        System.out.println("   Bateria:   " + car.batteryDisplay() + " (Esperado: Battery at 98%)");

        // 3. Conducir hasta agotar batería
        for (int i = 0; i < 100; i++) {
            car.drive();
        }
        System.out.println("\n3. Tras agotar la bateria:");
        System.out.println("   Distancia: " + car.distanceDisplay() + " (Esperado: Driven 2000 meters)");
        System.out.println("   Bateria:   " + car.batteryDisplay() + " (Esperado: Battery empty)");

        // 4. Conducir cuando ya está vacío (no debe avanzar más)
        car.drive();
        System.out.println("   Intento extra con bateria vacia: " + car.distanceDisplay());

        boolean ok = car.distanceDisplay().equals("Driven 2000 meters") &&
                     car.batteryDisplay().equals("Battery empty");

        System.out.println("\n[RESULTADO]: " + (ok ? "TODAS LAS PRUEBAS PASARON EXITOSAMENTE" : "ERROR EN LAS PRUEBAS"));
        System.out.println("==================================================\n");
    }
}
