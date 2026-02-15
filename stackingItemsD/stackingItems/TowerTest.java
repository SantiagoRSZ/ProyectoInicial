import static org.junit.Assert.*;           //herramientas de JUnit
import org.junit.Test;                     //herramientas de JUnit

public class TowerTest
{
    
  // Prueba: crear una torre
@Test
public void shouldCreateTowerOkTrue()
{
    
    Tower t = new Tower(10, 20);
    assertTrue(t.ok());
}


// Prueba: agregar una taza a la torre
@Test
public void shouldPushCup()
{
    // Crea una nueva torre vacía
    Tower t = new Tower(10, 20);
    
    // Agrega la taza número 5 a la torre
    t.pushCup(5);
    
    // Verifica que la operación fue exitosa
    assertTrue(t.ok());
}


// Prueba: eliminar la taza de arriba 
@Test
public void shouldPopCup()
{
    // Crea una nueva torre
    Tower t = new Tower(10, 20);
    
    // Agrega dos tazas a la torre
    t.pushCup(5);
    t.pushCup(7);
    
    // Elimina la taza que está arriba (la última agregada, que es 7)
    t.popCup();
    
    // Verifica que la operación fue exitosa
    assertTrue(t.ok());
}


// Prueba: eliminar una taza específica (removeCup)
@Test
public void shouldRemoveCup()
{
    // Crea una nueva torre
    Tower t = new Tower(10, 20);
    
    // Agrega dos tazas
    t.pushCup(5);
    t.pushCup(7);
    
    // Elimina la taza número 5 específicamente
    t.removeCup(5);
    
    // Verifica que la operación fue exitosa
    assertTrue(t.ok());
}

// Prueba: popCup debe fallar si no hay tazas
@Test
public void shouldFailPopCupWhenEmpty()
{
    // Crea una torre vacía
    Tower t = new Tower(10, 20);

    // Intenta eliminar una taza cuando no hay ninguna
    t.popCup();

    // Verifica que la operación falló
    // ok() debería ser false
    assertFalse(t.ok());
}

// Prueba: removeCup debe fallar si la taza no existe
@Test
public void shouldFailRemoveCupWhenNotFound()
{
    // Crea torre y agrega una taza distinta
    Tower t = new Tower(10, 20);
    t.pushCup(5);

    // Intentar eliminar una taza que NO está
    t.removeCup(7);

    // Debe fallar → ok debe ser false
    assertFalse(t.ok());
}

}
