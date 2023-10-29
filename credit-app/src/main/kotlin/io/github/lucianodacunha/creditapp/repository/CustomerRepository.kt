package io.github.lucianodacunha.creditapp.repository

import io.github.lucianodacunha.creditapp.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer, Long>