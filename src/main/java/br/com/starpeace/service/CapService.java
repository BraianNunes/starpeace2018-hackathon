package br.com.starpeace.service;

import br.com.starpeace.model.CapEntity;
import br.com.starpeace.repository.CapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapService {

  @Autowired
  private CapRepository repository;

  public void createCap(CapEntity capEntity) {
    repository.save(capEntity);
  }

  public List<CapEntity> listAllCaps() {
    return (List<CapEntity>) repository.findAll();
  }

  public List<CapEntity> searchByCategory(final String category) {
    return repository.findByCategoryIgnoreCaseContaining(category);
  }
}
