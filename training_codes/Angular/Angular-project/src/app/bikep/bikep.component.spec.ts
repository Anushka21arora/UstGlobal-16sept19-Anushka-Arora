import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BikepComponent } from './bikep.component';

describe('BikepComponent', () => {
  let component: BikepComponent;
  let fixture: ComponentFixture<BikepComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BikepComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BikepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
