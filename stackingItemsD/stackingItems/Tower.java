import java.util.ArrayList;            //Para usar Arraylist 

/**
 * Clase Tower que representa una torre de tazas en el simulador stackingItems.
 * Permite crear la torre y manejar las tazas agregándolas, eliminándolas desde
 * la cima o eliminando una taza específica.
 * También permite consultar si la última operación fue exitosa.
 * 
 * Esta clase forma parte del ciclo 1 del proyecto, implementando create tower
 * y manage cup.
 */
public class Tower
{
private int width;                   //Ancho
private int maxHeight;              //Alto
private ArrayList<Integer> cups;   //lista de tazas
private boolean ok;               //indica si lo ultimo realizado fue exitoso

/**
 * Crea la torre con un ancho y una altura máxima.
 * Inicializa la lista de tazas vacía y establece el estado inicial como exitoso.
 * 
 * @param width ancho de la torre
 * @param maxHeight altura máxima permitida para la torre
 */
//Crea la torre 
public Tower(int width, int maxHeight)
{
    this.width = width;                     //guarda el ancho recibido
    this.maxHeight = maxHeight;            //guarda la altura máxima
    this.cups = new ArrayList<Integer>(); //crea la lista vacía de tazas
    this.ok = true;                      //indica que todo está bien inicialmente
}

/**
 * Agrega una taza a la parte superior de la torre.
 * La taza se agrega al final de la lista, representando la cima de la torre.
 * 
 * @param i número de la taza que se desea agregar
 */
//Agrega una taza arriba de la torre
public void pushCup(int i)
{
    cups.add(i);        //agrega la taza al final
    ok = true;         //indica que la operación fue exitosa
}

/**
 * Elimina la taza que se encuentra en la cima de la torre.
 * Si la torre está vacía, la operación falla.
 */
//Elimina la taza de arriba la ultima ingresada
public void popCup()
{
    if (cups.isEmpty())
    {
        ok = false;
    }
    else
    {
        cups.remove(cups.size() - 1);
        ok = true;
    }
}

/**
 * Elimina una taza específica de la torre según su número.
 * Si la taza no existe en la torre, la operación falla.
 * 
 * @param i número de la taza que se desea eliminar
 */
//Elimina una taza especifica
public void removeCup(int i)
{
    if (!cups.contains(i))
    {
        ok = false;
    }
    else
    {
        cups.remove((Integer) i);
        ok = true;
    }
}

/**
 * Devuelve el estado de la última operación realizada.
 * 
 * @return true si la operación fue exitosa, false si falló
 */
//Valor actual de la variable ok si lo necesitamos
public boolean ok()
{
    return ok;
}

}
