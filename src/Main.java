import Boleto.*;


public class Main {
    static void main() {
    Fecha dia_1 = new Fecha("Enero", 1, 2023, DiaEscrito.LUNES, TipodeDia.FESTIVO);
        System.out.println("Dia 1: Mes[" +dia_1.getMes() +"] | Dia["
                + dia_1.getDia() +"][" + dia_1.getDiaEscrito() + "] | Año["
                + dia_1.getAnio() + "] | Tipo[" + dia_1.getTipodeDia() + "" + "]" +
                " | Nota: [" + dia_1.getTipodeDia().getDescripcion() +"]");

        Boleto Boleto1 = new Boleto("Renegades", 50.00, Jornada.NOCHE,
                TipoBoleto.PLATINUM, Formato.CODIGOBARRAS);

        System.out.println(" \n BOLETO: Concierto[" + Boleto1.getConcierto() + "] | " +
                "Precio[" + Boleto1.getPrecio() + "] | " +
                "Jornada[" + Boleto1.getJornada() + "] | " +
                "Tipo[" + Boleto1.getTipo() + " " + Boleto1.getTipo().Desctipobol() + "] | " +
                "Formato[" + Boleto1.getFormato() + " " + Boleto1.getFormato().DescFormato() + "]");
    }
}
