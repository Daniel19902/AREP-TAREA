package edu.escuelaing.tarea.cotroller;


import edu.escuelaing.tarea.model.Selcios;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTarea {


    @GetMapping("/Selcios/{number}/{name}")
    public Selcios selcios(@PathVariable int number, @PathVariable String name){
        return new Selcios(number, name);
    }


}
