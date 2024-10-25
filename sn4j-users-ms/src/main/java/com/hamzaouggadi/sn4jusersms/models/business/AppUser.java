package com.hamzaouggadi.sn4jusersms.models.business;

import com.hamzaouggadi.sn4jusersms.enums.AppUserRole;
import com.hamzaouggadi.sn4jusersms.models.entities.AppUserEntity;
import com.hamzaouggadi.sn4jusersms.models.web.AppUserWeb;

import java.time.LocalDateTime;

public class AppUser {

    private Long id;

    private String email;

    private String username;

    private AppUserRole role;

    private LocalDateTime createdAt;

    private boolean isBanned;

    public static AppUser fromEntity(AppUserEntity appUserEntity) {
        AppUser appUser = new AppUser();

        appUser.setId(appUserEntity.getId());
        appUser.setEmail(appUserEntity.getEmail());
        appUser.setUsername(appUserEntity.getUsername());
        appUser.setRole(appUserEntity.getRole());
        appUser.setCreatedAt(appUserEntity.getCreatedAt());
        appUser.setBanned(appUserEntity.isBanned());

        return appUser;
    }

    public AppUser() {

    }

    public AppUser(Long id, String email, String username, AppUserRole role, LocalDateTime createdAt, boolean isBanned) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.role = role;
        this.createdAt = createdAt;
        this.isBanned = isBanned;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public AppUserRole getRole() {
        return role;
    }

    public void setRole(AppUserRole role) {
        this.role = role;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }
}
