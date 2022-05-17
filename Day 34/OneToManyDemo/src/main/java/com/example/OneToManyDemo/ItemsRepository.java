package com.example.OneToManyDemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository extends JpaRepository<Items,Integer>{

}
