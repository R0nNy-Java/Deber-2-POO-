package Boleto;

public enum TipoBoleto {
    VIP ("Mayor Precio"),
    PLATINUM ("Mas Ambiente"),
    GENERAL ("Entrada Estandar"),
    PALCO ("Mas Barato");
    public String Tipobol;

    private TipoBoleto (String tipobol){
        this.Tipobol = tipobol;
    }

    public String getTipobol() {
        return Tipobol;
    }

    public String Desctipobol (){
        return  Tipobol;
    }
}
