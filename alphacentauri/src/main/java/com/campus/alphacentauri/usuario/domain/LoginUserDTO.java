package com.campus.alphacentauri.usuario.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LoginUserDTO {
    @JsonIgnore
    private String user;

    @JsonIgnore
    private String pass;

    private String token;

    public LoginUserDTO() {
    }

    public LoginUserDTO(String user, String pass, String token) {
        this.user = user;
        this.pass = pass;
        this.token = token;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
