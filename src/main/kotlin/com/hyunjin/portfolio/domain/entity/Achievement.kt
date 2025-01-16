package com.hyunjin.portfolio.domain.entity

import jakarta.persistence.*
import org.springframework.context.annotation.Description
import java.time.LocalDate

@Entity
class Achievement(
    title: String,
    description: String,
    achievement: LocalDate?,
    host: String,
    isActive: Boolean
    ) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_id")
    var id: Long? = null

    var title: String = title

    var description: String = description

    var achievement: LocalDate? = achievement

    var host: String = host

    var isActive: Boolean = isActive

}