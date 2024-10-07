import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void tearDownStreams() {
        System.setOut(originalOut);
    }

    @Test
    void casoUno() {
        Triangle.triangleType(200,85,75);

        String output = outContent.toString();
        assertTrue(output.contains("No es un triángulo"));
    }

    @Test
    void casoDos() {
        Triangle.triangleType(2,4,6);

        String output = outContent.toString();
        assertTrue(output.contains("No es un triángulo"));
    }

    @Test
    void casoTres() {
        Triangle.triangleType(200,200,200);

        String output = outContent.toString();
        assertTrue(output.contains("Equilátero"));
    }

    @Test
    void casoCuatro() {
        Triangle.triangleType(201,200,200);

        String output = outContent.toString();
        assertTrue(output.contains("El valor 201 no está dentro del rango permitido"));
    }

    @Test
    void casoCinco() {
        Triangle.triangleType(200,201,200);

        String output = outContent.toString();
        assertTrue(output.contains("El valor 201 no está dentro del rango permitido"));
    }

    @Test
    void casoSeis() {
        Triangle.triangleType(200,200,201);

        String output = outContent.toString();
        assertTrue(output.contains("El valor 201 no está dentro del rango permitido"));
    }

    @Test
    void casoSiete(){
        Triangle.triangleType(201,201,201);

        String output = outContent.toString();
        assertTrue(output.contains("El valor 201 no está dentro del rango permitido\nEl valor 201 no está dentro del rango permitido\nEl valor 201 no está dentro del rango permitido"));
    }

    @Test
    void casoOcho(){
        Triangle.triangleType(0,0,0);

        String output = outContent.toString();
        assertTrue(output.contains("El valor 0 no está dentro del rango permitido\nEl valor 0 no está dentro del rango permitido\nEl valor 0 no está dentro del rango permitido"));
    }

    @Test
    void casoNueve(){
        Triangle.triangleType(0,1,1);

        String output = outContent.toString();
        assertTrue(output.contains("El valor 0 no está dentro del rango permitido"));
    }

    @Test
    void casoDiez() {
        Triangle.triangleType(1,0,1);

        String output = outContent.toString();
        assertTrue(output.contains("El valor 0 no está dentro del rango permitido"));
    }

    @Test
    void casoOnce(){
        Triangle.triangleType(1,1,0);

        String output = outContent.toString();
        assertTrue(output.contains("El valor 0 no está dentro del rango permitido"));
    }

    @Test
    void casoDoce() {
        Triangle.triangleType(1,1,1);

        String output = outContent.toString();
        assertTrue(output.contains("Equilátero"));
    }

    @Test
    void casoTrece() {
        Triangle.triangleType(1,2,3);

        String output = outContent.toString();
        assertTrue(output.contains("No es un triángulo"));
    }

    @Test
    void casoCatorce(){
        Triangle.triangleType(2,1,3);

        String output = outContent.toString();
        assertTrue(output.contains("No es un triángulo"));
    }

    @Test
    void casoQuince(){
        Triangle.triangleType(3,1,2);

        String output = outContent.toString();
        assertTrue(output.contains("No es un triángulo"));
    }

    @Test
    void casoDieciseis(){
        Triangle.triangleType(3,2,1);

        String output = outContent.toString();
        assertTrue(output.contains("No es un triángulo"));
    }

    @Test
    void casoDieciocho() {
        Triangle.triangleType(4,2,6);

        String output = outContent.toString();
        assertTrue(output.contains("No es un triángulo"));
    }

    @Test
    void casoDiecinuve() {
        Triangle.triangleType(6,4,2);

        String output = outContent.toString();
        assertTrue(output.contains("No es un triángulo"));
    }

    @Test
    void casoVeinte(){
        Triangle.triangleType(6,2,6);

        String output = outContent.toString();
        assertTrue(output.contains("Isósceles"));
    }


}