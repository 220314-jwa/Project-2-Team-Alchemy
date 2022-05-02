import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RestaurantListAndReviewComponent } from './restaurant-list-and-review.component';

describe('RestaurantListAndReviewComponent', () => {
  let component: RestaurantListAndReviewComponent;
  let fixture: ComponentFixture<RestaurantListAndReviewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RestaurantListAndReviewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RestaurantListAndReviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
