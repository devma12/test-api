package com.example.testapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PojoRepository extends JpaRepository<PojoEntity, Long> {

    Optional<PojoEntity> findById(long pojoId);

}
