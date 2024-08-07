import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './model/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  url : string;
  employee : Employee;
  employeeArr : Employee[];

  constructor(private http : HttpClient) { 
    this.url = "http://localhost:3004/employees";
    this.employeeArr = [];
    this.employee = new Employee();
  }
  insertEmployee(employee : Employee){
    this.http.post<Employee>(this.url, employee).subscribe();
    return "Employee details added";
  }
  updateEmployee(employee : Employee){
    this.http.put<Employee>(this.url+"/"+employee.id, employee).subscribe();
    return "Employee details updated";
  }
  deleteEmployee(empId : number){
    this.http.delete<Employee>(this.url+"/"+empId).subscribe();
    return "Employee details deleted";
  }
  findEmployee(empId : number){
    this.http.get<Employee>(this.url+"/"+empId).subscribe(data => this.employee = data);
    return this.employee;
  }
  findAllEmployee(){
    this.http.get<Employee[]>(this.url).subscribe(data => this.employeeArr=data);
    return this.employeeArr;
  }
}
