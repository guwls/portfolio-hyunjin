package com.hyunjin.portfolio.domain.repository

import com.hyunjin.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>