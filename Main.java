package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MagazinFilme obj = new MagazinFilme();
        obj.meniu();
    }
}

class Film {

    private String nume;
    private int an;
    private double ratingIMDB;
    private String gen;
    private int stoc;


    Film(String nume, int an, double ratingIMDB, String gen){
        this.an = an;
        this.nume = nume;
        this.ratingIMDB = ratingIMDB;
        this.gen = gen;

    }


    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public double getRatingIMDB() {
        return ratingIMDB;
    }

    public void setRatingIMDB(double ratingIMDB) {
        this.ratingIMDB = ratingIMDB;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }


    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}

class MagazinFilme {
    void meniu(){
        Scanner scanner = new Scanner(System.in);
        int optiune = 0;
        List<Film> Filme = new ArrayList<Film>();
        List<Film> TopIMDB = new ArrayList<Film>();
        Film TheShawshankRedemption = new Film("TheShawshankRedemption",1994, 9.2, "Drama");
        Filme.add(TheShawshankRedemption);
        TopIMDB.add(TheShawshankRedemption);
        Film TheGodfather = new Film("TheGodfather", 1972, 9.1, "Drama");
        Filme.add(TheGodfather);
        TopIMDB.add(TheGodfather);
        Film TheGodfather2 = new Film("TheGodfather2", 1974, 9.0, "Drama");
        Filme.add(TheGodfather2);
        TopIMDB.add(TheGodfather2);
        Film TheDarkKnight = new Film("TheDarkKnight", 2008, 9.0, "Actiune");
        Filme.add(TheDarkKnight);
        TopIMDB.add(TheDarkKnight);
        Film TwelveAngryMen = new Film("TwelveAngryMen", 1957, 8.9, "Drama");
        Filme.add(TwelveAngryMen);
        TopIMDB.add(TwelveAngryMen);
        Film SchindlersList = new Film("SchindlersList", 1993, 8.9, "Istoric");
        Filme.add(SchindlersList);
        TopIMDB.add(SchindlersList);
        Film TLOFTRTheReturnOfTheKing = new Film("TLOFTRTheReturnOfTheKing", 2003, 8.9, "Aventura");
        Filme.add(TLOFTRTheReturnOfTheKing);
        TopIMDB.add(TLOFTRTheReturnOfTheKing);
        Film PulpFiction = new Film("PulpFiction", 1994, 8.8, "Thriller");
        Filme.add(PulpFiction);
        TopIMDB.add(PulpFiction);
        Film TheGoodTheBadAndTheUgly = new Film("TheGoodTheBadAndTheUgly", 1966, 8.8, "Western");
        Filme.add(TheGoodTheBadAndTheUgly);
        TopIMDB.add(TheGoodTheBadAndTheUgly);
        Film FightClub = new Film("FightClub", 1999, 8.8, "Thriller");
        Filme.add(FightClub);
        TopIMDB.add(FightClub);
        Film ForrestGump = new Film("ForrestGump", 1994, 8.8, "Drama");
        Filme.add(ForrestGump);
        Film Inception = new Film("Inception", 2010, 8.7, "Actiune");
        Filme.add(Inception);
        Film TheMatrix = new Film("TheMatrix",1999, 8.6, "Actiune");
        Filme.add(TheMatrix);
        Film Goodfellas = new Film("Goodfellas", 1990, 8.6, "Crima");
        Filme.add(Goodfellas);
        Film Se7en = new Film("Se7en", 1995, 8.6, "Crima");
        Filme.add(Se7en);
        Film TheSilenceOfTheLambs = new Film("TheSilenceOfTheLambs", 1991, 8.6, "Thriller");
        Filme.add(TheSilenceOfTheLambs);
        Film TheUsualSuspects = new Film("TheUsualSuspects", 1995, 8.5, "Thriller");
        Filme.add(TheUsualSuspects);


        System.out.println("Bine ati venit in magazinul nostru de inchirieri pentru filme!");
        System.out.println("\n");
        System.out.println("1. Inchiriati un film");
        System.out.println("2. Afisati top 10 IMDB");
        System.out.println("3. Cautati dupa gen");
        System.out.println("4. Cautati dupa anul lansarii");
        System.out.println("5. Lista filmelor disponibile");
        System.out.println("6. Iesire");
        System.out.println("\n");
        System.out.println("\n");
        do {
            System.out.println("Alegeti o optiune:");
            optiune = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n");

            switch(optiune){
                case 1:
                    System.out.println("Introduceti numele filmului pe care va doriti sa il inchiriati");
                    String movie = scanner.nextLine();
                    int p = 0;
                    for(Film x: Filme){
                        if(x.getNume().toLowerCase().equals(movie.toLowerCase())){
                            System.out.println("Filmul a fost inchiriat cu succes!");
                            p++;
                        }
                    }
                    if(p == 0){
                        System.out.println("Ne pare rau, filmul nu se afla in stoc!");
                        break;
                    }
                    break;
                case 2:
                    int i = 1;
                    for(Film x: TopIMDB){
                        System.out.println(i + ". " + x.getNume() + "   Nota: " + x.getRatingIMDB() + "   Gen: " + x.getGen());
                        i++;
                    }
                    System.out.println("\n");
                    System.out.println("Acesta este topul filmelor IMDB!");
                    break;
                case 3:
                    String genCautare = scanner.nextLine();
                    int j = 1;
                    for(Film x : Filme){
                        if(x.getGen().toLowerCase().equals(genCautare.toLowerCase())){
                            System.out.println(j + ". " + x.getNume());
                            j++;
                        }
                    }
                    if(j == 1){
                        System.out.println("Ne pare rau, nu avem in stoc filme de acest gen.");
                    }
                    break;

                case 4:
                    int anCautare = scanner.nextInt();
                    int k = 1;
                    for(Film x: Filme){
                        if(x.getAn() == anCautare){
                            System.out.println(k + ". " + x.getNume());
                            k++;
                        }
                    }
                    if(k == 0){
                        System.out.println("Ne pare rau, nu avem disponibil niciun film aparut in anul selectat.");
                    }
                    break;
                case 5:
                    int q = 1;
                    for(Film x:Filme){
                        System.out.println(q + ". " + "   " + x.getNume());
                        q++;
                    }
                    break;
                case 6:
                    System.out.println("***********************************************************************");
                    break;
                default:
                    System.out.println("Optiune invalida! Va rugam sa incercati din nou.");
                    break;
            }
        }while(optiune != 6);
        System.out.println("Va multumim!");
        System.out.println("Va mai asteptam!");
    }
}