package com.hyunjin.portfolio.domain.repository

import com.hyunjin.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long>