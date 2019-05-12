package com.sda.algorytmy;

import java.util.Scanner;

/**
 Średnia arytmetyczna jest to iloraz sumynliczb in.
 Możemy ją zapisać za pomocą ułamka:By obliczyć średnią najpierw tworzymy zmiennawyniki przypisujemy jej wartość 0.
 Następnie wczytujemyn, czyli ilość liczb w ciągu. Następnie wskakujemy w pętle,
 sprawdzającą czy zmienna pomocniczai(ilość obiegów) jest mniejsza odn.
 Jeżeli warunek został spełniony, to wczytujemy kolejną liczbę i dodajemy ją dowynik.
 W innym przypadku dzielimywynikprzezni wypisujemy go.
 Pseudokod ma zatem następującą postać:
 1.Wczytaj n.
 2.Utwórz zmienną Wyniki nadaj jej wartość 0.
 3.Utwórz zmiennaii nadaj jej wartość 0.
 4.Dopókii<nwczytaja. Do zmiennej Wynik przypisz jej sumę za. Doidodaj 1.
 5.Do zmiennejWynikprzypisz ilorazWynikin.
 6.WypiszWynik
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int wynik = 0;
        for (int i =0; i<n; i++){
            int a = scanner.nextInt();
             wynik = wynik + a;


        }
        wynik = wynik / n;
        System.out.println(wynik);

    }
}
