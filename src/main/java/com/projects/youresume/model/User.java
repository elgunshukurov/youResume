package com.projects.youresume.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    long id;
    String name;
    String surname;
    String e_mail;
    String phone;
}
