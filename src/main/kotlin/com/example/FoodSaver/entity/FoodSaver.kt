package com.example.FoodSaver.entity

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import java.time.LocalDateTime

@Entity
@Table(name = "pet_care")
data class FoodSaver(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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