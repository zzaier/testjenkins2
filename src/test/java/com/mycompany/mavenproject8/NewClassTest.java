/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zaier
 */
public class NewClassTest {
    
    public NewClassTest() {
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

    @Test
    public void testSommeMethod() {
        int valeur1=5;
        int valeur2=7;
        int resultatReel=12;
        int resultatRetourne=NewClass.somme(valeur1, valeur2);
        assertEquals(resultatReel, resultatRetourne);        
    }
    
        @Test
    public void testSommeMethod1() {
        int valeur1=5;
        int valeur2=7;
        int resultatReel=11;
        int resultatRetourne=NewClass.somme(valeur1, valeur2);
        assertEquals(resultatReel, resultatRetourne);        
    }
    
    
    @Test
    public void testDifferenceMethod() {
                int valeur1=5;
        int valeur2=7;
        int resultatReel=-2;
        int resultatRetourne=NewClass.difference(valeur1, valeur2);
        assertEquals(resultatReel, resultatRetourne);
    }
    
        @Test
    public void testDifferenceMethod2() {
                int valeur1=5;
        int valeur2=7;
        int resultatReel=2;
        int resultatRetourne=NewClass.difference(valeur1, valeur2);
        assertEquals(resultatReel, resultatRetourne);
    }
    
    
}
