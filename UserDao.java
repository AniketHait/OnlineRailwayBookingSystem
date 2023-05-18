package com.toy.Online_Railway_System.dao;

import com.toy.Online_Railway_System.model.TrainBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<TrainBook,Integer> {
}
