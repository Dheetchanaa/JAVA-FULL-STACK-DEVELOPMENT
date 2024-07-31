import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Attendance_Management_System';
  regNo:string;
  name : string;
  attendance : string;
  date : string;
  regNo1:string;
  name1 : string;
  attendance1 : string;
  date1 : string;
  constructor(){
    this.regNo = "document.getElementById(name)";
    this.name = "document.getElementById(name)";
    this.attendance = "document.getElementById(name)";
    this.date = "document.getElementById(date)";
    this.regNo1 = "";
    this.name1 = "";
    this.attendance1 = "";
    this.date1 = "";
  }
  printDetails(){  
    this.regNo1 = this.regNo;
    this.name1 = "";
    this.attendance1 = "";
    this.date1 = "";
  }
}
