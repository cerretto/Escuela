import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CargarNotasComponent } from './cargar-notas.component';

describe('CargarNotasComponent', () => {
  let component: CargarNotasComponent;
  let fixture: ComponentFixture<CargarNotasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CargarNotasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CargarNotasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
