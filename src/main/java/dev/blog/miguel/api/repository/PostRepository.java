package dev.blog.miguel.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dev.blog.miguel.api.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long>  {
	@Query(value = "SELECT * FROM post WHERE title LIKE CONCAT('%',:title,'%') OR "
			+ "content LIKE CONCAT('%',:content,'%') OR "
			+ "category LIKE CONCAT('%',:category,'%')", nativeQuery = true)
	Optional<List<Post>> findByTerms(@Param("title") String title, 
									 @Param("content") String content,
									 @Param("category") String category);

	

}
