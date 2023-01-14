import { Component } from '@angular/core';
import { userData } from 'src/app/Shared/shared';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent {
  user= userData


}
