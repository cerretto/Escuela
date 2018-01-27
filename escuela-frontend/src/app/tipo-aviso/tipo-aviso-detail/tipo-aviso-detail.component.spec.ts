import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TipoAvisoDetailComponent } from './tipo-aviso-detail.component';

describe('TipoAvisoDetailComponent', () => {
  let component: TipoAvisoDetailComponent;
  let fixture: ComponentFixture<TipoAvisoDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TipoAvisoDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TipoAvisoDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
