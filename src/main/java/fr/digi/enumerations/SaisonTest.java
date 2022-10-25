
// TP Tests unitaires

    package fr.digi.enumerations;

    import org.junit.Test;

    import static org.junit.Assert.assertEquals;
    import static org.junit.Assert.assertThrows;

    public class SaisonTest {

        @Test
        public void testValueOfLibelleNominal() {
            Saison saison = Saison.valueOfLibelle("Hiver");
            assertEquals(Saison.HIVER, saison);
        }

        @Test
        public void testValueOfLibelleCasLimite() {
            assertThrows(IllegalArgumentException.class, () -> {
                Saison.valueOfLibelle("Inexistant");
            });
        }
    }
