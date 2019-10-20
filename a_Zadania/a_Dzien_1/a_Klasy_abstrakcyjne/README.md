<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Klasy abstrakcyjne &ndash; zadania

Pamiętaj, aby rozwiązania do zadań umieszczać w odpowiednich plikach `java`, przygotowanych do zadań. 
 
### Zadania rozwiązywane z wykładowcą:

#### Zadanie 1

1. Stwórz klasę abstrakcyjną o nazwie `Vehicle`. Klasa ma posiadać pola:
    * private maxSpeed (`Integer`)
    * protected model (`String`)
- Utwórz gettery i settery.
- Utwórz konstruktor ustawiający pola    
    
2. Zdefiniuj metodę `toString`, zwracającą informacje w postaci:  
`Class : <nazwa klasy>, model: <nazwa modelu>, speed: <maksymalna prędkość>`.

3. Utwórz klasę `Car`, która dziedziczy po klasie `Vehicle`. Klasa ma zawierać dodatkowe pole typu `String` o nazwie `type`, 
reprezentującą typ (np. terenowy, SUV) oraz dodatkowe metody dostępowe (getter, setter).
Dodaj konstruktor umożliwiający ustawienie wszystkich atrybutów klasy. Wykorzystaj konstruktor klasy `Vehicle`.
- Sprawdź dostępność atrybutów (`maxSpeed` oraz `model`) z wykorzystaniem słowa kluczowego `this`.

5. Utwórz klasę `Train`, która dziedziczy po klasie `Vehicle`. 
6. Klasa ma zawierać dodatkowe pole typu int o nazwie `trackWidth`, reprezentującą szerokość toru (np. 600 – kolej wąskotorowa, 1435 – standardowa szerokość) oraz dodatkowe metody dostępowe (getter, setter).
Dodaj konstruktor umożliwiający ustawienie wszystkich atrybutów klasy. Wykorzystaj konstruktor klasy `Vehicle`.

7. W metodzie `main` klasy **Main1** utwórz tablicę dwóch elementów typu `Vehicle`.
8. Wstaw do tablicy elementy: pociąg oraz samochód, następnie w pętli wyświetl obiekty, wywołując metodę `toString`. 
9. Przetestuj metody w metodzie `main` klasy **Main1**.

-----------------------------------------------------------------------------

### Zadania rozwiązywane samodzielnie:

#### Zadanie 2

1. Stwórz klasę abstrakcyjną `Shape` zawierającą pola:
    * area - double (pole)
    * circuit - double (obwód)
    * color - String
2. Dodaj metody abstrakcyjne:
    * calculateArea - do obliczania powierzchni
    * calculateCircuit - do obliczania obwodu
3. Utwórz klasy pochodne `Rectangle`, `Square`, `Circle`, uzupełnij je o pola wymagane do obliczenia pola/obwodu oraz dodaj konstruktory ustawiające wszystkie pola.
4. Dodaj implementację metod w klasach pochodnych.
5. W pliku `Main3` w metodzie main utwórz listę `List<Shape> list = new ArrayList<>();`, następnie dodaj do niej po jednym obiekcie każdego pochodnego typu.
6. Wyświetl dane w postaci:
    ````html
    `Prostokąt o bokach 2 i 4 - pole = 8, obwód = 12`
    `Kwadrat o boku 2 - pole = 4, obwód = 8`
    `Koło o promieniu 3- pole = 28,27, obwód = 18,85`
    ````



**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**

<!-- Links -->
[template-method]: https://pl.wikipedia.org/wiki/Metoda_szablonowa_(wzorzec_projektowy)