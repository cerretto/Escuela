import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuCursadoComponent } from './menu-cursado.component';

describe('MenuCursadoComponent', () => {
  let component: MenuCursadoComponent;
  let fixture: ComponentFixture<MenuCursadoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MenuCursadoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MenuCursadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
