package com.example.FoodSaver.mapper

import com.example.FoodSaver.dto.FoodSaverDto
import com.example.FoodSaver.entity.FoodSaver
import org.springframework.stereotype.Component

@Component
class FoodSaverMapper {

    fun toDto(entity: FoodSaver): FoodSaverDto {
        return FoodSaverDto(
            id = entity.id,
            nombreMascota = entity.nombreMascota,
            tipoMascota = entity.tipoMascota,
            ultimaAlimentacion = entity.ultimaAlimentacion,
            necesitaHidratacion = entity.necesitaHidratacion
        )
    }

    fun toEntity(dto: FoodSaverDto): FoodSaver {
        return FoodSaver(
            id = dto.id,
            nombreMascota = dto.nombreMascota,
            tipoMascota = dto.tipoMascota,
            ultimaAlimentacion = dto.ultimaAlimentacion,
            necesitaHidratacion = dto.necesitaHidratacion
        )
    }
}