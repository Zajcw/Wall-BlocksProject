package horus.zadanie.interfaces;

import java.util.List;
import java.util.Optional;

public interface Structure{
    //Zwraca dowolny element o podanym kolorze
    Optional findBlockByColor(String color);

    //Zwraca wszystkie elementy z danego materiału
    List findBlocksByMaterial(String material);

    //Zwraca liczbę wszystkich elementów tworzących strukturę
    int count();
}
