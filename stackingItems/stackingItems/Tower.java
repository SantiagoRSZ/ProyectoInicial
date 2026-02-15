import java.util.ArrayList;            //Para usar Arraylist 
public class Tower
{
private int width;                   //Ancho
private int maxHeight;              //Alto
private ArrayList<Integer> cups;   //lista de tazas
private boolean ok;               //indica si lo ultimo realizado fue exitoso

//Crea la torre 
public Tower(int width, int maxHeight)
{
    this.width = width;                     //guarda el ancho recibido
    this.maxHeight = maxHeight;            //guarda la altura máxima
    this.cups = new ArrayList<Integer>(); //crea la lista vacía de tazas
    this.ok = true;                      //indica que todo está bien inicialmente
}

//Agrega una taza arriba de la torre
public void pushCup(int i)
{
    cups.add(i);        //agrega la taza al final
    ok = true;         //indica que la operación fue exitosa
}

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


//Valor actual de la variable ok si lo necesitamos
public boolean ok()
{
    return ok;
}



}