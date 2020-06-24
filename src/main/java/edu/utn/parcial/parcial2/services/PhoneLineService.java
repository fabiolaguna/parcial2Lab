package edu.utn.parcial.parcial2.services;

import edu.utn.parcial.parcial2.models.PhoneLineUser;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Service
public class PhoneLineService {

    private RestTemplate restTemplate;

    @PostConstruct
    private void init(){
        restTemplate = new RestTemplateBuilder()
                .build();
    }

    public PhoneLineUser[] getPhoneLinesByUserName(String name) {

        String url = "http://localhost:8081/phoneLines/" + name + "/user/";

        PhoneLineUser[] phoneLineUser = restTemplate.getForObject(url, PhoneLineUser[].class);

        return phoneLineUser;
    }

}
