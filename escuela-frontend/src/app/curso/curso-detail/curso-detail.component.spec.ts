import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CursoDetailComponent } from './curso-detail.component';

describe('CursoDetailComponent', () => {
  let component: CursoDetailComponent;
  let fixture: ComponentFixture<CursoDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CursoDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CursoDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
