package com.example.bms.book_my_show_clone;

import java.util.List;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CityRepository extends JpaRepository<City, Integer> {

    City findById(long id);


    @Modifying
    @Query("update City u set u.name = :name where u.id = :id")
    void updateCityName(@Param(value = "id") long id, @Param(value = "name") String name);

    @Modifying
    @Query("delete City u where u.id = :id")
    void deleteCity(@Param(value = "id") long id);

}