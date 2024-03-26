package com.counsellor_portal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.counsellor_portal.Entity.CounsellorRegistration;

public interface ConsollerRepo extends JpaRepository<CounsellorRegistration,String> {

}
