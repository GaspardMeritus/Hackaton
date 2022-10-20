package com.demo.entity;

import javax.persistence.*;



@Entity
@Table(name = "LOGIN")
public class LoginEntity {

    @Id
    @Column(name = "LOGIN_ID" , nullable = false)
    private  int loginId;

    @Column(name = "PASSWORD", nullable = false)
    private  String loginPassword;

    public  LoginEntity (){ }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String password) {
        this.loginPassword = password;
    }

    @Override
    public String toString() {
        return "LoginEntity{" +
                "loginId='" + loginId + '\'' +
                ", password='" + loginPassword + '\'' +
                '}';
    }
}
