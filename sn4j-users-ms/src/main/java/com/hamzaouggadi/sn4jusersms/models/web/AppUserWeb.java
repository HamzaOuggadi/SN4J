package com.hamzaouggadi.sn4jusersms.models.web;

import com.hamzaouggadi.sn4jusersms.enums.AppUserRole;
import com.hamzaouggadi.sn4jusersms.models.entities.AppUserEntity;

import java.time.LocalDateTime;

public class AppUserWeb {

    private String email;

    private String username;

    private String password;

    private LocalDateTime createdAt;

    /**
     * Maps an AppUserWeb to an AppUserEntity using the current instance fields
     * Used to persist a new user or update an existing one
     * @param role Role can be passed as to set which type of user
     * @return AppUserEntity
     */

    public AppUserEntity toEntity(AppUserRole role) {
        AppUserEntity appUserEntity = new AppUserEntity();

        appUserEntity.setEmail(this.email);
        appUserEntity.setUsername(this.username);
        appUserEntity.setPassword(this.password);
        appUserEntity.setCreatedAt(this.createdAt);
        appUserEntity.setBanned(false);
        appUserEntity.setRole(role);

        return appUserEntity;
    }

    public AppUserWeb() {

    }

    public AppUserWeb(String email, String username, String password, LocalDateTime createdAt) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
