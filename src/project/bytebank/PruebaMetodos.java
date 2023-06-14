package project.bytebank;

public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();

        miCuenta.setSaldo(300);
        miCuenta.depositar(200);

        System.out.println(miCuenta.getSaldo());

        miCuenta.retirar(50);
        System.out.println(miCuenta.getSaldo());

        Cuenta cuentaDeJimena = new Cuenta();
        cuentaDeJimena.depositar(1000);
        System.out.println(cuentaDeJimena.getSaldo());

        boolean puedeTransferir = cuentaDeJimena.transferir(400,miCuenta);
        if (puedeTransferir) {
            System.out.println("Transferencia realizada con exito");
        } else {
            System.out.println("Transferencia fallida");
        }

        System.out.println(cuentaDeJimena.getSaldo());
        System.out.println(miCuenta.getSaldo());
    }
}