package be.iris.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import be.iris.entities.Album;

// CrudRepository 
// PagingAndSorting
// JpaRepository
public interface AlbumDAO extends JpaRepository<Album, Integer> {
	
}
