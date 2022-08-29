/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Portfolio.RAD.Interface;

import com.Portfolio.RAD.Entity.Persona;
import java.util.List;




public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    
    //Guarda un Objeto de tipo pesona
    public void savePersona(Persona persona);
    
    //Eliminar Objeto(Usuario buscado por ID)
    public void deletePersona(Long id);
    
    // Buscar una persona por ID
    public Persona findPersona(Long id);
}
