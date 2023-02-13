package com.example.domes.repository;

import com.example.domes.beans.Client;
import com.example.domes.beans.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {
}
