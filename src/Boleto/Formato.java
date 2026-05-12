package Boleto;

public enum Formato {
    QR ("Mas Verificable"),
    FISICO("Espera para revisar"),
    CODIGOBARRAS ("Ma Seguro Y verificable");

private String FormatoBol;
private Formato (String formatoBol){
    this.FormatoBol = formatoBol;
}

    public String getFormatoBol() {
        return FormatoBol;
    }

    public String DescFormato (){
    return FormatoBol;
}




}
