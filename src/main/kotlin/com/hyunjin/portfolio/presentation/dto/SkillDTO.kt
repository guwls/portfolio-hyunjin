package com.hyunjin.portfolio.presentation.dto

import com.hyunjin.portfolio.domain.entity.Skill
import javax.print.DocFlavor.STRING

data class SkillDTO(
    val name: String,
    val type: String
){
    constructor(skill: Skill): this(
        name = skill.name,
        type = skill.type.name
    )

}