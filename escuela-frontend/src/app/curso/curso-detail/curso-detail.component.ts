import { Component, OnInit } from '@angular/core';
import { Curso } from '../curso-models';
import { Nivel } from '../../nivel/nivel-models';
import { CursoService } from '../curso.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-curso-detail',
  templateUrl: './curso-detail.component.html',
  styleUrls: ['./curso-detail.component.css']
})
export class CursoDetailComponent implements OnInit {

  updateFlag: Boolean = false;
  curso: Curso = new Curso();
  nivelCombo: Nivel[];

  constructor(private service: CursoService,
                private route: ActivatedRoute,
                private router: Router) { }

  ngOnInit() {

    // this.route.paramMap
    // .switchMap((params: ParamMap) => this.service.getAviso(+params.get('id')))
    // .subscribe(aviso => this.aviso = aviso);
    this.route.params.subscribe(params => {
      if (+params['id']) {
        // console.log(+params['id']);
        this.updateFlag = true;
        this.service.getCurso(+params['id']).subscribe(
          nivel => {
            this.curso = nivel;

            this.service.getNivel().subscribe(
              data => {
                this.nivelCombo = data;
                this.curso.nivel = this.nivelCombo.filter(r => r.id === this.curso.nivel.id)[0];
              });
          });

      } else {
        this.service.getNivel().subscribe(
          data => {
            this.nivelCombo = data;
          });
      }
    });

  }

  goBack() {
    this.router.navigate(['/menu/cursos']);
  }

  save() {
    console.log('func::save');
    this.service.saveCurso(this.curso).subscribe(
      data => {
        console.log('ok');
        this.router.navigate(['/menu/cursos']);
      }, err => {
        console.log('err');
      }
    );
  }

  update() {
    console.log('func::update');
    this.service.updateCurso(this.curso).subscribe(
      data => {
        console.log('ok');
        this.curso = data;
        this.router.navigate(['/menu/cursos']);
      }, err => {
        console.log('ok');
      }
    );
  }

}
