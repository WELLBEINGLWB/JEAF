/*
* Copyright (C) 2010 Grupo Integrado de Ingeniería
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*/ 


/*
 * Tnk_Objective_1.java
 *
 * Created on 18 de diciembre de 2006, 18:04
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package es.udc.gii.common.eaf.benchmark.multiobjective.tnk;

import es.udc.gii.common.eaf.problem.objective.ObjectiveFunction;

/**
 * Tanaka, 1995
 * @author Grupo Integrado de Ingeniería (<a href="http://www.gii.udc.es">www.gii.udc.es</a>) 
 * @since 1.0
 */
public class Tnk_Objective_1 extends ObjectiveFunction {

    /** Creates a new instance of Tnk_Objective_1 */
    public Tnk_Objective_1() {
    }

    @Override
    public double evaluate(double[] values) {
        return Math.PI / 2 * values[0] + Math.PI / 2;
    }

    @Override
    public String toString() {
        return "Tnk_Objective_1";
    }

    @Override
    public void reset() {
    }
    
    @Override
    public int getDimension() {
        return 2;
    }    
}
