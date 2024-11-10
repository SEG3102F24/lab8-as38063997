package SEG3102.employeeGql.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import SEG3102.employeeGql.entity.Employee
import SEG3102.employeeGql.repository.EmployeeRepository
import graphql.kickstart.tools.GraphQLQueryResolver

@Component
class EmployeeRepository : MongoRepository<Employee, String>, GraphQLQueryResolver {
    fun newEmployee(name: Int, dateOfBirth: String,
        city: String,
        salary: Float,
        gender: String?,
        email: String?): Employee {
        val employee = Employee(name, dateOfBirth, city, salary, gender, email)
        employeeRepository.save(employee)
        return employee
    }

}