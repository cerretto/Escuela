import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TipoAvisoComponent } from './tipo-aviso.component';

describe('TipoAvisoComponent', () => {
  let component: TipoAvisoComponent;
  let fixture: ComponentFixture<TipoAvisoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TipoAvisoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TipoAvisoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
