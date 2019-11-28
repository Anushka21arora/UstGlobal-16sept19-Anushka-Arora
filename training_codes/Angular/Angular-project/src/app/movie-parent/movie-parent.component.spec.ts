import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MovieParentComponent } from './movie-parent.component';

describe('MovieParentComponent', () => {
  let component: MovieParentComponent;
  let fixture: ComponentFixture<MovieParentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MovieParentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MovieParentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
