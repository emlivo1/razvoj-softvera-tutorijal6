package sample;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class KorisniciModel {

    private ObservableList<Korisnik> korisnik;
    private SimpleObjectProperty<Korisnik> trenutniKorisnik = new SimpleObjectProperty<Korisnik>();

    KorisniciModel() {
        korisnik = FXCollections.observableArrayList();
    }


    ObservableList<Korisnik> getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(ObservableList<Korisnik> korisnik) {
        this.korisnik = korisnik;
    }

    Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    void setTrenutniKorisnik(Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }

    void dodajKorisnika(){
        korisnik.add(new Korisnik());
    }

    void napuni (){
        korisnik.add(new Korisnik( "Vedran" , "Ljubovic" , " vljubovic1@etf.unsa.ba" , "vljubovic1", "password"));
        korisnik.add(new Korisnik( "Tarik" , "Sijarcic" , " tsijarcic1@etf.unsa.ba" , "tsijarcic", "passw"));
        korisnik.add(new Korisnik( "Emina" , "Mlivo" , " emlivo1@etf.unsa.ba" , "emlivo", "sifra"));
    }



}