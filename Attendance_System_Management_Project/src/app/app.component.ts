import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Attendance_System_Management_Project';
  name : string;
  age : number;
  email : string;
  txtcolor : string;
  imgpath :string;
  fname:String;

constructor(){
  this.name="Dheetchanaa";
  this.age=20;
  this.email="kanagarajdheetchanaa@gmail.com";
  this.txtcolor = "green";
  this.imgpath = "./assets/logo.png";
  this.fname = "";
}
getAddition(a : number, b :number){
  let sum = a+b;
  return sum;
}
changeName(){
  this.name="Priya";
}
changeEmail(){
  this.email="priya@gmail.com";
}
}