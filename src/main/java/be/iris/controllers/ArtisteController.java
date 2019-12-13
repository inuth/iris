package be.iris.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.iris.dao.ArtisteDAO;
import be.iris.entities.Artiste;

@RestController
@RequestMapping("artiste")
public class ArtisteController {
	
	@Autowired
	private ArtisteDAO artisteDAO;
	
	@GetMapping("")
	public ResponseEntity<List<Artiste>> get() {
		return ResponseEntity.ok(artisteDAO.findAll());
	}
}
