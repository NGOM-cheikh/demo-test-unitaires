

package fr.digi.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilsTest {

    @Test
    public void testDistanceLevenshtein() {
        assertEquals(1, StringUtils.distanceLevenshtein("chat", "chats"));
        assertEquals(1, StringUtils.distanceLevenshtein("machins", "machine"));
        assertEquals(1, StringUtils.distanceLevenshtein("aviron", "avion"));
        assertEquals(2, StringUtils.distanceLevenshtein("distance", "instance"));
        assertEquals(2, StringUtils.distanceLevenshtein("Chien", "Chine"));
    }

    @Test
    public void testDistanceLevenshteinNull() {
        assertThrows(NullPointerException.class, () -> {
            StringUtils.distanceLevenshtein(null, "test");
        });
    }
}
