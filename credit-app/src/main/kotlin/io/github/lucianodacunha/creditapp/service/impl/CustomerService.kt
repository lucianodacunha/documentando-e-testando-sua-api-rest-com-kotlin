package io.github.lucianodacunha.creditapp.service.impl

import io.github.lucianodacunha.creditapp.entity.Customer
import io.github.lucianodacunha.creditapp.exception.BusinessException
import io.github.lucianodacunha.creditapp.repository.CustomerRepository
import io.github.lucianodacunha.creditapp.service.ICustomerService
import org.springframework.stereotype.Service

@Service
class CustomerService(
  private val customerRepository: CustomerRepository
): ICustomerService {
  override fun save(customer: Customer): Customer = this.customerRepository.save(customer)

  override fun findById(id: Long): Customer = this.customerRepository.findById(id)
    .orElseThrow{throw BusinessException("Id $id not found") }

  override fun delete(id: Long) {
    val customer: Customer = this.findById(id)
    this.customerRepository.delete(customer)
  }
}