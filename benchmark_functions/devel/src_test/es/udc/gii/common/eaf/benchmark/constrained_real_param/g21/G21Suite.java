/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package es.udc.gii.common.eaf.benchmark.constrained_real_param.g21;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author pilar
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    G21ConstraintFunction_g1Test.class,
            G21ConstraintFunction_h1Test.class,
            G21ConstraintFunction_h2Test.class,
            G21ConstraintFunction_h3Test.class,
            G21ConstraintFunction_h4Test.class,
            G21ConstraintFunction_h5Test.class,
            G21ObjectiveFunctionTest.class
})
public class G21Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

}