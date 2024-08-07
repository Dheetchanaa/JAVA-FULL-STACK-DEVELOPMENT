import { Component } from '@angular/core';
import { Attendance } from './model/attendance';
import { AttendanceService } from './attendance.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Attendance_Management_System';
  student : Attendance;
  studentArr : Attendance[];
  result : string;
  flag:Boolean;
  constructor(private service : AttendanceService){
    this.student = new Attendance;
    this.result = "";
    this.studentArr = [];
    this.flag=false;
  }
  insertStudent(data: any){
    this.student.id= data.regNo;
    this.student.studName= data.studName;
    this.student.date = data.date;
    this.student.attendance = data.attendance;
    //alert(data.regNo+" "+data.studName+" "+data.date+" "+data.attendance);
    this.result = this.service.insertStudent(this.student);
  }
  updateStudent(data: any){
    this.student.id= data.regNo;
    this.student.studName= data.studName;
    this.student.date = data.date;
    this.student.attendance = data.attendance;
    this.result = this.service.updateStudent(this.student);
  }
  deleteStudent(data: any){
    this.result = this.service.deleteStudent(data.regNo);
  }
  findStudent(data: any){
    this.student = this.service.findStudent(data.regNo);
    this.result = this.student.id + " "+ this.student.studName +" "+ this.student.date + " "+this.student.attendance;
  }
  findAllStudent(){
    this.studentArr = this.service.findAllStudent();
    this.flag=true;
  }
}
