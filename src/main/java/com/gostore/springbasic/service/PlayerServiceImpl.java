package com.gostore.springbasic.service;

import com.gostore.springbasic.dto.PlayerDto;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService{

  private List<PlayerDto> players = new ArrayList<>();

  @Override
  public PlayerDto findOneById(Long id) {
    PlayerDto playerDto =  new PlayerDto();
    playerDto.setId(id);
    playerDto.setName("Player Name");
    playerDto.setCreatedAt(ZonedDateTime.now());
    return playerDto;
  }

  @Override
  public List<PlayerDto> findAll() {
    return players;
  }

  @Override
  public PlayerDto save(PlayerDto newPlayer) {
    players.add(newPlayer);

    return newPlayer;
  }
}
