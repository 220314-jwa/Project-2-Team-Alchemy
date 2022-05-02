import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RestaurantReviewContainerComponent } from './restaurant-review-container.component';

describe('RestaurantReviewContainerComponent', () => {
  let component: RestaurantReviewContainerComponent;
  let fixture: ComponentFixture<RestaurantReviewContainerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RestaurantReviewContainerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RestaurantReviewContainerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
