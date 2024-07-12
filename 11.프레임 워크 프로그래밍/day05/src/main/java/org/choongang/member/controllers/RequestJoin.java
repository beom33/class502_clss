package org.choongang.member.controllers;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    private String userName;
    //private String[] hobby;
    //private Set<String> hobby;
    private  String hobby;
   // private List<String> hobby;
    private boolean agree;

    private Address addr;
}
