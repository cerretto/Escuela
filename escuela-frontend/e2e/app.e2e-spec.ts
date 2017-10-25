import { EscuelaFrontendPage } from './app.po';

describe('escuela-frontend App', () => {
  let page: EscuelaFrontendPage;

  beforeEach(() => {
    page = new EscuelaFrontendPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
