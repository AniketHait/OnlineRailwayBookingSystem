package com.toy.Online_Railway_System.dao;

import com.toy.Online_Railway_System.model.TrainDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<TrainDetails, Integer> {
}
