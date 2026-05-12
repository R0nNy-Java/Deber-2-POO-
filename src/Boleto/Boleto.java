package Boleto;

public class Boleto {
    private String concierto;
    private double precio;
    private Jornada jornada;
    private TipoBoleto tipo;
    private Formato formato;

    public Boleto (){
        this.concierto="Sin Evento";
        this.precio=25.50;
        this.jornada=Jornada.MEDIODIA;
        this.tipo = TipoBoleto.GENERAL;
        this.formato = Formato.CODIGOBARRAS;
    }

    public Boleto(String concierto, double precio, Jornada jornada, TipoBoleto tipo, Formato formato) {
        this.concierto = concierto;
        this.precio = precio;
        this.jornada = jornada;
        this.tipo = tipo;
        this.formato = formato;
    }



    public String getConcierto() {
        return concierto;
    }

    public void setConcierto(String concierto) {
        this.concierto = concierto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }

    public TipoBoleto getTipo() {
        return tipo;
    }

    public void setTipo(TipoBoleto tipo) {
        this.tipo = tipo;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }
}
