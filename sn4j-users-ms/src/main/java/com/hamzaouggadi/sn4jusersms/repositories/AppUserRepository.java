package com.hamzaouggadi.sn4jusersms.repositories;

import com.hamzaouggadi.sn4jusersms.models.entities.AppUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUserEntity, Long> {

    Optional<AppUserEntity> findAppUserEntityByEmailIgnoreCase(String email);

}
