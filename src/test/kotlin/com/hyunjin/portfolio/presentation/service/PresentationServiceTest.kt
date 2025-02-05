package com.hyunjin.portfolio.presentation.service

import com.hyunjin.portfolio.domain.entity.Introduction
import com.hyunjin.portfolio.domain.entity.Link
import com.hyunjin.portfolio.presentation.repository.PresentationRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class PresentationServiceTest {

    @InjectMocks//Mock을 주입할 대상
    lateinit var presentationService: PresentationService //초기값을 늦추는 명령어: lateinit var

    @Mock
    lateinit var presentationRepository: PresentationRepository

    val DATA_SIZE = 9

    @Test
    fun testGetIntroductions() {
        //given
        val introductions = mutableListOf<Introduction>()
        for (i in 1..DATA_SIZE) {
            val introduction = Introduction(content = "${i}", isActive = i % 2 == 0)
            introductions.add(introduction)
        }

        val activeIntroductions = introductions.filter { introduction -> introduction.isActive }

        Mockito.`when`(presentationRepository.getActiveIntroductions())
            .thenReturn(activeIntroductions)


        //when
        val introductionDTOs = presentationService.getIntroductions()

        //then
        assertThat(introductionDTOs).hasSize(DATA_SIZE / 2)
        for (introductionDTO in introductionDTOs) {
            assertThat(introductionDTO.content.toInt()).isEven()
        }
    }

    @Test
    fun testGetLinks() {
        //given
        val links = mutableListOf<Link>()//Link 형태로 빈 리스트 생성
        for (i in 1..DATA_SIZE) {
            val link = Link(name = "${i}", content = "${i}", isActive = i % 2 != 0)
            links.add(link)
        }

        val activeLinks = links.filter { link -> link.isActive }

        Mockito.`when`(presentationRepository.getActiveLinks())
            .thenReturn(activeLinks)

        //when
        val linkDTOs = presentationService.getLinks()

        //then
        var expectedSize = DATA_SIZE / 2
        if (DATA_SIZE % 2 != 0) {
            expectedSize += 1
        }
        assertThat(linkDTOs).hasSize(expectedSize)
        for (linkDTO in linkDTOs) { // linkDTOs 리스트의 모든 요소를 순회
            assertThat(linkDTO.content.toInt()).isOdd()
        }
    }

}