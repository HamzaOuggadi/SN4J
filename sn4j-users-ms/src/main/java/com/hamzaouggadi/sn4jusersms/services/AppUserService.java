package com.hamzaouggadi.sn4jusersms.services;

import com.hamzaouggadi.sn4jusersms.enums.AppUserRole;
import com.hamzaouggadi.sn4jusersms.models.business.AppUser;
import com.hamzaouggadi.sn4jusersms.models.web.AppUserWeb;

public interface AppUserService {

    void createNewNormalUser(AppUserWeb appUserWeb);

    void createNewModeratorUser(AppUserWeb appUserWeb);

    void createNewAdminUser(AppUserWeb appUserWeb);

    void updateUser(AppUserWeb appUserWeb, AppUserRole role);

    void deleteUser(AppUserWeb appUserWeb);

    AppUser getUserByUsername(String username);

    AppUser getUserByEmail(String email);

}
