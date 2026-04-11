package Ej4;

public class Fecha {

    private int dia, mes, año;

    private int obtenerMes(){
        return switch(this.mes){
            case 1,3,5,7,8,10,12->31;
            case 4,6,9,11-> 30;
            case 2->28;
            default->0;
        };
    }
    public Fecha(int dia, int mes, int año) {
        this.mes=mes;
        this.año = año;

        if(dia<1 || dia > obtenerMes() ||mes > 12 || mes<1){
            System.out.println("Fechas invalidas");
            this.dia=1;
            this.mes=1;
            this.año=2000;
        }else{
            this.dia=dia;
        }
    }

    // metodo para incrementar un dia
    public Fecha incrementarDia(){
        int diaInc=this.dia+1;
        int mesInc=this.mes;
        int añoInc=this.año;
        
        // cuando se pasa de mes, pone el dia como 1 y avanza el mes, lo mismo con los meses
        if(diaInc>obtenerMes()){
            diaInc = 1;
            mesInc++;
        }
        if(mesInc>12){
            mesInc=1;
            añoInc++;
        }

        return new Fecha(diaInc, mesInc, añoInc);
    };

    public Fecha IncrementarMes(){
        int diaInc=this.dia;
        int mesInc=this.mes+1;
        int añoInc=this.año;

        // cuando se incrementa un mes y se pasa de dic, suma un año y setea el mes a enero
        if(mesInc>12){
            mesInc=1;
            añoInc=this.año+1;
        }

        return new Fecha(diaInc, mesInc, añoInc);
    }
    // metodo para imprimer con println la fecha
    @Override
    public String toString(){
        return this.dia+"/"+this.mes+"/"+this.año;
    }
}
