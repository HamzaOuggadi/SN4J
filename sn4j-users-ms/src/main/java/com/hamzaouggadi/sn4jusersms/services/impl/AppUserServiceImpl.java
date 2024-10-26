package com.hamzaouggadi.sn4jusersms.services.impl;

import com.hamzaouggadi.sn4jusersms.enums.AppUserRole;
import com.hamzaouggadi.sn4jusersms.exceptions.AppUserException;
import com.hamzaouggadi.sn4jusersms.models.business.AppUser;
import com.hamzaouggadi.sn4jusersms.models.entities.AppUserEntity;
import com.hamzaouggadi.sn4jusersms.models.web.AppUserWeb;
import com.hamzaouggadi.sn4jusersms.repositories.AppUserRepository;
import com.hamzaouggadi.sn4jusersms.services.AppUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
public class AppUserServiceImpl implements AppUserService {

    private static final Logger log = LoggerFactory.getLogger(AppUserServiceImpl.class);

    private final AppUserRepository appUserRepository;

    private final MessageSource messageSource;

    public AppUserServiceImpl(AppUserRepository appUserRepository, MessageSource messageSource) {
        this.appUserRepository = appUserRepository;
        this.messageSource = messageSource;
    }

    @Override
    public void createNewNormalUser(AppUserWeb appUserWeb) {
        appUserRepository.save(appUserWeb.toEntity(AppUserRole.NORMAL));
    }

    @Override
    public void createNewModeratorUser(AppUserWeb appUserWeb) {
        appUserRepository.save(appUserWeb.toEntity(AppUserRole.MODERATOR));
    }

    @Override
    public void createNewAdminUser(AppUserWeb appUserWeb) {
        appUserRepository.save(appUserWeb.toEntity(AppUserRole.ADMIN));
    }

    @Override
    public void updateUser(AppUserWeb appUserWeb, AppUserRole role) {
        Optional<AppUserEntity> userEntityOptional = appUserRepository.findAppUserEntityByEmailIgnoreCase(appUserWeb.getEmail());
        if (userEntityOptional.isPresent()) {
            AppUserEntity appUserEntity = appUserWeb.toEntity(role);
            appUserEntity.setId(userEntityOptional.get().getId());
            appUserRepository.save(appUserEntity);
        } else {
            throw new AppUserException(
                    messageSource.getMessage(
                            "user.not.found",
                            new Object[]{appUserWeb.getEmail()},
                            Locale.getDefault()
                    ),
                    HttpStatus.NOT_FOUND
            );
        }
    }

    @Override
    public void deleteUser(AppUserWeb appUserWeb) {

    }

    @Override
    public AppUser getUserByUsername(String username) {
        return null;
    }

    @Override
    public AppUser getUserByEmail(String email) {
        return null;
    }
}
