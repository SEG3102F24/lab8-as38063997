package SEG3102.employeeGql.resolvers

import SEG3102.employeeGql.entity.Employee
import SEG3102.employeeGql.repository.EmployeeRepository
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query

@Component
class EmployeeQueryResolver(private val employeeRepository: EmployeeRepository, private val mongoOperations: MongoOperations) : GraphQLQueryResolver {
    fun getEmployeeById(id: String): Employee? {
        return employeeRepository.findById(id).orElse(null)
    }

    fun getEmployeeByName(name: String): List<Employee> {
        val query = Query()
        query.addCriteria(Criteria.where("name").`is`(name))
        return mongoOperations.find(query, Employee::class.java)
    }

    fun getEmployeeByCity(city: String): List<Employee> {
        val query = Query()
        query.addCriteria(Criteria.where("city").`is`(city))
        return mongoOperations.find(query, Employee::class.java)
    }

    fun getEmployeeBySalary(salary: Float): List<Employee> {
        val query = Query()
        query.addCriteria(Criteria.where("salary").`is`(salary))
        return mongoOperations.find(query, Employee::class.java)
    }

    fun getEmployeeByGender(gender: String): List<Employee> {
        val query = Query()
        query.addCriteria(Criteria.where("gender").`is`(gender))
        return mongoOperations.find(query, Employee::class.java)
    }

    fun getEmployeeByEmail(email: String): List<Employee> {
        val query = Query()
        query.addCriteria(Criteria.where("email").`is`(email))
        return mongoOperations.find(query, Employee::class.java)
    }
} 