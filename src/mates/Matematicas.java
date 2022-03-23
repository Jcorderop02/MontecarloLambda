/*Copyright [2021] [Juan Cordero]
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

/**
 * Clase con varias implementaciones de algoritmos matemáticos
 *
 * @author Juan Cordero
 * @version 1.0 22/03/22
 */
package mates;

import java.util.Random;

public class Matematicas {

    /**
     * Método para generar aproximación a PI mediante expresiones Lambda
     *
     * @param pasos Numero de pasos a repetir
     * @return Numero PI aproximado
     */
    public static double generarPiLambda(long pasos) {
        Random random = new Random();
        Double acertar = (double) random.doubles().limit(pasos).filter(j -> Math.pow(j, 2) + Math.pow(Math.random(), 2) <= 1).count();

        return 4 * acertar / (double) pasos;
    }
}