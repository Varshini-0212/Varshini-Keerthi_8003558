// DOM Elements

const form =

document.getElementById(
    "registrationForm"
);

const message =

document.getElementById(
    "message"
);

// Submit Event

form.addEventListener(
    "submit",
    function(event) {

        // Prevent Reload

        event.preventDefault();

        console.log(
            "Form Submission Started"
        );

        // User Data

        const userData = {

            name:
            document.getElementById(
                "name"
            ).value,

            email:
            document.getElementById(
                "email"
            ).value

        };

        // Debug Variable

        console.log(
            "User Data:",
            userData
        );

        // Validation

        if(

            userData.name === "" ||

            userData.email === ""

        ) {

            console.error(
                "Validation Failed"
            );

            message.innerText =
            "All fields are required";

            return;

        }

        // Fetch Request

        fetch(

            "https://jsonplaceholder.typicode.com/posts",

            {

                method: "POST",

                headers: {

                    "Content-Type":
                    "application/json"

                },

                body:
                JSON.stringify(userData)

            }

        )

        .then(response =>

            response.json()

        )

        .then(data => {

            console.log(
                "Server Response:",
                data
            );

            message.innerText =
            "Registration Successful";

        })

        .catch(error => {

            console.error(
                "Fetch Error:",
                error
            );

            message.innerText =
            "Registration Failed";

        });

    }
);