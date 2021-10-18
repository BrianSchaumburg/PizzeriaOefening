import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaTest {
    Pizza testPizza;
    @Before
    public void setUp() throws Exception {
        testPizza = new Pizza("pepperoni", 20, false);
    }



    @Test(expected = NullPointerException.class)
    public void testBeschrijving()
    {
        testPizza = new Pizza("", 20,false);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testPrijsBovenToegelaten()
    {
        testPizza = new Pizza("Pepperoni", 22,false);

    }

    @Test(expected =IllegalArgumentException.class)
    public void testPrijsOnderToegelaten()
    {
        testPizza = new Pizza("Pepperoni", 1, false);
    }
    @Test(expected = NullPointerException.class)
    public void testLeegIngrediënt()
    {
        testPizza.voegIngrediëntToe("");
    }
    @Test
    public void testVoegIngredientToe()
    {
        testPizza.voegIngrediëntToe("Tomaat");
        testPizza.voegIngrediëntToe("Salami");
        testPizza.voegIngrediëntToe("kaas");

    }
    @Test(expected = IllegalArgumentException.class)
    public void testVoegIngrediëntToeTeveel()
    {this.testVoegIngredientToe();
        testPizza.voegIngrediëntToe("teveel");

    }
    @Test(expected =IllegalArgumentException.class)
   public void testVoegDubbelIngrediëntToe()

    {
        testPizza.voegIngrediëntToe("Salami");
        testPizza.voegIngrediëntToe("Salami");
    }

}