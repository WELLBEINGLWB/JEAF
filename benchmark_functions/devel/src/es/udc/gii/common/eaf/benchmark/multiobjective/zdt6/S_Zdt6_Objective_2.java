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
 * S_Zdt6_Objective_2.java
 *
 * Created on November 20, 2007, 3:51 PM
 *
 */
package es.udc.gii.common.eaf.benchmark.multiobjective.zdt6;

import es.udc.gii.common.eaf.benchmark.multiobjective.*;

/**
 *
 * @author Grupo Integrado de Ingeniería (<a href="http://www.gii.udc.es">www.gii.udc.es</a>) 
 * @since 1.0
 */
public class S_Zdt6_Objective_2 extends ExtendedShiftedObjectiveFunction {

    /** Creates a new instance of S_Zdt6_Objective_2 */
    public S_Zdt6_Objective_2() {
    }

    /** Creates a new instance of S_Zdt6_Objective_2 */
    public S_Zdt6_Objective_2(int dimension) {
        super(dimension);
    }
    
    @Override
    public String toString() {
        return "S_Zdt6_Objective_2";
    }

    @Override
    public double evaluate(double[] x) {
        int nx = x.length;

        double g;
        double sum = 0, psum = 0;
        double[] z = new double[nx];
        double[] zz = new double[nx];
        double[] p = new double[nx];

        int i;

        // denormalize vector:
        for (i = 0; i < nx; i++) {
            x[i] = (bounds[1][i] - bounds[0][i]) / 2 * x[i] +
                    (bounds[1][i] + bounds[0][i]) / 2;
        }

        for (i = 0; i < nx; i++) {
            z[i] = x[i] - o[i];
        }

        if (z[0] >= 0) {
            zz[0] = z[0];
        } else {
            zz[0] = -lambda[0] * z[0];
        }

        for (i = 1; i < nx; i++) {
            p[i] = 0;
            zz[i] = z[i];
            if (z[i] < 0) {
                zz[i] = -lambda[i] * z[i];
                p[i] = -z[i] / d[i];
            }
            sum += zz[i];
            psum = Math.sqrt(Math.pow(psum, 2) + Math.pow(p[i], 2));
        }

        g = 1 + 9.0 * Math.pow(sum / (nx - 1), 0.25);

        return (g * (1 - Math.pow((1 - Math.exp(-4.0 * zz[0]) *
                Math.pow(Math.sin(6.0 * Math.PI * zz[0]), 6)) / g, 2)) + 1) * (2.0 / (1 + Math.exp(-psum)));
    }

    @Override
    public void reset() {
    }

    @Override
    protected String getDataFile() {
        return "S_ZDT6.dat";
    }

    @Override
    protected String getBoundsFile() {
        return "S_ZDT6_bound.dat";
    }
}
