package com.example.demo.dataAccess.abstracts;

import com.example.demo.entities.concretes.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsDao  extends JpaRepository<Jobs,Integer> {

}
