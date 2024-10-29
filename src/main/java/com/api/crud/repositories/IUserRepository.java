package com.api.crud.repositories;


import com.api.crud.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

//Clase que permite hacer query a una base de datos
@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {

}