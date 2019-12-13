package be.iris.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import be.iris.entities.Artiste;

public interface ArtisteDAO extends JpaRepository<Artiste, Integer> {

}
