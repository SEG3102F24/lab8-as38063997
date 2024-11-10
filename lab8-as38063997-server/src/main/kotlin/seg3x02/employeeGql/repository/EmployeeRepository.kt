package SEG3102.employeeGql.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import SEG3102.employeeGql.entity.Employee

@Repository
interface EmployeeRepository: MongoRepository<Employee, String>
