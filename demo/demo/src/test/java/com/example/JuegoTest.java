package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JuegoTest {

    private static Juego juego;
    
    @BeforeAll
    public void initializer () {
        this.juego = new Juego();
    }

    // Empates \\
    @Test
    public void testGanadorEmpatePiedra() {
        String resultado = juego.ganador("PIEDRA", "PIEDRA");
        assertEquals("EMPATE", resultado);
    }

    @Test
    public void testGanadorEmpatePapel() {
        String resultado = juego.ganador("PAPEL", "PAPEL");
        assertEquals("EMPATE", resultado);
    }


    @Test
    public void testGanadorEmpateTijera() {
        String resultado = juego.ganador("TIJERA", "TIJERA");
        assertEquals("EMPATE", resultado);
    }

    // Gana Jugador 2 \\

    @Test
    public void testGanadorJugador2Papel() {
        String resultado = juego.ganador("PIEDRA", "PAPEL");
        assertEquals("Gana el jugador 2", resultado);
    }

    @Test
    public void testGanadorJugador2Piedra() {
        String resultado = juego.ganador("TIJERA", "PIEDRA");
        assertEquals("Gana el jugador 2", resultado);
    }

    @Test
    public void testGanadorJugador2TIJERA() {
        String resultado = juego.ganador("PAPEL", "TIJERA");
        assertEquals("Gana el jugador 2", resultado);
    }

    // Gana Jugador 1 \\

    @Test
    public void testGanadorJugador1TIJERA() {
        String resultado = juego.ganador("TIJERA", "PAPEL");
        assertEquals("Gana el jugador 1", resultado); 
    }

    @Test
    public void testGanadorJugador1PIEDRA() {
        String resultado = juego.ganador("PIEDRA", "TIJERA"); // Está puesto al revés para forzar el fallo
        assertEquals("Gana el jugador 1", resultado); 
    }

    @Test
    public void testGanadorJugador1PAPEL() {
        String resultado = juego.ganador("PAPEL", "PIEDRA");
        assertEquals("Gana el jugador 1", resultado); 
    }


    // FALLO \\
    
    /*@Test
    public void testGanadorJugador1() {
        Juego juego = new Juego();
        String resultado = juego.ganador("TIJERA", "PIEDRA"); // Está puesto al revés para forzar el fallo
        assertEquals("Gana el jugador 1", resultado); 
    }

    */
}