package com.sdacademy.main;

import com.sdacademy.model.*; //import all public class from respective package
import java.util.Scanner;  // import the class given

import static com.sdacademy.model.Animal.*; // import all static methods
//from Animal class from package ...
import static com.sdacademy.model.Animal.getNrAnimale; //import the static given method

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nrPicioare= scanner.nextInt();
        System.out.println(getNrAnimale());
        Animal animal =new Animal("terestru",nrPicioare,true);
        System.out.println(Animal.getNrAnimale());
        Animal animal2 =new Animal("acvatic",nrPicioare,false);
        System.out.println(Animal.getNrAnimale());
        animal2.merge();
    }

}
