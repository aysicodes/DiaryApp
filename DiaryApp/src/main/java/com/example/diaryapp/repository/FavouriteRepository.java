package com.example.diaryapp.repository;

import com.example.diaryapp.entity.Favourite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavouriteRepository extends JpaRepository<Favourite, Long> {
    List<Favourite> findByUserId(Long userId);  // Custom query to get all favourites by a specific user
}