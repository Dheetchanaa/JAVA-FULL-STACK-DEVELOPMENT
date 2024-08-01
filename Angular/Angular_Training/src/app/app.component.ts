import { Component } from '@angular/core';
import { CalculatorServiceService } from './calculator-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  /*
  name : string;
  age :number;
  email : string;
  txtColor: string;
  imgPath : string;
  fname:string;

  constructor(){
    this.name="Dheetchanaa";
    this.age=20;
    this.email="kanagarajdheetchanaa@gmail.com"
    this.txtColor="green";
    this.imgPath="https://d585tldpucybw.cloudfront.net/sfimages/default-source/blogs/2023/2023-11/angular-logo-1200-628.png?sfvrsn=bf64b1ee_3";
    this.fname="dhee";
  }
  getAddition(a:number,b:number){
    let sum =a+b;
    return sum;
  }
  changeName(){
    this.name="Gowthamapriya";
  }
  changeEmail(){
    this.email="gp@gmail.com";
  }
  changeAge(){
    this.age=21;
  }
  changeImg(){
      this.imgPath="https://www.searchenginejournal.com/wp-content/uploads/2019/04/the-seo-guide-to-angular.png";
  }
  title = 'MyAngularProject1';

  flag:boolean;
  vehicle:string[];
  selectedVehicle:string="";
  myStyle : {};
  myClass : string;

  constructor(){
    this.flag=true;
    this.vehicle=["TwoWheeler","ThreeWheeler","FourWheeler"];
    this.myStyle = {'width' : '40%', 'border' : '2px solid green'};
    this.myClass = "MyClass1";
  }
  
  changeFlag(){
    this.flag=!this.flag;
  }

  setSelectedItem(vec:string){
    this.selectedVehicle=vec;
  }
  changeClass(){
    this.myClass = "MyClass2";
  }*/

    sum : number;
    constructor(private calc : CalculatorServiceService){
      this.sum = calc.getAddition(10,30);
    }
}