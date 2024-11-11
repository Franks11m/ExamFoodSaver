package com.example.FoodSaver.repository

import com.example.FoodSaver.entity.FoodSaver
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FoodSaverRepository : JpaRepository<FoodSaver, Long> {
    // Métodos personalizados si los necesitas
}