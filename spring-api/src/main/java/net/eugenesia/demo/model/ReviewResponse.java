package net.eugenesia.demo.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ReviewResponse implements Serializable {
  private int id;
}
