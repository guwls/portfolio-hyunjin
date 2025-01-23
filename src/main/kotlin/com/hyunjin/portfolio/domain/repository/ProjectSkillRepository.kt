package com.hyunjin.portfolio.domain.repository

import com.hyunjin.portfolio.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProjectSkillRepository : JpaRepository<ProjectSkill, Long>{
    fun findByProjectIdAndSkillId(projectId: Long, SkillId: Long): Optional<ProjectSkill>
}