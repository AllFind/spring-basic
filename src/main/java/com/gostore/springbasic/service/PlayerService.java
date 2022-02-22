package com.gostore.springbasic.service;

import com.gostore.springbasic.dto.PlayerDto;

import java.util.List;

public interface PlayerService {

  PlayerDto findOneById(Long id);

  List<PlayerDto> findAll();

  PlayerDto save(PlayerDto newPlayer);

}
