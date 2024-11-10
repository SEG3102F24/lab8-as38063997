package SEG3102.employeeGql.resolvers

import SEG3102.employeeGql.entity.Employees
import SEG3102.employeeGql.repository.EmployeesRepository
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.core.query.Criteria

@Component
cLass EmployeesQueryResolver(private val employeesRepository: EmployeesRepository, private val mongoOperations: MongoOperations) : GraphQLQueryResolver {
    fun employees(): List<Employees> {
        return employeesRepository.findAll()
    }

    fun employeeByName(name: String): List<Employees> {
        val query = Query()
        query.addCriteria(Criteria.where("name").`is`(name))
        return mongoOperations.find(query, Employees::class.java)
    }

    fun employeeByCity(city: String): List<Employees> {
        val query = Query()
        query.addCriteria(Criteria.where("city").`is`(city))
        return mongoOperations.find(query, Employees::class.java)
    }

    fun employeeBySalary(salary: Float): List<Employees> {
        val query = Query()
        query.addCriteria(Criteria.where("salary").`is`(salary))
        return mongoOperations.find(query, Employees::class.java)
    }

    fun employeeByEmail(email: String): List<Employees> {
        val query = Query()
        query.addCriteria(Criteria.where("email").`is`(email))
        return mongoOperations.find(query, Employees::class.java)
    }

    fun employeeByGender(gender: String): List<Employees> {
        val query = Query()
        query.addCriteria(Criteria.where("gender").`is`(gender))
        return mongoOperations.find(query, Employees::class.java)
    }
}