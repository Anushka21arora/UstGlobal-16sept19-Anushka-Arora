import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CarparentComponent } from './carparent.component';

describe('CarparentComponent', () => {
  let component: CarparentComponent;
  let fixture: ComponentFixture<CarparentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CarparentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CarparentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
