package com.dev.bookshowhere.repository;


import com.dev.bookshowhere.domain.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long> {

}