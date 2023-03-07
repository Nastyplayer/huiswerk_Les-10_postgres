package controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;




@RestController
    public class TelevisionController {

    @GetMapping("/televisions/{id}")
    public ResponseEntity<String> getTelevisions(@PathVariable int id){
        return new ResponseEntity<>(  "Televisions " + id,  HttpStatus.OK);
    }
}


