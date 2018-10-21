package br.com.starpeace.api.controller;

import br.com.starpeace.model.CapEntity;
import br.com.starpeace.service.CapService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CapApiController {

  @Autowired
  private CapService capService;


  @ApiOperation(value = "Registra um CAP")
  @PostMapping("/cap")
  public void createCap(@RequestBody CapEntity capEntity) {
    capService.createCap(capEntity);
  }

  @ApiOperation(value = "Obtém todos os CAPS")
  @GetMapping("/all")
  public List<CapEntity> listAllCaps() {
    return capService.listAllCaps();
  }

  @ApiOperation(value = "Busca CAP por categoria")
  @GetMapping("/category/{category}")
  public List<CapEntity> searchByCategory(@PathVariable("category") String category) {
    return capService.searchByCategory(category);
  }
}
