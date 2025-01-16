package com.hyunjin.portfolio.domain.repository

import com.hyunjin.portfolio.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectSkillRepository : JpaRepository<ProjectSkill, Long>