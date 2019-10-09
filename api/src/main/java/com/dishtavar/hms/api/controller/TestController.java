package com.dishtavar.hms.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author atulsingh
 *
 */
@RestController
@RequestMapping("/test")
public class TestController {

@GetMapping(value = "/{id}")
  public Long findById(@PathVariable("id") Long id) {
      return id;
  }
	
//	@GetMapping(value = "/{id}")
//    public Foo findById(@PathVariable("id") Long id) {
//        return RestPreconditions.checkFound(service.findById(id));
//    }
// 
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Long create(@RequestBody Foo resource) {
//        Preconditions.checkNotNull(resource);
//        return service.create(resource);
//    }
// 
//    @PutMapping(value = "/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public void update(@PathVariable( "id" ) Long id, @RequestBody Foo resource) {
//        Preconditions.checkNotNull(resource);
//        RestPreconditions.checkNotNull(service.getById(resource.getId()));
//        service.update(resource);
//    }
// 
//    @DeleteMapping(value = "/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public void delete(@PathVariable("id") Long id) {
//        service.deleteById(id);
//    }
}
