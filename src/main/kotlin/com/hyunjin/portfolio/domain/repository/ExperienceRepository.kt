package com.hyunjin.portfolio.domain.repository

import com.hyunjin.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long>