package edu.utn.parcial.parcial2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneLineUser {

    private Integer id;

    private Integer idUser;

    private String name;

    private String phoneNumber;

    private String lineType;

    private String state;

}
