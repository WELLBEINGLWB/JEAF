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
 * G01ConstraintFunction_1.java
 *
 * Created on 27 de agosto de 2007, 19:36
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package es.udc.gii.common.eaf.benchmark.constrained_real_param.g16;

import es.udc.gii.common.eaf.problem.constraint.InequalityConstraint;
import java.util.List;

/**
 *
 * @author Grupo Integrado de Ingeniería (<a href="http://www.gii.udc.es">www.gii.udc.es</a>) 
 * @since 1.0
 */
public class G16ConstraintFunction_g4 extends InequalityConstraint {
    
    /** Creates a new instance of G01ConstraintFunction_1 */
    public G16ConstraintFunction_g4() {
    }
    
    public double evaluate(double[] values) {
        
        double constraintValue = Double.MAX_VALUE;
        double x1, x2, x3, x4, x5, c0, c1, c2, c3, c4, c5, c6, c7, c8, c16,
                y0, y1, y2, y3, y4, y5, y6, y7, y8;
        double[] norm_values;
        norm_values = G16Function.normalize(values);

        x1 = norm_values[0];
        x2 = norm_values[1];
        x3 = norm_values[2];
        x4 = norm_values[3];
        x5 = norm_values[4];
        y0 = x2 + x3 + 41.6;
        c0 = 0.024 * x4 - 4.62;
        y1 = 12.5 / c0 + 12.0;
        c1 = 0.0003535 * Math.pow(x1, 2.0) + 0.5311 * x1 +
                0.08705 * y1 * x1;
        c2 = 0.052 * x1 + 78.0 + 0.002377 * y1 * x1;
        y2 = c1 / c2;
        y3 = 19.0 * y2;
        c3 = 0.04782 * (x1 - y2) +
                0.1956 * Math.pow(x1 - y2, 2.0) / x2 +
                0.6376 * y3 + 1.594 * y2;
        c4 = 100 * x2;
        c5 = x1 - y2 - y3;
        c6 = 0.950 - c3 / c4;
        y4 = c5 * c6;
        y5 = x1 - y4 - y3 - y2;
        c7 = (y4 + y3) * 0.995;
        y6 = c7 / y0;
        y7 = c7 / 3798.0;
        c8 = y6 - 0.0663 * y6 / y7 - 0.3153;
        y8 = 96.82 / c8 + 0.321 * y0;
        c16 = y8 + x5;
        
        constraintValue = -62212.0 / c16 + 110.6 + y0;
        
        
        return constraintValue;
    }
    
    
}
