package com.hyunjin.portfolio.presentation.controller

import com.hyunjin.portfolio.presentation.dto.IntroductionDTO
import com.hyunjin.portfolio.presentation.dto.LinkDTO
import com.hyunjin.portfolio.presentation.dto.ProjectDTO
import com.hyunjin.portfolio.presentation.dto.ResumeDTO
import com.hyunjin.portfolio.presentation.service.PresentationService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
// 데이터 전달에 집중되는 Controller
class PresentationApiController(
    private val presentationService: PresentationService
) {
    @GetMapping("/test")
    fun test(): String {
        return "OK"
    }

    @GetMapping("/v1/introductions")
    fun getIntroductions(): List<IntroductionDTO>{
        return presentationService.getIntroductions()
    }

    @GetMapping("/v1/links")
    fun getLinks(): List<LinkDTO> {
        return presentationService.getLinks()
    }

    @GetMapping("/v1/resume")
    fun getResume(): ResumeDTO{
        return presentationService.getResume()
    }

    @GetMapping("/v1/projects")
    fun getProjects(): List<ProjectDTO>{
        return presentationService.getProjects()
    }
}