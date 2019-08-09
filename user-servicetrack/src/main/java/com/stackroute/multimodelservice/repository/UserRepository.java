package com.stackroute.multimodelservice.repository;

import com.stackroute.multimodelservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User,Integer>
{

}
