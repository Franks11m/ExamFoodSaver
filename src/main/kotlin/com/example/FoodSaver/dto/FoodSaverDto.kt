package com.example.FoodSaver.dto

import jakarta.validation.constraints.NotNull
import java.time.LocalDateTime

data class FoodSaverDto(
    var id: Long? = null,

    @field:NotNull(message = "El nombre de la mascota no puede ser nulo")
    var nombreMascota: String?,

    @field:NotNull(message = "El tipo de mascota no puede ser nulo")
    var tipoMascota: String?,

    @field:NotNull(message = "La última alimentación no puede ser nula")
    var ultimaAlimentacion: LocalDateTime?,

    @field:NotNull(message = "El campo de hidratación no puede ser nulo")
    var necesitaHidratacion: Boolean?
)