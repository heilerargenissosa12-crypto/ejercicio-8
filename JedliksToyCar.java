package elonstoys;

/**
 * En algunas versiones de Exercism, "Elon's Toys" fue renombrado a "Jedlik's Toy Car"
 * (en honor a Ányos Jedlik, pionero de los motores eléctricos).
 * Esta clase hereda de ElonsToyCar para asegurar compatibilidad total con ambos nombres.
 */
public class JedliksToyCar extends ElonsToyCar {
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }
}
