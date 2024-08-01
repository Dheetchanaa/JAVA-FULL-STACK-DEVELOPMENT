import { Component } from '@angular/core';
import { Attendance } from './model/attendance';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Attendance_Management_System';
  student : Attendance;
  constructor(){
    this.student = new Attendance;
  }
  insertStudent(data: any){
    this.student.regNo= data.regNo;
    this.student.studName= data.studName;
    this.student.date = data.date;
    this.student.attendance = data.attendance;
    alert(data.regNo+" "+data.studName+" "+data.date+" "+data.attendance);
  }
}
