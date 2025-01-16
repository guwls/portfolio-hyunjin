package com.hyunjin.portfolio.domain.repository

import com.hyunjin.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long>