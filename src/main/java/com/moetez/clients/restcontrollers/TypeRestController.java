package com.moetez.clients.restcontrollers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moetez.clients.entities.type;
import com.moetez.clients.repos.TypeRepository;

@RestController
@RequestMapping("/api/types")
@CrossOrigin("*")
public class TypeRestController {
    
    @Autowired 
    TypeRepository typeRepository;
    
    // Méthode pour récupérer tous les types
    @GetMapping
    public List<type> getAlltypes() {
        return typeRepository.findAll();  // Retourne la liste de tous les types
    }

    // Méthode pour récupérer un type par son ID
    @GetMapping("/{id}")
    public type getTypeById(@PathVariable("id") Long id) {
        Optional<type> optionalType = typeRepository.findById(id);
        if (optionalType.isPresent()) {
            return optionalType.get(); // Récupère l'objet type si trouvé
        } else {
            throw new RuntimeException("Type not found with id: " + id); // Gère le cas où le type n'est pas trouvé
        }
    }
}
