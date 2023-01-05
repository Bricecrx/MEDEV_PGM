/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package brice_crx.tp3;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author conra
 */
public class ImagePgmTest {
    
    public ImagePgmTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getWidth method, of class ImagePgm.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        ImagePgm instance = new ImagePgm(150,200);
        int expResult = 150;
        int result = instance.getWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWidth method, of class ImagePgm.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        int width = 0;
        ImagePgm instance = new ImagePgm(150,200);
        instance.setWidth(width);
    }

    /**
     * Test of getHeight method, of class ImagePgm.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        ImagePgm instance = new ImagePgm(150,200);
        int expResult = 200;
        int result = instance.getHeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHeight method, of class ImagePgm.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        int height = 0;
        ImagePgm instance = new ImagePgm(150,200);
        instance.setHeight(height);
    }

    /**
     * Test of getHighestGreyLevel method, of class ImagePgm.
     */
    @Test
    public void testGetHighestGreyLevel() {
        System.out.println("getHighestGreyLevel");
        ImagePgm instance = new ImagePgm(150,200);
        int expResult = 255;
        int result = instance.getHighestGreyLevel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHighestGreyLevel method, of class ImagePgm.
     */
    @Test
    public void testSetHighestGreyLevel() {
        System.out.println("setHighestGreyLevel");
        int highestGreyLevel = 12;
        ImagePgm instance = new ImagePgm(150,200);
        instance.setHighestGreyLevel(highestGreyLevel);
    }

//TODO: Préparer ces tests qui ne sont pas encore mis en place
//    /**
//     * Test of getImage method, of class ImagePgm.
//     */
//    @Test
//    public void testGetImage() {
//        System.out.println("getImage");
//        ImagePgm instance = new ImagePgm(150,200);
//        List<List<Integer>> expResult = new ImagePgm(150,200).getImage();
//        List<List<Integer>> result = instance.getImage();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//    //TODO: Finir tests à partir d'ici
//
//    /**
//     * Test of seuil method, of class ImagePgm.
//     */
//    @Test
//    public void testSeuil() {
//        System.out.println("seuil");
//        int seuilValue = 0;
//        ImagePgm instance = null;
//        instance.seuil(seuilValue);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of difference method, of class ImagePgm.
//     */
//    @Test
//    public void testDifference() {
//        System.out.println("difference");
//        ImagePgm img = null;
//        ImagePgm instance = null;
//        instance.difference(img);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of agrandissement method, of class ImagePgm.
//     */
//    @Test
//    public void testAgrandissement() {
//        System.out.println("agrandissement");
//        int multiplicateur = 0;
//        ImagePgm instance = null;
//        instance.agrandissement(multiplicateur);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of retrecissement method, of class ImagePgm.
//     */
//    @Test
//    public void testRetrecissement() {
//        System.out.println("retrecissement");
//        int diviseur = 0;
//        ImagePgm instance = null;
//        instance.retrecissement(diviseur);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPgmExtension method, of class ImagePgm.
//     */
//    @Test
//    public void testSetPgmExtension() {
//        System.out.println("setPgmExtension");
//        String url = "";
//        String expResult = "";
//        String result = ImagePgm.setPgmExtension(url);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
