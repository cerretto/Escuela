import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CargarNotasDetailComponent } from './cargar-notas-detail.component';

describe('CargarNotasDetailComponent', () => {
  let component: CargarNotasDetailComponent;
  let fixture: ComponentFixture<CargarNotasDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CargarNotasDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CargarNotasDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
