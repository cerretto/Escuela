import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PersonaDetailComponent } from './persona-detail.component';

describe('PersonaDetailComponent', () => {
  let component: PersonaDetailComponent;
  let fixture: ComponentFixture<PersonaDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PersonaDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PersonaDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
