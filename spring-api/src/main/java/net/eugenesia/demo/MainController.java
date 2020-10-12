package net.eugenesia.demo;

import net.eugenesia.demo.model.ReviewResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MainController {

  @GetMapping("/testpath/{id}")
  public ReviewResponse getReview(@PathVariable int id) {
    return ReviewResponse.builder().id(id).build();
    // return "Hello world";
  }
}
