package com.gostore.springbasic.controller;

import com.gostore.springbasic.dto.PlayerDto;
import com.gostore.springbasic.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

  @Autowired
  private PlayerService playerService;

  @GetMapping("/players/{id}")
  public PlayerDto getById(@PathVariable(name = "id") Long id) {
    return playerService.findOneById(id);
  }

  @GetMapping("/players")
  public List<PlayerDto> getAll() {
    return playerService.findAll();
  }

  @PostMapping("/players")
  public PlayerDto save(@RequestBody PlayerDto newPlayer) {
    return playerService.save(newPlayer);
  }

}
