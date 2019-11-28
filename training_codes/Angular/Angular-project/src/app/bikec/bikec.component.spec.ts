import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BikecComponent } from './bikec.component';

describe('BikecComponent', () => {
  let component: BikecComponent;
  let fixture: ComponentFixture<BikecComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BikecComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BikecComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
