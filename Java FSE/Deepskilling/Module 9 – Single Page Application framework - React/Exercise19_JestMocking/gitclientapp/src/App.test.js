import { render, screen } from '@testing-library/react';
import App from './App';

test('renders Git repositories heading', () => {
  render(<App />);

  const heading = screen.getByText(/Git repositories of User - TechieSyed/i);

  expect(heading).toBeInTheDocument();
});