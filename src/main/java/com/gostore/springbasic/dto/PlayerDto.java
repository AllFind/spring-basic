package com.gostore.springbasic.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class PlayerDto {

  private Long id;
  private String name;
  private ZonedDateTime createdAt;

}
