import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PageService } from '../../shared/services/page/page.service';

@Component({
  selector: 'app-page-not-found',
  templateUrl: './page-not-found.component.html',
  styleUrls: ['./page-not-found.component.scss']
})
export class PageNotFoundComponent implements OnInit {

  constructor(private router: Router, private pageService: PageService) { }

  ngOnInit() {
    setTimeout(() => {
      this.pageService.setBodyBGHeight('container', '');
    }, 0);
  }

  backToHome() {
    this.router.navigate(['restaurants']);
  }

}
