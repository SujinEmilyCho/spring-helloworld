package wooteco.helloworld.jdbc.simple;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Override
    List<User> findAll();

    /**
     * select count(1) from user where name = name
     */
    @Query("select count(1) from user where name = :name")
    int countByName(String name);
}
