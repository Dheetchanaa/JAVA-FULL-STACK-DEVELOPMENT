import { Injectable } from '@angular/core';
import { Attendance } from './model/attendance';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AttendanceService {
  url : string;
  student : Attendance;
  studentArr : Attendance[];

  constructor(private http: HttpClient) { 
    this.url ="http://localhost:3004/students";
    this.student= new Attendance();
    this.studentArr = [];
  }
  insertStudent(student : Attendance){
    this.http.post<Attendance>(this.url, student).subscribe();
    return "Student attendance details added";
  }
  updateStudent(student : Attendance){
    this.http.put<Attendance>(this.url+"/"+student.id, student).subscribe();
    return "Student attendance details updated";
  }
  deleteStudent(regNo:number){
    this.http.delete<Attendance>(this.url+"/"+regNo).subscribe();
    return "Student attendance details deleted";
  }
  findStudent(regNo:number){
    this.http.get<Attendance>(this.url+"/"+regNo).subscribe(data => this.student = data);
    return this.student;
  }
  findAllStudent(){
    this.http.get<Attendance[]>(this.url).subscribe(data => this.studentArr = data);
    return this.studentArr;
  }
}