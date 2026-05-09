public class Main {
    static void main() {
    Fecha dia_1 = new Fecha("Enero", 1, 2023, DiaEscrito.LUNES, TipodeDia.FESTIVO);
        System.out.println("Dia 1: Mes[" +dia_1.getMes() +"] | Dia["
                + dia_1.getDia() +"][" + dia_1.getDiaEscrito() + "] | Año["
                + dia_1.getAnio() + "] | Tipo[" + dia_1.getTipodeDia() + "" + "]" );




    }
}
