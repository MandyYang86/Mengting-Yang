import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  template: `
  <h1>parent</h1>
    <app-child [childMessage]="parentMessage"></app-child>
  `,
  styleUrls: ['./parent.component.css']
})
export class ParentComponent{
  parentMessage = "message from parent"
  constructor() { }
}