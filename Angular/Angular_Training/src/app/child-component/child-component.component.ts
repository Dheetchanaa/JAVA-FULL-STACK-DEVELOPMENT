import { Component } from '@angular/core';
import { CalculatorServiceService } from '../calculator-service.service';

@Component({
  selector: 'app-child-component',
  templateUrl: './child-component.component.html',
  styleUrl: './child-component.component.css'
})
export class ChildComponentComponent {
  sum: number;
  sub:number;
  mul:number;
  div:number;
  constructor(private calc : CalculatorServiceService){
    this.sum =calc.getAddition(10,30);
    this.sub =calc.getSubtraction(10,20);
    this.mul=calc.getMultiplication(10,20);
    this.div=calc.getDivision(20,10);
}
}
