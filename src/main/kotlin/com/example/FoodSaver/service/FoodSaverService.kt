package com.example.FoodSaver.service

import com.example.FoodSaver.dto.FoodSaverDto

import com.example.FoodSaver.mapper.FoodSaverMapper
import com.example.FoodSaver.repository.FoodSaverRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.validation.BindingResult


@Service
class FoodSaverService {

    @Autowired
    lateinit var foodSaverRepository: FoodSaverRepository

    @Autowired
    lateinit var foodSaverMapper: FoodSaverMapper

    fun save(foodSaverDto: FoodSaverDto, bindingResult: BindingResult): ResponseEntity<Any> {
        if (bindingResult.hasErrors()) {
            val errorMessages = bindingResult.allErrors.map { it.defaultMessage }.joinToString(", ")
            return ResponseEntity.badRequest().body(mapOf("status" to "error", "message" to errorMessages))
        }

        val foodSaver = foodSaverMapper.toEntity(foodSaverDto)
        val savedFoodSaver = foodSaverRepository.save(foodSaver)
        return ResponseEntity.ok(mapOf("status" to "success", "data" to foodSaverMapper.toDto(savedFoodSaver)))
    }

    fun getFoodSaver(): ResponseEntity<Any> {
        val foodSavers = foodSaverRepository.findAll().map { foodSaverMapper.toDto(it) }
        return ResponseEntity.ok(mapOf("status" to "success", "data" to foodSavers))
    }
}