package project.bytebank;

public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(22);
        //cuenta.saldo(200);
        cuenta.retirar(300);
        //cuenta.setAgencia(22);

        //cuenta.saldo(cuenta.getSaldo() - 300);
        System.out.println(cuenta.getSaldo());
    }
}
