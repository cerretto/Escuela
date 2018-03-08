import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuAdministracionComponent } from './menu-administracion.component';

describe('MenuAdministracionComponent', () => {
  let component: MenuAdministracionComponent;
  let fixture: ComponentFixture<MenuAdministracionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MenuAdministracionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MenuAdministracionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
