package br.com.starpeace.repository;

import br.com.starpeace.model.CapEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CapRepository extends CrudRepository<CapEntity, Integer> {

  List<CapEntity> findByCategoryIgnoreCaseContaining(String category);
}