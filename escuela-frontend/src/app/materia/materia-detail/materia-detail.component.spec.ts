import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MateriaDetailComponent } from './materia-detail.component';

describe('MateriaDetailComponent', () => {
  let component: MateriaDetailComponent;
  let fixture: ComponentFixture<MateriaDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MateriaDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MateriaDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
