package be.iris.dto.Album;

import java.util.ArrayList;
import java.util.List;

public class AlbumDTO {
	private Integer id;
	private String title;
	private double price;
	private List<AlbumArtisteDTO> artistes = new ArrayList<>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<AlbumArtisteDTO> getArtistes() {
		return artistes;
	}
	public void setArtistes(List<AlbumArtisteDTO> artistes) {
		this.artistes = artistes;
	}
	
	
}
