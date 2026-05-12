public enum TipodeDia {
    LABORAL ("Atrabajar"),
    FIN_DE_SEMANA ("Dia de descanso"),
    FESTIVO("Paseo");

    public String descripcion;

    private TipodeDia ( String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion (){
        return descripcion;
    }


}
