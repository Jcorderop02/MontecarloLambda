/**
 * Copyright [2022] [Juan Cordero]
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */

package aplicacion;

import mates.*;

/**
 * Se encarga de imprimir por pantalla una aproximación del número Pi accediendo al método generarNúmeroPi
 *
 * @author Juan Cordero
 * @version 1.0 22/03/22
 */
public class Principal {
    public static void main(String[] args) {
        try {
            System.out.println("El número PI es " + Matematicas.generarPiLambda(Long.parseLong(args[0])));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("-El número de parámetros introducidos no es correcto.");
        }
    }
}