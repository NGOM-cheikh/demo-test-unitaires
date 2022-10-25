

package fr.digi.immobilier.entites;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaisonTest {

    @Test
    public void testGetSurface() {
        Maison maison = new Maison(100);
        assertEquals(100, maison.getSurface());
    }

    @Test
    public void testSetSurface() {
        Maison maison = new Maison(100);
        maison.setSurface(150);
        assertEquals(150, maison.getSurface());
    }

    @Test
    public void testConstructeurAvecNull() {
        assertThrows(NullPointerException.class, () -> {
            new Maison(null);
        });
    }
}
