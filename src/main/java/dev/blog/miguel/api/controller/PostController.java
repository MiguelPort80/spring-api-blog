package dev.blog.miguel.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.blog.miguel.api.entities.Post;
import dev.blog.miguel.api.services.PostService;

@RestController
@RequestMapping({"/posts", "/posts/"})
public class PostController {
	@Autowired
	private PostService postService;
	@GetMapping
	public ResponseEntity<List<Post>> findAll(){
		
		
		List<Post> lista =  postService.findAll();
		
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Post>> findById(@PathVariable Long id){
		Optional<Post> obj =  postService.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping("/search")
	public ResponseEntity<Optional<List<Post>>> findByTerms(@RequestParam String term){
		Optional<List<Post>> obj =  postService.findByTerms(term);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Post> save(@RequestBody Post post){
		post = postService.save(post);
		return ResponseEntity.status(HttpStatus.CREATED).body(post);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		try {
			postService.delete(id);
		} catch (RuntimeException e) {
			e.getMessage();
		}
		
		return ResponseEntity.noContent().build();

	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Post> update(@PathVariable Long id, @RequestBody Post post){
		post =  postService.update(id, post);
		return ResponseEntity.status(HttpStatus.OK).body(post);
	}
	
}
