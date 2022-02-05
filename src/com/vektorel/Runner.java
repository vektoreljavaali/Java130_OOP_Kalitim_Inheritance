package com.vektorel;

import com.vektorel.entities.Hizmetli;
import com.vektorel.entities.Mudur;
import com.vektorel.entities.Muhendis;

public class Runner {
    public static void main(String[] args) {

        Hizmetli hizmetli = new Hizmetli();
        hizmetli.ad = "Ayşe";

        Mudur mudur = new Mudur();
        mudur.ad = "Ahmet";

        Muhendis muhendis = new Muhendis();
        muhendis.maasVer("Elektrik Mühendisi");


    }
}
