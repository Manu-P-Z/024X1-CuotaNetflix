/* 
 * Copyright 2019 Manu Portolés Zagalá.
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

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static final Random RND = new Random();

    public static void main(String[] args) {
        /**
         * constantes
         */
        final double CUOTA_NETFLIX = 30.0;
        final double CUOTA_MIN = 0.0;
        final double PERSONA2;

        /**
         * Variables
         */
        double persona1;

        /**
         * Núm aleatorios
         */
        persona1 = RND.nextDouble() * (CUOTA_NETFLIX - CUOTA_MIN) + CUOTA_MIN;

        /**
         * Núm Constantes
         */
        PERSONA2 = CUOTA_NETFLIX - persona1;

        /**
         * Mensaje
         */
        System.out.printf(Locale.ENGLISH, "%s %.2f€ %s %.2f€ %s %.0f€%n", "El amigo 1 paga", persona1, "y el amigo 2 paga", PERSONA2, "La cuota de netflix a pagar es", CUOTA_NETFLIX);

    }

}
