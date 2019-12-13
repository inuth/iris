package be.iris.controllers;

import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import be.iris.dao.AlbumDAO;
import be.iris.dao.ArtisteDAO;
import be.iris.dto.Album.AlbumDTO;
import be.iris.entities.Album;
import be.iris.entities.Artiste;
import be.iris.services.Mapper;

@RestController
@RequestMapping(value = "album")
public class AlbumController {
	
	@Autowired
	private AlbumDAO albumDAO;
	
	@Autowired
	private ArtisteDAO artisteDAO;
	
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public AlbumDTO get(Integer id) {
		// connection base de données et récupérer l'album qui a cette ID là
		
		Optional<Album> a = albumDAO.findById(id);
		
		// transformer l'album en albumDTO
		
		
		return Mapper.albumToDTO(a.orElse(null));
	}
	
	@PostMapping("/post")
	public void post(@RequestBody Album album) {
//		System.out.println(album.getPrice());
//		System.out.println(album.getTitle());
//		
//		Artiste artiste = new Artiste();
//		artiste.setGender("homme");
//		artiste.setName("John");
//		artisteDAO.save(artiste);
//		System.out.println(artiste.getId());
//		album.getArtistes().add(artiste);
		albumDAO.save(album);
	}
}
