package com.example.democrudmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.democrudmongo.model.DetalleVentas;

@Repository
public interface DetalleVentasRepository extends MongoRepository<DetalleVentas,Long>{

}
