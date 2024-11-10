package SEG3102.employeeGql.resolvers

import SEG3102.employeeGql.entity.Employees
import SEG3102.employeeGql.repository.EmployeesRepository
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class EmployeesResolver(private val employeesRepository: EmployeesRepository) : GraphQLQueryResolver {
    fun createEmployee(name: String, dateOfBirth: String, city: String, salary: Float, gender: String?, email: String?): Employees {
        val employees = Employees(name, dateOfBirth, city, salary, gender, email)
        employeesRepository.save(employees)
        return employee
}



