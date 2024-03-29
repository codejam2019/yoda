package com.cc.yoda.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cc.yoda.weather.entity.CitiesMaster;

@Repository
public interface CitiesMasterRepository extends JpaRepository<CitiesMaster, Integer> {

	@Query("select city from CitiesMaster where sensorId = ?1")
	public String getCity(String sensorId);
}
