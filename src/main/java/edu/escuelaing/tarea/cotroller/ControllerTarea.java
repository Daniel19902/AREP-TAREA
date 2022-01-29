package edu.escuelaing.tarea.cotroller;


import edu.escuelaing.tarea.data.Celsius;
import edu.escuelaing.tarea.data.Fahrenheit;
import edu.escuelaing.tarea.service.CelsiusService;
import edu.escuelaing.tarea.service.FahrenheitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTarea {

    @Autowired
    CelsiusService celsiusService;

    @Autowired
    FahrenheitService fahrenheitService;

    @GetMapping("/passToCelsiusOrFahrenheit/{number}/{type}")
    public ResponseEntity<?> passToCelsiusOrFahrenheit(@PathVariable int number, @PathVariable String type){
        if (type.equals("Celsius")){
            return new ResponseEntity<>(celsiusService.passToFahrenheit(new Celsius(number, type)), HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(fahrenheitService.passToCelsius(new Fahrenheit(number, type)), HttpStatus.BAD_REQUEST);
    }


}
