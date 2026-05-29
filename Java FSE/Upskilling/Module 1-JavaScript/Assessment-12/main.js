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

        // Loading Message

        message.innerText =
        "Submitting Registration...";

        // Simulate Delay

        setTimeout(() => {

            // Fetch POST Request

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

                console.log(data);

                message.innerText =

                "Registration Successful!";

                form.reset();

            })

            .catch(error => {

                console.log(error);

                message.innerText =

                "Registration Failed!";

            });

        }, 2000);

    }
);