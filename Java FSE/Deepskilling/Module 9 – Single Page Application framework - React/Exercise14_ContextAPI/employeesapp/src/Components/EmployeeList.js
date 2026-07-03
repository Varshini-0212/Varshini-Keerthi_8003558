import EmployeeCard from "./EmployeeCard";

function EmployeeList() {

    const employees = [

        {
            id:1,
            name:"Varshini",
            designation:"Java Developer"
        },

        {
            id:2,
            name:"Rahul",
            designation:"React Developer"
        },

        {
            id:3,
            name:"Sneha",
            designation:"Spring Boot Developer"
        }

    ];

    return (

        <div>

            {

                employees.map(employee=>

                    <EmployeeCard

                        key={employee.id}

                        employee={employee}

                    />

                )

            }

        </div>

    );

}

export default EmployeeList;