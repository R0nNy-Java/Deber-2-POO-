public class Fecha {
    private String mes;
    private int dia;
    private int anio;
    private DiaEscrito diaEscrito;
    private TipodeDia tipodeDia;

    public Fecha(){
        this.mes="Sin Definir";
        this.dia=1;
        this.anio=2020;

    }
    public Fecha(String mes, int dia, int anio, DiaEscrito diaEscrito, TipodeDia tipodeDia){
        this.mes=mes;
        this.dia=dia;
        this.anio=anio;
        this.diaEscrito=diaEscrito;
        this.tipodeDia=tipodeDia;

    }


    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public DiaEscrito getDiaEscrito() {
        return diaEscrito;
    }

    public void setDiaEscrito(DiaEscrito diaEscrito) {
        this.diaEscrito = diaEscrito;
    }

    public TipodeDia getTipodeDia() {
        return tipodeDia;
    }

    public void setTipodeDia(TipodeDia tipodeDia) {
        this.tipodeDia = tipodeDia;
    }
}
