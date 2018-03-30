import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-child',
  template: `
  <div class = "notification is-primary">
    <h3>child</h3>
      Say {{childMessage}}
  </div>    
  `,
  styleUrls: ['./child.component.css']
})
export class ChildComponent {

  @Input() childMessage: string;

  constructor() { }

}