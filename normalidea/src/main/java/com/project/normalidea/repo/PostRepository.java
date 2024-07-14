package com.project.normalidea.repo;

import com.project.normalidea.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository  extends CrudRepository<Post, Long> {
}
