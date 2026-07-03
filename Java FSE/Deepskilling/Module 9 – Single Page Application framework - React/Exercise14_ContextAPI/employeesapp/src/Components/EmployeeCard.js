import { useContext } from "react";
import ThemeContext from "../ThemeContext";

function EmployeeCard(props) {

    const theme = useContext(ThemeContext);

    return (

        <div className="card">

            <h3>{props.employee.name}</h3>

            <p>{props.employee.designation}</p>

            <button className={theme}>
                View Profile
            </button>

        </div>

    );

}

export default EmployeeCard;