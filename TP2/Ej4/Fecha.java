package Ej4;

public class Fecha {

    private int dia, mes, año;


    // funcion auxiliar, devuelve el ultimo dia del mes segun corresponda
    private int obtenerMes(){
        return switch(this.mes){
            case 1,3,5,7,8,10,12->31;
            case 4,6,9,11-> 30;
            case 2->28;
            default->1;
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

    // metodo para decrementar un dia
    public Fecha DecrementarDia(){
        int diaDec=this.dia-1;
        int mesDec=this.mes;
        int añoDec=this.año;

        //si al restar 1 dia, pasariamos al mes anterior, -1 al mes y settear el dia como el max
        if(diaDec<1){
            mesDec--;
            if(mesDec<1){
                mesDec=1;
                añoDec--;
            }

            // se setea el mes de la clase, osea this.mes, al mes actual luego de calcular la resta o de ir un año hacia atras
            this.mes=mesDec;
            diaDec=obtenerMes();
        }
        this.mes=mesDec;
        return new Fecha(diaDec, mesDec, añoDec);
    }

    // metodo para incrementar 1 mes
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

    // metodo para verificar si una fecha es mayor, menor o igual a otra
    public String compararFechas(Fecha fecha){
        String comparacionResultado="";
        
        // si año1 es meyor que año2 o año1 y año2 son iguales y mes1 es mayor que mes2 o si los anteriores son iguales y dia1 es mayor que dia2
        if(this.dia==fecha.dia && this.mes==fecha.mes && this.año==fecha.año){
            comparacionResultado="Son iguales";
        }else if(this.año>fecha.año || 
            this.año==fecha.año && this.mes>fecha.mes ||
        this.mes==fecha.mes && this.dia>fecha.dia){
            comparacionResultado="La primera fecha es mayor";
        }else{
            comparacionResultado="La segunda fecha es mayor";
        }
        return comparacionResultado;
    }


// metodo para calcular cuantos dias hay entre 2 fechas
public String calcularDiasEntreFechas(Fecha fecha){
    int diasContador=0;
    Fecha fechaMayor;
    Fecha fechaMenor;

    // compara la fecha1 con la fecha2, y de acuerdo con el string que retorne asigna la fecha mayor a la otra
    if(this.compararFechas(fecha).equals("La segunda fecha es mayor")){
        fechaMayor = fecha;
        fechaMenor= new Fecha(this.dia, this.mes, this.año);
    }else{
        fechaMayor=new Fecha(this.dia, this.mes, this.año);
        fechaMenor = fecha;
    }

    // while loop para calcular los dias entre las fechas
    // se convierte el metodo a string para poder comparar si son iguales
    while(!fechaMayor.toString().equals(fechaMenor.toString())){
        fechaMenor=fechaMenor.incrementarDia();
        diasContador++;
    }
    return "hay "+diasContador + " dia(s) entre ambas fechas";
    }

    // metodo para calcular una nueva fecha a partir de la suma de una fecha y dias
    public Fecha sumarFechaDias(int dias){

        return new Fecha(dias, dias, dias);
    }

    // metodo para imprimer con println la fecha
    @Override
    public String toString(){
        return this.dia+"/"+this.mes+"/"+this.año;
    }
}
