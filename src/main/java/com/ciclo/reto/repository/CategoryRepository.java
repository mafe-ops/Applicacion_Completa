package com.ciclo.reto.repository;

import com.ciclo.reto.Interface.CategoryInterface;
import com.ciclo.reto.modelo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryInterface extencionesCrud;

    public List<Category> getAll(){
        return (List<Category>) extencionesCrud.findAll();
    }

    public Optional<Category> getCategory(int id){
        return extencionesCrud.findById(id);
    }

    public Category save(Category category){return extencionesCrud.save(category);}

    public void delete (Category category) {extencionesCrud.delete(category);}
}
