package repository;

import model.MyCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRespository extends JpaRepository<MyCity, Integer> {

    // custom query to search to blog post by title or content
    List<MyCity> find(Integer cityId);
}
