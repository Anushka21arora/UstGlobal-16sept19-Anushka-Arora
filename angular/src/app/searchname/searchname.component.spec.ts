import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchnameComponent } from './searchname.component';

describe('SearchnameComponent', () => {
  let component: SearchnameComponent;
  let fixture: ComponentFixture<SearchnameComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchnameComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchnameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
