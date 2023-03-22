package Entities;

public class Condition
{
    private static int max = 0;
    private static double deducMembre = 0;
    private static double prix = 0;
    private static double deducEtat = 0;
    private static double montantF = 0;


    static final int nbJours = 30;
    public static boolean Valider(int UnNbDeJours)
    {
        if (nbJours > 30) {
            return false;
        }

        else {
            return true;
        }
    }


    public static int CalculerMontantMaxCategorie(String uneCategorie)
    {
        if (uneCategorie.equals("Livres")) {
            max = 30;
        }
        else if (uneCategorie.equals("Jouets")) {
            max = 50;
        }
        else if (uneCategorie.equals("Informatique")) {
            max = 1000;
        }

        return max;
    }


    public static double CalculerReducMembre( boolean estMembre)
    {

        if (!estMembre) {
            deducMembre = prix * 0.8;
        }

        return deducMembre;
    }


    public static double CalculerReducEtat( String unEtat)
    {
        if (unEtat.equals("Abimé") || unEtat.equals("Très abimé")) {
            deducEtat = prix * 0.7;
        }
        else if (unEtat.equals("Neuf")) {
            deducEtat = prix * 0.9;
        }

        return deducEtat;
    }


    public static double CalculerMontantRembourse(int unNb, String uneCateg, boolean estMembre, String unEtat, int unPrix)
    {
        montantF = prix - deducMembre - deducEtat;
        if (montantF > max) {
            montantF = max;
        }
        return montantF;
    }



}
