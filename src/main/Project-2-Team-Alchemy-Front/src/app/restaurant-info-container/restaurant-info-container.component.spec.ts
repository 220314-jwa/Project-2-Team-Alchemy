import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RestaurantInfoContainerComponent } from './restaurant-info-container.component';

describe('RestaurantInfoContainerComponent', () => {
  let component: RestaurantInfoContainerComponent;
  let fixture: ComponentFixture<RestaurantInfoContainerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RestaurantInfoContainerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RestaurantInfoContainerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
