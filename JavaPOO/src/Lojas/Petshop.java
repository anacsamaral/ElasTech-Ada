package Lojas;

import Animais.Animal;
import Animais.Cachorro;

public class Petshop {
    public void darBanho(Animal animal){
        animal.setEstado("Limpo");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstado("Tosado");
    }

    public void deixarNoHotel(Animal animal){
        animal.setEstado("Com Saudades");
    }


}
