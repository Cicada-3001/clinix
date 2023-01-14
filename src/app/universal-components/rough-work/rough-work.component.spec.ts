import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoughWorkComponent } from './rough-work.component';

describe('RoughWorkComponent', () => {
  let component: RoughWorkComponent;
  let fixture: ComponentFixture<RoughWorkComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RoughWorkComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RoughWorkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
