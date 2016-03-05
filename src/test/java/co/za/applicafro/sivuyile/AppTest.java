package co.za.applicafro.sivuyile;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    int actual = new App().add(1,6);
    int expected = 7;

    @Test
    public void testInt(){
        Assert.assertEquals(expected,actual);
    }
}
