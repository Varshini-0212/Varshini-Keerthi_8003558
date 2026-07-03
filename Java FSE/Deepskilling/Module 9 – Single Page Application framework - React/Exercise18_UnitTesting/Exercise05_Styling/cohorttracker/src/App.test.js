import { render, screen } from '@testing-library/react';
import App from './App';

test('renders Cohorts Details heading', () => {
  render(<App />);
  const heading = screen.getByText(/Cohorts Details/i);
  expect(heading).toBeInTheDocument();
});