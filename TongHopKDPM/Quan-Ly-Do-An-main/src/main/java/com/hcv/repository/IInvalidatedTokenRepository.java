package com.hcv.repository;

import com.hcv.entity.InvalidatedToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInvalidatedTokenRepository extends JpaRepository<InvalidatedToken, String> {
}
