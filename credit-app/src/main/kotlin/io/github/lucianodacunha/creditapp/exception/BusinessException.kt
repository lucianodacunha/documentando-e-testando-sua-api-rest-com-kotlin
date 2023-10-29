package io.github.lucianodacunha.creditapp.exception

data class BusinessException(override val message: String?) : RuntimeException(message)