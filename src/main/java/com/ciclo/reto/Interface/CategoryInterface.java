package com.ciclo.reto.Interface;

import com.ciclo.reto.modelo.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryInterface extends CrudRepository<Category, Integer> {
}
