package com.example.MoM.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.MoM.entity.OrganizationMeetingEntity;

public interface OrganizationMeetingRepository extends JpaRepository<OrganizationMeetingEntity, Integer> {

	@Query(value = "select * from meeting where organization_id=?",nativeQuery = true)
	List<OrganizationMeetingEntity> findByOrganizationId(int id);

}
