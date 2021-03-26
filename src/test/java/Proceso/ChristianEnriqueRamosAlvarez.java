/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;
import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Christian
 */
public class ChristianEnriqueRamosAlvarez {
    
    @InjectMocks
    private AsignarHorario asignarHorario;
    
    @Mock
    private Carrera carrera;
    
    @Mock
    private Horario horario;
    
    @Mock
    private RegistroAcademico registro;
    
    @Mock
    private Carrera carrera2;
    
    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void codigoHorarioTest() throws Exception{
        when(registro.getAnio()).thenReturn(2015);
        try {
            when(carrera.procesarCarrera()).thenReturn(1);
        } catch (Exception e) {}
        when(registro.cheequearCarnet()).thenReturn(true);
        
        try {
            asignarHorario = new AsignarHorario();
            horario = asignarHorario.generarHorario(carrera, registro);
            assertEquals(380, horario.getCodigoHorario());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    @BeforeEach
    public void setUp2(){
       MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void descriptionTest() throws Exception {
        when(registro.getAnio()).thenReturn(2021);
        try {
            when(carrera.procesarCarrera()).thenReturn(1);
        } catch (Exception e) {}
        when(registro.cheequearCarnet()).thenReturn(true);

        try {
            asignarHorario = new AsignarHorario();
            horario = asignacion.generarHorario(carrera,registro);
            assertEquals("Nocturno", horario.getDescripcion());
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
}
