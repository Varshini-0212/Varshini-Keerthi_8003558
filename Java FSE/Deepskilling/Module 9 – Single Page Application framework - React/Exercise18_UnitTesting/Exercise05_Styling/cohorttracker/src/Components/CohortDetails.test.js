import { render, screen } from "@testing-library/react";
import CohortDetails from "./CohortDetails";

describe("Cohort Details Component", () => {

    test("should create the component", () => {

        render(<CohortDetails />);

        expect(screen.getByText(/Cohorts Details/i)).toBeInTheDocument();

    });

    test("should display cohort code", () => {

        render(<CohortDetails />);

        expect(screen.getByText("INTADMDF10")).toBeInTheDocument();

    });

    test("should display technology", () => {

        render(<CohortDetails />);

        expect(screen.getByText(".NET FSD")).toBeInTheDocument();

    });

    test("should match snapshot", () => {

        const { asFragment } = render(<CohortDetails />);

        expect(asFragment()).toMatchSnapshot();

    });

});