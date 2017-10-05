package cm.deungoue.soukoulou.domain

import cm.deungoue.soukoulou.model.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
interface CustomerRepository : CrudRepository<Customer, Long> {

    fun findByLastName(lastName: String): Iterable<Customer>
}