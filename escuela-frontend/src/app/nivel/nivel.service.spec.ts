import { TestBed, inject } from '@angular/core/testing';

import { NivelService } from './nivel.service';

describe('NivelService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [NivelService]
    });
  });

  it('should be created', inject([NivelService], (service: NivelService) => {
    expect(service).toBeTruthy();
  }));
});
