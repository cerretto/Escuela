import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EvaluacionDetailComponent } from './evaluacion-detail.component';

describe('EvaluacionDetailComponent', () => {
  let component: EvaluacionDetailComponent;
  let fixture: ComponentFixture<EvaluacionDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EvaluacionDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EvaluacionDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
