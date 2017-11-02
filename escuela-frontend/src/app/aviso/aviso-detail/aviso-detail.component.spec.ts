import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AvisoDetailComponent } from './aviso-detail.component';

describe('AvisoDetailComponent', () => {
  let component: AvisoDetailComponent;
  let fixture: ComponentFixture<AvisoDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AvisoDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AvisoDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
