package com.hyunjin.portfolio.domain.repository

import com.hyunjin.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achievement, Long>