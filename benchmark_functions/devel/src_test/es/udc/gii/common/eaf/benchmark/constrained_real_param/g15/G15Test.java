/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package es.udc.gii.common.eaf.benchmark.constrained_real_param.g15;

/**
 *
 * @author pilar
 */
public class G15Test {

    /**
     * 0 ≤ xi ≤ 10 (i = 1, .., 3)
     * @param values
     */
    public static void normalize(double[] values) {

        for (int i = 0; i<values.length; i++) {
            values[i] = (values[i]/5.0) - 1.0;
        }


    }

}
