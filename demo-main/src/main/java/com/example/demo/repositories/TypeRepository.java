package com.example.demo.repositories;

import com.example.demo.entities.Type;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.function.Function;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {

}
