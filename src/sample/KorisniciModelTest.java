
package sample;

import javafx.collections.ObservableList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorisniciModelTest {

    private static KorisniciModel model = null;


    @BeforeAll
    static void setup() {
        model = new KorisniciModel();
        model.napuni();
    }

    @Test
    void newKorisnik() {
        ObservableList<Korisnik> novi = model.getKorisnik();
        novi.add(new Korisnik("semso", "semsic", "mail", "asdas", "sadas"));
        assertEquals(5, model.getKorisnik().size());
    }

}