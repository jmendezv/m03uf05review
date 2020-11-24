/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author pep
 * 
 * https://junit.org/junit5/docs/current/user-guide/
 * 
 */
@DisplayName("A simple test")
public class M03Uf05reviewTest {
    
    public M03Uf05reviewTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class M03Uf05review.
     */
    @Test
    @Timeout(value = 250)
    @Disabled
    public void testMain() {
        assertEquals(1.0, 1.0, 1.0E-3);
    }
    
}
