/* 
 * Copyright 2019 User.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Casimiro Ondo Obiang
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Constantes
        final int MIN = 0;
        final int MAX = 4;
        final int MIN_PLANTA = 1;
        final int MAX_PLANTA = 10;
        //Bucle for para la cantidad de personas
        for (int i = MIN; i < MAX; i++) {
            //Variables
            int planta = 0;
            //Bucle
            do {
                try {
                    //Entrada datos
                    System.out.printf("Persona %d introduzca una planta del 1 al 10: ", i + 1);
                    planta = SCN.nextInt();
                    //Condiciones
                    if (planta > MAX_PLANTA || planta < MIN_PLANTA) {
                        System.out.printf("ERROR: Planta introducida incorrecta %n");
                    } else {
                        System.out.printf("La planta introducida es ...: %02d%n",
                                planta);
                    }
                    //Repite si la planta no existe
                } catch (Exception e) {
                    System.out.printf("ERROR: Dato incorrecto %n");
                } finally {
                    SCN.nextLine();
                }
            } while (planta > MAX_PLANTA || planta < MIN_PLANTA);
        }
    }
}