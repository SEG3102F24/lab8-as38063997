import { Employee } from './employee';

describe('Employee', () => {
  it('should create an instance', () => {
    expect(new Employee("1", "andrew", new Date().toISOString(), "London", 1000)).toBeTruthy();
  });
});
