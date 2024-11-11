package com.example.FoodSaver.controller

import com.example.FoodSaver.dto.FoodSaverDto
import com.example.FoodSaver.service.FoodSaverService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/food-saver")
class FoodSaverController {

    @Autowired
    lateinit var foodSaverService: FoodSaverService

    @PostMapping("/save")
    fun save(@RequestBody @Validated foodSaverDto: FoodSaverDto, bindingResult: BindingResult): ResponseEntity<Any> {
        return foodSaverService.save(foodSaverDto, bindingResult)
    }

    @GetMapping("/list")
    fun getFoodSaver(): ResponseEntity<Any> {
        return foodSaverService.getFoodSaver()
    }
}