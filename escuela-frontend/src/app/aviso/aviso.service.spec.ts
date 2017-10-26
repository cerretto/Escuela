import { TestBed, inject } from '@angular/core/testing';

import { AvisoService } from './aviso.service';

describe('AvisoService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AvisoService]
    });
  });

  it('should be created', inject([AvisoService], (service: AvisoService) => {
    expect(service).toBeTruthy();
  }));
});
