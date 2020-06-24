package edu.utn.parcial.parcial2.controllers;

import edu.utn.parcial.parcial2.models.PhoneLineUser;
import edu.utn.parcial.parcial2.services.PhoneLineService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Api(tags = "controller")
@RequestMapping("/phone-lines")
public class PhoneLineController {

    private final PhoneLineService phoneLineService;

    @GetMapping("/{name}/user/")
    public ResponseEntity<PhoneLineUser[]> getPhoneLinesByUserName(@PathVariable(value = "name") String name){

        PhoneLineUser[] phoneLinesList = phoneLineService.getPhoneLinesByUserName(name);

        if (phoneLinesList == null){

            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }

        return ResponseEntity.ok(phoneLinesList);
    }
}
