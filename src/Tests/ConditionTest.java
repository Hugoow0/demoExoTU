package Tests;

import Entities.Condition;
import org.junit.experimental.categories.Categories;

import static org.junit.jupiter.api.Assertions.*;



class ConditionTest {

    private Condition uneCategorie1;
    private Condition estMembre1;
    private Condition unNbDeJours1;
    private Condition unEtat1;



    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void valider()
    {
        Condition.Valider(12);
        String expected = unNbDeJours1.toString();
        String actual = "12";
        assertEquals(expected,actual);
        // assert...


        Condition.Valider(34);
        expected = unNbDeJours1.toString();
        actual = "34";
        assertEquals(expected,actual);
        // assert...
    }

    @org.junit.jupiter.api.Test
    void calculerMontantMaxCategorie()
    {
        // 3 tests à faire car 3 caté
        Condition.CalculerMontantMaxCategorie("Livres");
        String expected = uneCategorie1.toString();
        String actual = "Livres";
        assertEquals(expected,actual);

        Condition.CalculerMontantMaxCategorie("Jouets");
        expected = uneCategorie1.toString();
        actual = "Jouets";
        assertEquals(expected,actual);

        Condition.CalculerMontantMaxCategorie("Informatique");
        expected = uneCategorie1.toString();
        actual = "Informatique";
        assertEquals(expected,actual);

    }

    @org.junit.jupiter.api.Test
    void calculerReducMembre()
    {
        // 2 tests : 1 si membre | 1 si pas membre
        Condition.CalculerReducMembre(true);
        String expected = estMembre1.toString();
        String actual = "true";
        assertEquals(expected,actual);

        Condition.CalculerReducMembre(false);
        expected = estMembre1.toString();
        actual = "false";
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void calculerReducEtat()
    {
        // 2 tests : abimé | très abimé
        Condition.CalculerReducEtat("Abimé");
        String expected = unEtat1.toString();
        String actual = "Abimé";
        assertEquals(expected,actual);

        Condition.CalculerReducEtat("Très abimé");
        expected = unEtat1.toString();
        actual = "Très abimé";
        assertEquals(expected,actual);

        Condition.CalculerReducEtat("Neuf");
        expected = unEtat1.toString();
        actual = "Neuf";
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void calculerMontantRembourse()
    {
        Condition.CalculerMontantRembourse(13,"Jouets",false,"Abimé",43);
    }
}