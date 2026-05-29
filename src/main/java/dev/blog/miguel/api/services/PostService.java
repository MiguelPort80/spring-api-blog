package dev.blog.miguel.api.services;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.blog.miguel.api.entities.Post;
import dev.blog.miguel.api.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository repository;
	
	public Post save(Post post) {
		post.setCreatedAt(Instant.now());
		post.setUpdatedAt(Instant.now());
		post = repository.save(post);
		return post;
	}
	
	public List<Post> findAll(){
		return repository.findAll();
	}
	
	public Optional<Post> findById(Long id) {
		return repository.findById(id);
	}
	
	public Optional<List<Post>> findByTerms(String term){
		return repository.findByTerms(term, term, term);
	}
	
	public void updateData(Post post, Post obj) {
		post.setTitle(obj.getTitle());
		post.setContent(obj.getContent());
		post.setCategory(obj.getCategory());
		post.setTags(obj.getTags());
		post.setUpdatedAt(Instant.now());
	}
	
	public Post update(Long id, Post obj) {
		Post post = repository.getReferenceById(id);
		updateData(post, obj);
		return post;
	}
	

	public void delete(Long id) {
		repository.deleteById(id);
	}
}
