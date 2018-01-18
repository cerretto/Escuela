import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuAvisoComponent } from './menu-aviso.component';

describe('MenuAvisoComponent', () => {
  let component: MenuAvisoComponent;
  let fixture: ComponentFixture<MenuAvisoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MenuAvisoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MenuAvisoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
