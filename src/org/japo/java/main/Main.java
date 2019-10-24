/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
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
import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    public static final Calendar CAL = Calendar.getInstance();

    public static void main(String[] args) {
        //Variables
        int diaSis;
        int mesSis;
        int anySis;
        int diaScn;
        int mesScn;
        int anyScn;
        //Cabecera
        System.out.println("Análisis Edad");
        System.out.println("=============");
        //Scanner
        try {
            //Dia
            System.out.print("Día nacimiento ....: ");
            diaScn = SCN.nextInt();
            //Mes
            System.out.print("Mes nacimiento ....: ");
            mesScn = SCN.nextInt();
            //Año
            System.out.print("Año nacimiento ....: ");
            anyScn = SCN.nextInt();
            //Fecha Actual
            System.out.printf("Fecha nacimiento ..: %02d/%02d/%d - Manual %n",
                                                        diaScn, mesScn, anyScn);
            //Salto de linea
            System.out.println("---");
            //Recoleta de datos del sistema
            diaSis = CAL.get(Calendar.DAY_OF_MONTH);
            mesSis = CAL.get(Calendar.MONTH) + 1;
            anySis = CAL.get(Calendar.YEAR);
            //Fecha Sistema
            System.out.printf("Fecha actual ......: %02d/%02d/%d - Sistema %n",
                                                        diaSis, mesSis, anySis);
            //Salto de linea
            System.out.println("---");
            //Mensaje y calculo para determinar si es mayor o no de edad
            System.out.printf("Mayoría de edad ...: %s%n", anySis - anyScn > 18
                    || anySis - anyScn == 18 && mesSis > mesScn
                    || anySis - anyScn == 18 && mesSis == mesScn
                    && diaSis >= diaScn ? "SI" : "NO");

        } catch (Exception e) {
            System.out.println("ERROR: Entrada incorrecta");
            //Mensaje por si error
        } finally {
            SCN.nextLine();
            //Borar buffer
        }
    }
}
