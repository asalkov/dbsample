package com.ansa.dbsample;

import com.ansa.dbsample.model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "articles", path = "articles")
public interface ArticleRepository extends CrudRepository<Article, Long> {
}
