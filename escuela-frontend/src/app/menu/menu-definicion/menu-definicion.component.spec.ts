import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuDefinicionComponent } from './menu-definicion.component';

describe('MenuDefinicionComponent', () => {
  let component: MenuDefinicionComponent;
  let fixture: ComponentFixture<MenuDefinicionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MenuDefinicionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MenuDefinicionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
