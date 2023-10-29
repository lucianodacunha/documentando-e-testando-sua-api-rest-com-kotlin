package io.github.lucianodacunha.creditapp.service

import io.github.lucianodacunha.creditapp.entity.Customer

interface ICustomerService {
    fun save(customer: Customer): Customer
    fun findById(id: Long): Customer
    fun delete(id: Long)
}