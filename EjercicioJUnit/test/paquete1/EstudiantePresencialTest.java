package paquete1;

import java.lang.reflect.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andreflores
 */
public class EstudiantePresencialTest {

    private EstudiantePresencial instance;

    public EstudiantePresencialTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new EstudiantePresencial();

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of establecerNumeroCreditos method, of class EstudiantePresencial.
     *
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testEstablecerNumeroCreditos() throws NoSuchFieldException,
            IllegalArgumentException,
            IllegalAccessException {
        System.out.println("establecerNombre");
        int num = 24;
        instance.establecerNumeroCreditos(num);
        Field field = instance.getClass().getDeclaredField("numeroCreditos");
        field.setAccessible(true);
        assertEquals(field.get(instance), 24);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of establecerCostoCredito method, of class EstudiantePresencial.
     *
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testEstablecerCostoCredito() throws NoSuchFieldException,
            IllegalArgumentException,
            IllegalAccessException {
        System.out.println("establecerCostoCredito");
        double valor = 45;
        instance.establecerCostoCredito(valor);
        Field field = instance.getClass().getDeclaredField("costoCredito");
        field.setAccessible(true);
        assertEquals(field.get(instance), 45.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularMatriculaPresencial method, of class
     * EstudiantePresencial.
     *
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testCalcularMatriculaPresencial() throws NoSuchFieldException,
            IllegalArgumentException,
            IllegalAccessException {
        System.out.println("calcularMatriculaPresencial");
        int num = 2;
        double valor = 45;
        instance.establecerNumeroCreditos(num);
        instance.establecerCostoCredito(valor);
        double matr = num * valor;
        Field field = instance.getClass().getDeclaredField("matriculaPresencial");
        field.setAccessible(true);
        assertEquals(field.get(instance), matr);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerNumeroCreditos() {
        System.out.println("obtenerNumeroCreditos");
        int pob = 0;
        instance.establecerNumeroCreditos(pob);
        assertEquals(instance.obtenerNumeroCreditos(), 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerCostoCredito() {
        System.out.println("obtenerCostoCredito");
        double costo = 45;
        instance.establecerCostoCredito(costo);
        assertEquals(instance.obtenerCostoCredito(), 45);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMatriculaPresencial method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerMatriculaPresencial() {
        System.out.println("obtenerMatriculaPresencial");
        int num = 2;
        double valor = 45;
        instance.establecerNumeroCreditos(num);
        instance.establecerCostoCredito(valor);
        double matr = num * valor;
        instance.calcularMatriculaPresencial();
        assertEquals(instance.obtenerMatriculaPresencial(), matr);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
