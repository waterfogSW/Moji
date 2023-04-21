package com.waterfogsw.userservice.user.domain

import java.time.LocalDateTime
import java.util.*

data class User(
    val id: UUID,
    val name: String,
    val email: String,
    val password: String,
    val profileImageURL: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
)
