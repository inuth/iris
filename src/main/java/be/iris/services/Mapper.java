package be.iris.services;

import be.iris.dto.Album.AlbumArtisteDTO;
import be.iris.dto.Album.AlbumDTO;
import be.iris.entities.Album;
import be.iris.entities.Artiste;

public class Mapper {
	public static AlbumDTO albumToDTO(Album entity) {
		if (entity == null) {
			return null;
		}
		AlbumDTO albumDTO = new AlbumDTO();
		albumDTO.setId(entity.getId());
		albumDTO.setPrice(entity.getPrice());
		albumDTO.setTitle(entity.getTitle());
		for (Artiste artiste : entity.getArtistes()) {
			AlbumArtisteDTO aad = new AlbumArtisteDTO();
			aad.setId(artiste.getId());
			aad.setName(artiste.getName());
			albumDTO.getArtistes().add(aad);
		}
		return albumDTO;
	}
}
