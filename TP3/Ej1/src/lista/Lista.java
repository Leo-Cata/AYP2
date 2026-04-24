package lista;

//clase de tipo generica la cual tendra elementos en array
public class Lista<E>{
    private E[] lista;
    private int cantidadActual, maxCantidad;

    //constructor el cual require cant de eles y asigna a la lista, un objecto casteado a E[]
    public Lista(int maxCantidad){
        // a lista le asigna un array de tipo objecto caseado a E
        this.lista = (E[]) new Object[maxCantidad];
        this.maxCantidad = maxCantidad;
        this.cantidadActual = 0;
    }

    /* Agrega un E al final de la lista */
    public void addLast(E elemento) throws IndexOutOfBoundsException{
        // si el ultimo elemento es null, suma al contador
        if(this.lista[maxCantidad]==null){
            cantidadActual++;
        }
        //luego lo asigna
        this.lista[maxCantidad-1]=elemento;
    }

    /* Agrega un elemento a la lista en la posición p */
    public void addPos(E elemento, int posicion) throws IndexOutOfBoundsException{
        // si la posicion es mayor o igual a 0 y no es mayor que la cant maxima, agrega, sino tira error
        if(posicion >0 && posicion<=maxCantidad){
            //si el elemento en [posicion] es null, suma a la cantidad
            if(this.lista[posicion-1]==null){
                this.cantidadActual++;
            }
            lista[posicion-1] = elemento;
        }else{
            System.out.println("Fuera de rango");
        }
    }

        /* Retorna el elemento que se encuentra en p */
        public E getPos(int posicion) throws IndexOutOfBoundsException{
            //si la posicion es mayor o igual a 0 y, menor o igual a la max cantidad, devuelvo, si no null
        if(posicion >= 0 && posicion<=maxCantidad){
            return this.lista[posicion-1];
        }else{
            return null;
        }
    }

    /* Remueve el elemento E de la lista. Retorna null sino se encuentra*/
    public E remove(E elemento){
        //loopea hasta el final
        for (int i = 0; i < maxCantidad; i++) {
            //si encuentra element
            if(this.lista[i]!=null && this.lista[i].equals(elemento)){
                //al ultimo elemento, osea pos cantidadActual-1 lo setea como null y disminuye la cantidad
                this.lista[i]=null;
                this.cantidadActual--;
                //escribe por consola que se borro
                System.out.println(elemento+" fue removido");
                return elemento;
            }
        }
        return null;
    }

    /* Remueve el elemento que se encuentra en la posición p */
    public E removePos(int posicion) throws IndexOutOfBoundsException{
        // si la posicion es mayor a 0 y la posicion es menor a la cantidad maxima
        if(posicion>=0 && posicion <= maxCantidad){
            //al ultimo elemento, osea pos cantidadActual-1 lo setea como null y disminuye la cantidad
            this.lista[posicion-1]=null;
            this.cantidadActual--;
        }
        return null;
    }
}
